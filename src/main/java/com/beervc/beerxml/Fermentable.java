package com.beervc.beerxml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName="FERMENTABLE")
public class Fermentable {

	private String name;
	private String version;
	private String type;
	private String amount;
	private String yield;
	private String color;
	private String addAfterBoil;
	private String origin;
	private String supplier;
	private String notes;
	private String coarseFineDiff;
	private String moisture;
	
}
