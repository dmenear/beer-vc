package com.beervc.beerxml;

import java.lang.reflect.Field;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.beervc.beerxml.annotations.BjcpRating;
import com.beervc.beerxml.annotations.Percentage;
import com.beervc.beerxml.annotations.Selection;
import com.beervc.beerxml.utils.BeerXmlUtils;

public abstract class BeerXmlElement {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@SuppressWarnings("unchecked")
	public void validateBeerXML() throws InvalidBeerXmlException {
		
		for(Field field : this.getClass().getDeclaredFields()) {
			field.setAccessible(true);
			Object fieldValue;
			
			try {
				fieldValue = field.get(this);
				if(fieldValue == null) {
					continue;
				} else if(fieldValue instanceof BeerXmlElement) {
					BeerXmlElement bxElement = (BeerXmlElement) fieldValue;
					bxElement.validateBeerXML();
				} else if(fieldValue instanceof List) {
					for(Object child : (List<Object>) fieldValue) {
						if(child instanceof BeerXmlElement) {
							((BeerXmlElement) child).validateBeerXML();
						}
					}
				}
			} catch (IllegalArgumentException | IllegalAccessException e) {
				logger.error("Failed to access field!", e);
			}
			if(field.isAnnotationPresent(Percentage.class)) {
				try {
					Double percentageValue = Double.parseDouble(((String) field.get(this)).replace("%", ""));
					Percentage percentageAnnotation = field.getAnnotation(Percentage.class);
					BeerXmlUtils.validatePercentage(percentageValue, percentageAnnotation.friendlyName(),
							percentageAnnotation.tag());
				} catch (IllegalArgumentException | IllegalAccessException e) {
					logger.error("Failed to validate percentage field!", e);
				} catch(ClassCastException e) {
					logger.error("Non-Double field marked as percentage!", e);
				}
			} else if(field.isAnnotationPresent(BjcpRating.class)) {
				try {
					Double bjcpValue = Double.parseDouble(((String) field.get(this)));
					BjcpRating bjcpRatingAnnotation = field.getAnnotation(BjcpRating.class);
					BeerXmlUtils.validateBjcpRating(bjcpValue, bjcpRatingAnnotation.friendlyName(),
							bjcpRatingAnnotation.tag());
				} catch (IllegalArgumentException | IllegalAccessException e) {
					logger.error("Failed to validate BJCP Rating field!", e);
				} catch(ClassCastException e) {
					logger.error("Non-Double field marked as BJCP Rating!", e);
				}
			} else if(field.isAnnotationPresent(Selection.class)) {
				try {
					String selectedValue = (String) field.get(this);
					Selection selectionAnnotation = field.getAnnotation(Selection.class);
					
					boolean validValue = false;
					for(String option : selectionAnnotation.options()) {
						if(selectedValue.equalsIgnoreCase(option)) {
							validValue = true;
							break;
						}
					}
					if(validValue) {
						continue;
					}
					throw new InvalidBeerXmlException(
							String.format("%s (%s) must be one of the following: %s (Found: %s)",
									selectionAnnotation.friendlyName(), selectionAnnotation.tag(),
									String.join(", ", selectionAnnotation.options()), selectedValue));
				} catch (IllegalArgumentException | IllegalAccessException e) {
					logger.error("Failed to validate Selection field!", e);
				} catch(ClassCastException e) {
					logger.error("Non-String field marked as Selection!", e);
				}
			}
		}
		
	}
	
}
