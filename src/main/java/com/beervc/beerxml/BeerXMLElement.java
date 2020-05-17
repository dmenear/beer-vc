package com.beervc.beerxml;

import java.lang.reflect.Field;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.beervc.beerxml.annotations.BjcpRating;
import com.beervc.beerxml.annotations.Percentage;
import com.beervc.beerxml.annotations.Selection;
import com.beervc.beerxml.utils.BeerXmlUtils;

public abstract class BeerXMLElement {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public void validateBeerXML() throws InvalidBeerXmlException {
		
		for(Field field : this.getClass().getDeclaredFields()) {
			try {
				if(field.get(this) == null) {
					return;
				}
			} catch (IllegalArgumentException | IllegalAccessException e) {
				logger.error("Failed to access field!", e);
			}
			
			if(field.isAnnotationPresent(Percentage.class)) {
				try {
					Double percentageValue = (Double) field.get(this);
					Percentage percentageAnnotation = field.getAnnotation(Percentage.class);
					BeerXmlUtils.validatePercentage(percentageValue, percentageAnnotation.friendlyName(),
							percentageAnnotation.tag());
				} catch (IllegalArgumentException | IllegalAccessException e) {
					logger.error("Failed to validate percentage field!", e);
				} catch(ClassCastException e) {
					logger.error("Non-Double field marked as percentage!", e);
				}
			}else if(field.isAnnotationPresent(BjcpRating.class)) {
				try {
					Double bjcpValue = (Double) field.get(this);
					BjcpRating bjcpRatingAnnotation = field.getAnnotation(BjcpRating.class);
					BeerXmlUtils.validateBjcpRating(bjcpValue, bjcpRatingAnnotation.friendlyName(),
							bjcpRatingAnnotation.tag());
				} catch (IllegalArgumentException | IllegalAccessException e) {
					logger.error("Failed to validate BJCP Rating field!", e);
				} catch(ClassCastException e) {
					logger.error("Non-Double field marked as BJCP Rating!", e);
				}
			}else if(field.isAnnotationPresent(Selection.class)) {
				try {
					String selectedValue = (String) field.get(this);
					Selection selectionAnnotation = field.getAnnotation(Selection.class);
					for(String option : selectionAnnotation.options()) {
						if(selectedValue.equalsIgnoreCase(option)) {
							return;
						}
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
