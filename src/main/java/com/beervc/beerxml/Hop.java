package com.beervc.beerxml;

import com.beervc.beerxml.annotations.Percentage;
import com.beervc.beerxml.annotations.Selection;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
@JacksonXmlRootElement(localName="HOP")
@Getter
@Setter
public class Hop extends BeerXmlElement {

	@JacksonXmlProperty(localName="NAME")
	private String name;
	
	@JacksonXmlProperty(localName="VERSION")
	private String version;
	
	@Percentage(friendlyName="Alpha", tag="HOP/ALPHA")
	@JacksonXmlProperty(localName="ALPHA")
	private String alpha;
	
	@JacksonXmlProperty(localName="AMOUNT")
	private String amount;
	
	@Selection(options={ "BOIL", "DRY HOP", "MASH", "FIRST WORT", "AROMA" },
			friendlyName="Hop Use", tag="HOP/USE")
	@JacksonXmlProperty(localName="USE")
	private String use;
	
	@JacksonXmlProperty(localName="TIME")
	private String time;
	
	@JacksonXmlProperty(localName="NOTES")
	private String notes;
	
	@Selection(options={ "BITTERING", "AROMA", "BOTH" }, friendlyName="Hop Type", tag="HOP/TYPE")
	@JacksonXmlProperty(localName="TYPE")
	private String type;
	
	@Selection(options={ "PELLET", "PLUG", "LEAF" }, friendlyName="Hop Form", tag="HOP/FORM")
	@JacksonXmlProperty(localName="FORM")
	private String form;
	
	@Percentage(friendlyName="Beta", tag="HOP/BETA")
	@JacksonXmlProperty(localName="BETA")
	private String beta;
	
	@Percentage(friendlyName="HSI", tag="HOP/HSI")
	@JacksonXmlProperty(localName="HSI")
	private String hsi;
	
	@JacksonXmlProperty(localName="ORIGIN")
	private String origin;
	
	@JacksonXmlProperty(localName="SUBSTITUTES")
	private String substitutes;
	
	@Percentage(friendlyName="Humulene", tag="HOP/HUMULENE")
	@JacksonXmlProperty(localName="HUMULENE")
	private String humulene;
	
	@Percentage(friendlyName="Caryophyllene", tag="HOP/CARYOPHYLLENE")
	@JacksonXmlProperty(localName="CARYOPHYLLENE")
	private String caryophyllene;
	
	@Percentage(friendlyName="Cohumulone", tag="HOP/COHUMULONE")
	@JacksonXmlProperty(localName="COHUMULONE")
	private String cohumulone;
	
	@Percentage(friendlyName="Myrcene", tag="HOP/MYRCENE")
	@JacksonXmlProperty(localName="MYRCENE")
	private String myrcene;
	
	@JacksonXmlProperty(localName="DISPLAY_AMOUNT")
	private String displayAmount;
	
	@JacksonXmlProperty(localName="INVENTORY")
	private String inventory;
	
	@JacksonXmlProperty(localName="DISPLAY_TIME")
	private String displayTime;
	
}
