package com.beervc.beerxml.utils;

import java.util.List;

import com.beervc.beerxml.InvalidBeerXmlException;

public class BeerXmlUtils {

	public static String validateRecipeType(String recipeType, String friendlyName, String xPath) {
		return validateOption(BeerXmlConstants.ALLOWED_RECIPE_TYPES, recipeType, friendlyName, xPath);
	}
	
	public static String validateIbuMethod(String ibuMethod, String friendlyName, String xPath) {
		return validateOption(BeerXmlConstants.ALLOWED_IBU_METHODS, ibuMethod, friendlyName, xPath);
	}
	
	public static String validateHopUse(String hopUse, String friendlyName, String xPath) {
		return validateOption(BeerXmlConstants.ALLOWED_HOP_USES, hopUse, friendlyName, xPath);
	}
	
	public static String validateHopType(String hopType, String friendlyName, String xPath) {
		return validateOption(BeerXmlConstants.ALLOWED_HOP_TYPES, hopType, friendlyName, xPath);
	}
	
	public static String validateHopForm(String hopForm, String friendlyName, String xPath) {
		return validateOption(BeerXmlConstants.ALLOWED_HOP_FORMS, hopForm, friendlyName, xPath);
	}
	
	public static String validateOption(List<String> validOptions, String value, String friendlyName, String xPath) {
		if(validOptions.contains(value.toUpperCase())) {
			return value;
		} else {
			throw new InvalidBeerXmlException(String.format("%s (%s) must be one of the following: %s (Found: %s)",
					friendlyName, xPath, String.join(", ", validOptions), value));
		}
	}
	
	public static Double validatePercentage(double percentage, String friendlyName, String tagName) {
		return validateRange(0.0, 100.0, percentage, friendlyName, tagName);
	}
	
	public static Double validateBjcpRating(double rating, String friendlyName, String tagName) {
		return validateRange(0.0, 50.0, rating, friendlyName, tagName);
	}
	
	public static Double validateRange(double lowerBound, double upperBound, double value, String friendlyName, String tagName) {
		if(value >= lowerBound && value <= upperBound) {
			return value;
		} else {
			throw new InvalidBeerXmlException(
					String.format("%s (%s) must fall between %f and %f", friendlyName, tagName, lowerBound, upperBound));
		}
	}
	
}
