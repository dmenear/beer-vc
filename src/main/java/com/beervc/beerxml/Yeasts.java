package com.beervc.beerxml;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Getter;
import lombok.Setter;

@JacksonXmlRootElement(localName="YEASTS")
public class Yeasts extends BeerXmlElement {

	@JacksonXmlElementWrapper(useWrapping=false)
	@JacksonXmlProperty(localName="YEAST")
	@Getter @Setter
	private List<Yeast> yeasts;
	
}
