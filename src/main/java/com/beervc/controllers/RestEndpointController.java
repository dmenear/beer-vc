package com.beervc.controllers;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beervc.beerxml.InvalidBeerXmlException;
import com.beervc.beerxml.Recipes;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

@RestController
public class RestEndpointController {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	private XmlMapper beerXmlMapper;
	
	@Autowired
	public void setBeerXmlMapper(XmlMapper beerXmlMapper) {
		this.beerXmlMapper = beerXmlMapper;
	}

	@GetMapping("/sample")
	public Recipes sampleRecipes() {
		
		Resource sampleXmlResource = new ClassPathResource("sample_recipes.xml");
		Recipes sampleRecipes;
		try {
			sampleRecipes = beerXmlMapper.readValue(sampleXmlResource.getFile(), Recipes.class);
			sampleRecipes.validateBeerXML();
		} catch (IOException e) {
			logger.error("Failed to parse BeerXML sample file!", e);
			return null;
		} catch (InvalidBeerXmlException e) {
			logger.error("Failed to validate sample file!", e);
			return null;
		}
		return sampleRecipes;
	}
	
}
