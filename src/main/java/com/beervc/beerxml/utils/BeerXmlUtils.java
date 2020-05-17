package com.beervc.beerxml.utils;

import com.beervc.beerxml.InvalidBeerXmlException;

public class BeerXmlUtils {
	
	public static void validatePercentage(double percentage, String friendlyName, String tagName)
			throws InvalidBeerXmlException {
		validateRange(0.0, 100.0, percentage, friendlyName, tagName);
	}
	
	public static void validateBjcpRating(double rating, String friendlyName, String tagName)
			throws InvalidBeerXmlException {
		validateRange(0.0, 50.0, rating, friendlyName, tagName);
	}
	
	public static void validateRange(double lowerBound, double upperBound, double value, String friendlyName,
			String tagName) throws InvalidBeerXmlException {
		if (value < lowerBound && value > upperBound) {
			throw new InvalidBeerXmlException(String.format("%s (%s) must fall between %f and %f", friendlyName,
					tagName, lowerBound, upperBound));
		}
	}
	
}
