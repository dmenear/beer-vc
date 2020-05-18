package com.beervc.beerxml;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Getter;
import lombok.Setter;

@JacksonXmlRootElement(localName="WATERS")
public class Waters extends BeerXmlElement {

	@JacksonXmlElementWrapper(useWrapping=false)
	@JacksonXmlProperty(localName="WATER")
	@Getter @Setter
	private List<Water> waters;
	
}
