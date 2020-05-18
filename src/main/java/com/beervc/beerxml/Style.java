package com.beervc.beerxml;

import com.beervc.beerxml.annotations.Percentage;
import com.beervc.beerxml.annotations.Selection;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
@JacksonXmlRootElement(localName="STYLE")
@Getter
@Setter
public class Style extends BeerXmlElement {

	@JacksonXmlProperty(localName="NAME")
	private String name;
	
	@JacksonXmlProperty(localName="CATEGORY")
	private String category;
	
	@JacksonXmlProperty(localName="VERSION")
	private String version;
	
	@JacksonXmlProperty(localName="CATEGORY_NUMBER")
	private String categoryNumber;
	
	@JacksonXmlProperty(localName="STYLE_LETTER")
	private String styleLetter;
	
	@JacksonXmlProperty(localName="STYLE_GUIDE")
	private String styleGuide;
	
	@Selection(options={ "LAGER", "ALE", "MEAD", "WHEAT", "MIXED", "CIDER" },
			friendlyName="Style Type", tag="STYLE/TYPE")
	@JacksonXmlProperty(localName="TYPE")
	private String type;
	
	@JacksonXmlProperty(localName="OG_MIN")
	private String ogMin;
	
	@JacksonXmlProperty(localName="OG_MAX")
	private String ogMax;
	
	@JacksonXmlProperty(localName="FG_MIN")
	private String fgMin;
	
	@JacksonXmlProperty(localName="FG_MAX")
	private String fgMax;
	
	@JacksonXmlProperty(localName="IBU_MIN")
	private String ibuMin;
	
	@JacksonXmlProperty(localName="IBU_MAX")
	private String ibuMax;
	
	@JacksonXmlProperty(localName="COLOR_MIN")
	private String colorMin;
	
	@JacksonXmlProperty(localName="COLOR_MAX")
	private String colorMax;
	
	@JacksonXmlProperty(localName="CARB_MIN")
	private String carbMin;
	
	@JacksonXmlProperty(localName="CARB_MAX")
	private String carbMax;
	
	@Percentage(friendlyName="ABV Minimum", tag="STYLE/ABV_MIN")
	@JacksonXmlProperty(localName="ABV_MIN")
	private String abvMin;
	
	@Percentage(friendlyName="ABV Maximum", tag="STYLE/ABV_MAX")
	@JacksonXmlProperty(localName="ABV_MAX")
	private String abvMax;
	
	@JacksonXmlProperty(localName="NOTES")
	private String notes;
	
	@JacksonXmlProperty(localName="PROFILE")
	private String profile;
	
	@JacksonXmlProperty(localName="INGREDIENTS")
	private String ingredients;
	
	@JacksonXmlProperty(localName="EXAMPLES")
	private String examples;
	
	@JacksonXmlProperty(localName="DISPLAY_OG_MIN")
	private String displayOgMin;
	
	@JacksonXmlProperty(localName="DISPLAY_OG_MAX")
	private String displayOgMax;
	
	@JacksonXmlProperty(localName="DISPLAY_FG_MIN")
	private String displayFgMin;
	
	@JacksonXmlProperty(localName="DISPLAY_FG_MAX")
	private String displayFgMax;
	
	@JacksonXmlProperty(localName="DISPLAY_COLOR_MIN")
	private String displayColorMin;
	
	@JacksonXmlProperty(localName="DISPLAY_COLOR_MAX")
	private String displayColorMax;
	
	@JacksonXmlProperty(localName="OG_RANGE")
	private String ogRange;
	
	@JacksonXmlProperty(localName="FG_RANGE")
	private String fgRange;
	
	@JacksonXmlProperty(localName="IBU_RANGE")
	private String ibuRange;
	
	@JacksonXmlProperty(localName="CARB_RANGE")
	private String carbRange;
	
	@JacksonXmlProperty(localName="COLOR_RANGE")
	private String colorRange;
	
	@JacksonXmlProperty(localName="ABV_RANGE")
	private String abvRange;
	
}
