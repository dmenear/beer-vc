package com.beervc.beerxml;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Getter;
import lombok.Setter;

@JacksonXmlRootElement(localName="FERMENTABLES")
public class Fermentables extends BeerXmlElement {

	@JacksonXmlElementWrapper(useWrapping=false)
	@JacksonXmlProperty(localName="FERMENTABLE")
	@Getter @Setter
	private List<Fermentable> fermentables;
	
}
