package com.beervc.beerxml;


import com.beervc.beerxml.annotations.BjcpRating;
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
@JacksonXmlRootElement(localName="RECIPE")
@Getter
@Setter
public class Recipe extends BeerXmlElement {
	
	@JacksonXmlProperty(localName="NAME")
	private String name;
	
	@JacksonXmlProperty(localName="VERSION")
	private String version;
	
	@Selection(options={ "EXTRACT", "PARTIAL MASH", "ALL GRAIN" }, friendlyName="Recipe Type", tag="RECIPE/TYPE")
	@JacksonXmlProperty(localName="TYPE")
	private String type;
	
	@JacksonXmlProperty(localName="STYLE")
	private Style style;
	
	@JacksonXmlProperty(localName="EQUIPMENT")
	private Equipment equipment;
	
	@JacksonXmlProperty(localName="BREWER")
	private String brewer;
	
	@JacksonXmlProperty(localName="ASST_BREWER")
	private String asstBrewer;
	
	@JacksonXmlProperty(localName="BATCH_SIZE")
	private String batchSize;
	
	@JacksonXmlProperty(localName="BOIL_SIZE")
	private String boilSize;
	
	@JacksonXmlProperty(localName="BOIL_TIME")
	private String boilTime;
	
	@Percentage(friendlyName="Efficiency", tag="RECIPE/EFFICIENCY")
	@JacksonXmlProperty(localName="EFFICIENCY")
	private String efficiency;
	
	@JacksonXmlProperty(localName="HOPS")
	private Hops hops;
	
	@JacksonXmlProperty(localName="FERMENTABLES")
	private Fermentables fermentables;
	
	@JacksonXmlProperty(localName="MISCS")
	private Miscs miscs;
	
	@JacksonXmlProperty(localName="YEASTS")
	private Yeasts yeasts;
	
	@JacksonXmlProperty(localName="WATERS")
	private Waters waters;
	
	@JacksonXmlProperty(localName="MASH")
	private Mash mash;
	
	@JacksonXmlProperty(localName="NOTES")
	private String notes;
	
	@JacksonXmlProperty(localName="TASTE_NOTES")
	private String tasteNotes;
	
	@BjcpRating(friendlyName="Taste Rating", tag="RECIPE/TASTE_RATING")
	@JacksonXmlProperty(localName="TASTE_RATING")
	private String tasteRating;
	
	@JacksonXmlProperty(localName="OG")
	private String og;
	
	@JacksonXmlProperty(localName="FG")
	private String fg;
	
	@JacksonXmlProperty(localName="FERMENTATION_STAGES")
	private String fermentationStages;
	
	@JacksonXmlProperty(localName="PRIMARY_AGE")
	private String primaryAge;
	
	@JacksonXmlProperty(localName="PRIMARY_TEMP")
	private String primaryTemp;
	
	@JacksonXmlProperty(localName="SECONDARY_AGE")
	private String secondaryAge;
	
	@JacksonXmlProperty(localName="SECONDARY_TEMP")
	private String secondaryTemp;
	
	@JacksonXmlProperty(localName="TERTIARY_AGE")
	private String tertiaryAge;
	
	@JacksonXmlProperty(localName="TERTIARY_TEMP")
	private String tertiaryTemp;
	
	@JacksonXmlProperty(localName="AGE")
	private String age;
	
	@JacksonXmlProperty(localName="AGE_TEMP")
	private String ageTemp;
	
	@JacksonXmlProperty(localName="DATE")
	private String date;
	
	@JacksonXmlProperty(localName="CARBONATION")
	private String carbonation;
	
	@JacksonXmlProperty(localName="FORCED_CARBONATION")
	private String forcedCarbonation;
	
	@JacksonXmlProperty(localName="PRIMING_SUGAR_NAME")
	private String primingSugarName;
	
	@JacksonXmlProperty(localName="CARBONATION_TEMP")
	private String carbonationTemp;
	
	@JacksonXmlProperty(localName="PRIMING_SUGAR_EQUIV")
	private String primingSugarEquiv;
	
	@JacksonXmlProperty(localName="KEG_PRIMING_FACTOR")
	private String kegPrimingFactor;
	
	@JacksonXmlProperty(localName="EST_OG")
	private String estOg;
	
	@JacksonXmlProperty(localName="EST_FG")
	private String estFg;
	
	@JacksonXmlProperty(localName="EST_COLOR")
	private String estColor;
	
	@JacksonXmlProperty(localName="IBU")
	private String ibu;
	
	@Selection(options={ "RAGER", "TINSETH", "GARETZ" }, friendlyName="IBU Method", tag="RECIPE/IBU_METHOD")
	@JacksonXmlProperty(localName="IBU_METHOD")
	private String ibuMethod;
	
	@Percentage(friendlyName="Estimated ABV", tag="RECIPE/EST_ABV")
	@JacksonXmlProperty(localName="EST_ABV")
	private String estAbv;
	
	@Percentage(friendlyName="ABV", tag="RECIPE/ABV")
	@JacksonXmlProperty(localName="ABV")
	private String abv;
	
	@Percentage(friendlyName="Actual Efficiency", tag="RECIPE/ACTUAL_EFFICIENCY")
	@JacksonXmlProperty(localName="ACTUAL_EFFICIENCY")
	private String actualEfficiency;
	
	@JacksonXmlProperty(localName="CALORIES")
	private String calories;
	
	@JacksonXmlProperty(localName="DISPLAY_BATCH_SIZE")
	private String displayBatchSize;
	
	@JacksonXmlProperty(localName="DISPLAY_BOIL_SIZE")
	private String displayBoilSize;
	
	@JacksonXmlProperty(localName="DISPLAY_OG")
	private String displayOg;
	
	@JacksonXmlProperty(localName="DISPLAY_FG")
	private String displayFg;
	
	@JacksonXmlProperty(localName="DISPLAY_PRIMARY_TEMP")
	private String displayPrimaryTemp;
	
	@JacksonXmlProperty(localName="DISPLAY_SECONDARY_TEMP")
	private String displaySecondaryTemp;
	
	@JacksonXmlProperty(localName="DISPLAY_TERTIARY_TEMP")
	private String displayTertiaryTemp;
	
	@JacksonXmlProperty(localName="DISPLAY_AGE_TEMP")
	private String displayAgeTemp;
	
	@JacksonXmlProperty(localName="CARBONATION_USED")
	private String carbonationUsed;
	
	@JacksonXmlProperty(localName="DISPLAY_CARB_TEMP")
	private String displayCarbTemp;

}
