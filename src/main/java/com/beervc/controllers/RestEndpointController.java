package com.beervc.controllers;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beervc.beerxml.Recipes;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

@RestController
public class RestEndpointController {
	
	Logger logger = LoggerFactory.getLogger(getClass());

	@GetMapping("/sample")
	public Recipes sampleRecipes() {
		XmlMapper mapper = new XmlMapper();
		Resource sampleXmlResource = new ClassPathResource("sample_recipes.xml");
		Recipes sampleRecipes;
		try {
			sampleRecipes = mapper.readValue(sampleXmlResource.getFile(), Recipes.class);
		} catch (IOException e) {
			logger.error("Failed to parse BeerXML sample file!", e);
			return null;
		}
		return sampleRecipes;
	}
	
}
