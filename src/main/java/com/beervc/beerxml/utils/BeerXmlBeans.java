package com.beervc.beerxml.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

@Configuration
public class BeerXmlBeans {

	@Bean
	public XmlMapper beerXmlMapper() {
		XmlMapper beerXmlMapper = new XmlMapper();
		beerXmlMapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
		return beerXmlMapper;
	}
	
}
