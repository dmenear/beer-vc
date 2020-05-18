package com.beervc.beerxml;

import com.beervc.beerxml.annotations.Percentage;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
@JacksonXmlRootElement(localName="EQUIPMENT")
@Getter
@Setter
public class Equipment extends BeerXmlElement {
	
	@JacksonXmlProperty(localName="NAME")
	private String name;
	
	@JacksonXmlProperty(localName="VERSION")
	private String version;
	
	@JacksonXmlProperty(localName="BOIL_SIZE")
	private String boilSize;
	
	@JacksonXmlProperty(localName="BATCH_SIZE")
	private String batchSize;
	
	@JacksonXmlProperty(localName="TUN_VOLUME")
	private String tunVolume;
	
	@JacksonXmlProperty(localName="TUN_WEIGHT")
	private String tunWeight;
	
	@JacksonXmlProperty(localName="TUN_SPECIFIC_HEAT")
	private String tunSpecificHeat;
	
	@JacksonXmlProperty(localName="TOP_UP_WATER")
	private String topUpWater;
	
	@JacksonXmlProperty(localName="TRUB_CHILLER_LOSS")
	private String trubChillerLoss;
	
	@JacksonXmlProperty(localName="EVAP_RATE")
	private String evapRate;
	
	@JacksonXmlProperty(localName="BOIL_TIME")
	private String boilTime;
	
	@JacksonXmlProperty(localName="CALC_BOIL_VOLUME")
	private String calcBoilVolume;
	
	@JacksonXmlProperty(localName="LAUTER_DEADSPACE")
	private String lauterDeadspace;
	
	@JacksonXmlProperty(localName="TOP_UP_KETTLE")
	private String topUpKettle;
	
	@Percentage(friendlyName="Hop Utilization", tag="EQUIPMENT/HOP_UTILIZATION")
	@JacksonXmlProperty(localName="HOP_UTILIZATION")
	private String hopUtilization;
	
	@JacksonXmlProperty(localName="NOTES")
	private String notes;
	
	@JacksonXmlProperty(localName="DISPLAY_BOIL_SIZE")
	private String displayBoilSize;
	
	@JacksonXmlProperty(localName="DISPLAY_BATCH_SIZE")
	private String displayBatchSize;
	
	@JacksonXmlProperty(localName="DISPLAY_TUN_VOLUME")
	private String displayTunVolume;
	
	@JacksonXmlProperty(localName="DISPLAY_TUN_WEIGHT")
	private String displayTunWeight;
	
	@JacksonXmlProperty(localName="DISPLAY_TOP_UP_WATER")
	private String displayTopUpWater;
	
	@JacksonXmlProperty(localName="DISPLAY_TRUB_CHILLER_LOSS")
	private String displayTrubChillerLoss;
	
	@JacksonXmlProperty(localName="DISPLAY_LAUTER_DEADSPACE")
	private String displayLauterDeadspace;
	
	@JacksonXmlProperty(localName="DISPLAY_TOP_UP_KETTLE")
	private String displayTopUpKettle;
		
}
