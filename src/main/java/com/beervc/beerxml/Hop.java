package com.beervc.beerxml;

import com.beervc.beerxml.annotations.Percentage;
import com.beervc.beerxml.annotations.Selection;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Getter;
import lombok.Setter;

@JacksonXmlRootElement(localName="HOP")
public class Hop {

	@JacksonXmlProperty(localName="NAME")
	@Getter @Setter
	private String name;
	
	@JacksonXmlProperty(localName="VERSION")
	@Getter @Setter
	private Integer version;
	
	@Percentage(friendlyName="Alpha", tag="HOP/ALPHA")
	@JacksonXmlProperty(localName="ALPHA")
	@Getter @Setter
	private Double alpha;
	
	@JacksonXmlProperty(localName="AMOUNT")
	@Getter @Setter
	private Double amount;
	
	@Selection(options={ "BOIL", "DRY HOP", "MASH", "FIRST WORT", "AROMA" },
			friendlyName="Hop Use", tag="HOP/USE")
	@JacksonXmlProperty(localName="USE")
	@Getter @Setter
	private String use;
	
	@JacksonXmlProperty(localName="TIME")
	@Getter @Setter
	private Double time;
	
	@JacksonXmlProperty(localName="NOTES")
	@Getter @Setter
	private String notes;
	
	@Selection(options={ "BITTERING", "AROMA", "BOTH" }, friendlyName="Hop Type", tag="HOP/TYPE")
	@JacksonXmlProperty(localName="TYPE")
	@Getter @Setter
	private String type;
	
	@Selection(options={ "PELLET", "PLUG", "LEAF" }, friendlyName="Hop Form", tag="HOP/FORM")
	@JacksonXmlProperty(localName="FORM")
	@Getter @Setter
	private String form;
	
	@Percentage(friendlyName="Beta", tag="HOP/BETA")
	@JacksonXmlProperty(localName="BETA")
	@Getter @Setter
	private Double beta;
	
	@Percentage(friendlyName="HSI", tag="HOP/HSI")
	@JacksonXmlProperty(localName="HSI")
	@Getter @Setter
	private Double hsi;
	
	@JacksonXmlProperty(localName="ORIGIN")
	@Getter @Setter
	private String origin;
	
	@JacksonXmlProperty(localName="SUBSTITUTES")
	@Getter @Setter
	private String substitutes;
	
	@Percentage(friendlyName="Humulene", tag="HOP/HUMULENE")
	@JacksonXmlProperty(localName="HUMULENE")
	@Getter @Setter
	private Double humulene;
	
	@Percentage(friendlyName="Caryophyllene", tag="HOP/CARYOPHYLLENE")
	@JacksonXmlProperty(localName="CARYOPHYLLENE")
	@Getter @Setter
	private Double caryophyllene;
	
	@Percentage(friendlyName="Cohumulone", tag="HOP/COHUMULONE")
	@JacksonXmlProperty(localName="COHUMULONE")
	@Getter @Setter
	private Double cohumulone;
	
	@Percentage(friendlyName="Myrcene", tag="HOP/MYRCENE")
	@JacksonXmlProperty(localName="MYRCENE")
	@Getter @Setter
	private Double myrcene;
	
	@JacksonXmlProperty(localName="DISPLAY_AMOUNT")
	@Getter @Setter
	private String displayAmount;
	
	@JacksonXmlProperty(localName="INVENTORY")
	@Getter @Setter
	private String inventory;
	
	@JacksonXmlProperty(localName="DISPLAY_TIME")
	@Getter @Setter
	private String displayTime;
	
}
