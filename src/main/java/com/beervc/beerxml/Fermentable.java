package com.beervc.beerxml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName="FERMENTABLE")
public class Fermentable {

	private String name;
	private Integer version;
	private String type;
	private Double amount;
	private Double yield;
	private Double color;
	private Boolean addAfterBoil;
	private String origin;
	private String supplier;
	private String notes;
	private Double coarseFineDiff;
	private Double moisture;
	
}
