package com.beervc.beerxml;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
@JacksonXmlRootElement(localName="MASH")
@Getter
@Setter
public class Mash extends BeerXmlElement {

	@JacksonXmlProperty(localName="NAME")
	private String name;
	
	@JacksonXmlProperty(localName="VERSION")
	private String version;
	
	@JacksonXmlProperty(localName="GRAIN_TEMP")
	private String grainTemp;
	
	@JacksonXmlElementWrapper(localName="MASH_STEPS")
	@JacksonXmlProperty(localName="MASH_STEP")
	private List<MashStep> mashSteps;
	
	@JacksonXmlProperty(localName="NOTES")
	private String notes;
	
	@JacksonXmlProperty(localName="TUN_TEMP")
	private String tunTemp;
	
	@JacksonXmlProperty(localName="SPARGE_TEMP")
	private String spargeTemp;
	
	@JacksonXmlProperty(localName="PH")
	private String ph;
	
	@JacksonXmlProperty(localName="TUN_WEIGHT")
	private String tunWeight;
	
	@JacksonXmlProperty(localName="TUN_SPECIFIC_HEAT")
	private String tunSpecificHeat;
	
	@JacksonXmlProperty(localName="EQUIP_ADJUST")
	private String equipAdjust;
	
	@JacksonXmlProperty(localName="DISPLAY_GRAIN_TEMP")
	private String displayGrainTemp;
	
	@JacksonXmlProperty(localName="DISPLAY_TUN_TEMP")
	private String displayTunTemp;
	
	@JacksonXmlProperty(localName="DISPLAY_SPARGE_TEMP")
	private String displaySpargeTemp;
	
	@JacksonXmlProperty(localName="DISPLAY_TUN_WEIGHT")
	private String displayTunWeight;
	
}
