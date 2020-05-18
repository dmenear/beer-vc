package com.beervc.beerxml;

import com.beervc.beerxml.annotations.Selection;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
@JacksonXmlRootElement(localName="MISC")
@Getter
@Setter
public class Misc extends BeerXmlElement {

	@JacksonXmlProperty(localName="NAME")
	private String name;
	
	@JacksonXmlProperty(localName="VERSION")
	private String version;
	
	@Selection(options={ "SPICE", "FINING", "WATER AGENT", "HERB", "FLAVOR", "OTHER" },
			friendlyName="Misc Type", tag="MISC/TYPE")
	@JacksonXmlProperty(localName="TYPE")
	private String type;
	
	@Selection(options={ "BOIL", "MASH", "PRIMARY", "SECONDARY", "BOTTLING" },
			friendlyName="Misc Use", tag="MISC/USE")
	@JacksonXmlProperty(localName="USE")
	private String use;
	
	@JacksonXmlProperty(localName="TIME")
	private String time;
	
	@JacksonXmlProperty(localName="AMOUNT")
	private String amount;
	
	@JacksonXmlProperty(localName="AMOUNT_IS_WEIGHT")
	private String amountIsWeight;
	
	@JacksonXmlProperty(localName="USE_FOR")
	private String useFor;
	
	@JacksonXmlProperty(localName="NOTES")
	private String notes;
	
	@JacksonXmlProperty(localName="DISPLAY_AMOUNT")
	private String displayAmount;
	
	@JacksonXmlProperty(localName="INVENTORY")
	private String inventory;
	
	@JacksonXmlProperty(localName="DISPLAY_TIME")
	private String displayTime;
	
}
