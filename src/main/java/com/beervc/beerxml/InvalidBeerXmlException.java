package com.beervc.beerxml;

@SuppressWarnings("serial")
public class InvalidBeerXmlException extends RuntimeException {

	public InvalidBeerXmlException() {
		super();
	}

	public InvalidBeerXmlException(String message) {
		super(message);
	}
	
}
