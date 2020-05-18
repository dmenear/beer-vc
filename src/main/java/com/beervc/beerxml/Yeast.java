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
@JacksonXmlRootElement(localName="YEAST")
@Getter
@Setter
public class Yeast extends BeerXmlElement {

	@JacksonXmlProperty(localName="NAME")
	private String name;
	
	@JacksonXmlProperty(localName="VERSION")
	private String version;
	
	@Selection(options={ "ALE", "LAGER", "WHEAT", "WINE", "CHAMPAGNE" },
			friendlyName="Yeast Type", tag="YEAST/TYPE")
	@JacksonXmlProperty(localName="TYPE")
	private String type;
	
	@Selection(options={ "LIQUID", "DRY", "SLANT", "CULTURE" },
			friendlyName="Yeast Form", tag="YEAST/FORM")
	@JacksonXmlProperty(localName="FORM")
	private String form;
	
	@JacksonXmlProperty(localName="AMOUNT")
	private String amount;
	
	@JacksonXmlProperty(localName="AMOUNT_IS_WEIGHT")
	private String amountIsWeight;
	
	@JacksonXmlProperty(localName="LABORATORY")
	private String laboratory;
	
	@JacksonXmlProperty(localName="PRODUCT_ID")
	private String productId;
	
	@JacksonXmlProperty(localName="MIN_TEMPERATURE")
	private String minTemperature;
	
	@JacksonXmlProperty(localName="MAX_TEMPERATURE")
	private String maxTemperature;
	
	@Selection(options={ "LOW", "MEDIUM", "HIGH", "VERY HIGH" },
			friendlyName="Flocculation", tag="YEAST/FLOCCULATION")
	@JacksonXmlProperty(localName="FLOCCULATION")
	private String flocculation;
	
	@Percentage(friendlyName="Attenuation", tag="YEAST/ATTENUATION")
	@JacksonXmlProperty(localName="ATTENUATION")
	private String attenuation;
	
	@JacksonXmlProperty(localName="NOTES")
	private String notes;
	
	@JacksonXmlProperty(localName="BEST_FOR")
	private String bestFor;
	
	@JacksonXmlProperty(localName="TIMES_CULTURED")
	private String timesCultured;
	
	@JacksonXmlProperty(localName="MAX_REUSE")
	private String maxReuse;
	
	@JacksonXmlProperty(localName="ADD_TO_SECONDARY")
	private String addToSecondary;
	
	@JacksonXmlProperty(localName="DISPLAY_AMOUNT")
	private String displayAmount;
	
	@JacksonXmlProperty(localName="DISP_MIN_TEMP")
	private String dispMinTemp;
	
	@JacksonXmlProperty(localName="DISP_MAX_TEMP")
	private String dispMaxTemp;
	
	@JacksonXmlProperty(localName="INVENTORY")
	private String inventory;
	
	@JacksonXmlProperty(localName="CULTURE_DATE")
	private String cultureDate;
	
}
