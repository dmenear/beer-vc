package com.beervc.beerxml;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Getter;
import lombok.Setter;

@JacksonXmlRootElement(localName="HOPS")
public class Hops extends BeerXmlElement {

	@JacksonXmlElementWrapper(useWrapping=false)
	@JacksonXmlProperty(localName="HOP")
	@Getter @Setter
	private List<Hop> hops;
	
}
