package com.beervc.beerxml;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
@JacksonXmlRootElement(localName="WATER")
@Getter
@Setter
public class Water extends BeerXmlElement {

	@JacksonXmlProperty(localName="NAME")
	private String name;
	
	@JacksonXmlProperty(localName="VERSION")
	private String version;
	
	@JacksonXmlProperty(localName="AMOUNT")
	private String amount;
	
	@JacksonXmlProperty(localName="CALCIUM")
	private String calcium;
	
	@JacksonXmlProperty(localName="BICARBONATE")
	private String bicarbonate;
	
	@JacksonXmlProperty(localName="SULFATE")
	private String sulfate;
	
	@JacksonXmlProperty(localName="CHLORIDE")
	private String chloride;
	
	@JacksonXmlProperty(localName="SODIUM")
	private String sodium;
	
	@JacksonXmlProperty(localName="MAGNESIUM")
	private String magnesium;
	
	@JacksonXmlProperty(localName="PH")
	private String ph;
	
	@JacksonXmlProperty(localName="NOTES")
	private String notes;
	
	@JacksonXmlProperty(localName="DISPLAY_AMOUNT")
	private String displayAmount;
	
}
