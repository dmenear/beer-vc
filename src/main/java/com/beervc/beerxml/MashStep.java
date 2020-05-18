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
@JacksonXmlRootElement(localName="MASH_STEP")
@Getter
@Setter
public class MashStep extends BeerXmlElement {
	
	@JacksonXmlProperty(localName="NAME")
	private String name;
	
	@JacksonXmlProperty(localName="VERSION")
	private String version;
	
	@Selection(options={ "INFUSION", "TEMPERATURE", "DECOCTION" },
			friendlyName="Mash Step Type", tag="MASH_STEP/TYPE")
	@JacksonXmlProperty(localName="TYPE")
	private String type;
	
	@JacksonXmlProperty(localName="INFUSE_AMOUNT")
	private String infuseAmount;
	
	@JacksonXmlProperty(localName="STEP_TEMP")
	private String stepTemp;
	
	@JacksonXmlProperty(localName="STEP_TIME")
	private String stepTime;
	
	@JacksonXmlProperty(localName="RAMP_TIME")
	private String rampTime;
	
	@JacksonXmlProperty(localName="END_TEMP")
	private String endTemp;
	
	@JacksonXmlProperty(localName="DESCRIPTION")
	private String description;
	
	@JacksonXmlProperty(localName="WATER_GRAIN_RATIO")
	private String waterGrainRatio;
	
	@JacksonXmlProperty(localName="DECOCTION_AMT")
	private String decoctionAmt;
	
	@JacksonXmlProperty(localName="INFUSE_TEMP")
	private String infuseTemp;
	
	@JacksonXmlProperty(localName="DISPLAY_STEP_TEMP")
	private String displayStepTemp;
	
	@JacksonXmlProperty(localName="DISPLAY_INFUSE_AMT")
	private String displayInfuseAmt;
	
}
