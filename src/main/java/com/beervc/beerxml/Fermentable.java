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
@JacksonXmlRootElement(localName="FERMENTABLE")
@Getter
@Setter
public class Fermentable extends BeerXmlElement {

	@JacksonXmlProperty(localName="NAME")
	private String name;
	
	@JacksonXmlProperty(localName="VERSION")
	private String version;
	
	@Selection(options={ "GRAIN", "SUGAR", "EXTRACT", "DRY EXTRACT", "ADJUNCT" },
			friendlyName="Fermentable Type", tag="FERMENTABLE/TYPE")
	@JacksonXmlProperty(localName="TYPE")
	private String type;
	
	@JacksonXmlProperty(localName="AMOUNT")
	private String amount;
	
	@Percentage(friendlyName="Yield", tag="FERMENTABLE/YIELD")
	@JacksonXmlProperty(localName="YIELD")
	private String yield;
	
	@JacksonXmlProperty(localName="COLOR")
	private String color;
	
	@JacksonXmlProperty(localName="ADD_AFTER_BOIL")
	private String addAfterBoil;
	
	@JacksonXmlProperty(localName="ORIGIN")
	private String origin;
	
	@JacksonXmlProperty(localName="SUPPLIER")
	private String supplier;
	
	@JacksonXmlProperty(localName="NOTES")
	private String notes;
	
	@Percentage(friendlyName="Coarse/Fine Difference", tag="FERMENTABLE/COARSE_FINE_DIFF")
	@JacksonXmlProperty(localName="COARSE_FINE_DIFF")
	private String coarseFineDiff;
	
	@Percentage(friendlyName="Moisture", tag="FERMENTABLE/MOISTURE")
	@JacksonXmlProperty(localName="MOISTURE")
	private String moisture;
	
	@JacksonXmlProperty(localName="DIASTATIC_POWER")
	private String diastaticPower;
	
	@Percentage(friendlyName="Protein", tag="FERMENTABLE/PROTEIN")
	@JacksonXmlProperty(localName="PROTEIN")
	private String protein;
	
	@Percentage(friendlyName="Max in Batch", tag="FERMENTABLE/MAX_IN_BATCH")
	@JacksonXmlProperty(localName="MAX_IN_BATCH")
	private String maxInBatch;
	
	@JacksonXmlProperty(localName="RECOMMEND_MASH")
	private String recommendMash;
	
	@JacksonXmlProperty(localName="IBU_GAL_PER_LB")
	private String ibuGalPerLb;
	
	@JacksonXmlProperty(localName="DISPLAY_AMOUNT")
	private String displayAmount;
	
	@JacksonXmlProperty(localName="POTENTIAL")
	private String potential;
	
	@JacksonXmlProperty(localName="INVENTORY")
	private String inventory;
	
	@JacksonXmlProperty(localName="DISPLAY_COLOR")
	private String displayColor;
}
