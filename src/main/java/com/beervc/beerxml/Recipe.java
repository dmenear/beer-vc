package com.beervc.beerxml;

import java.util.List;

import com.beervc.beerxml.annotations.BjcpRating;
import com.beervc.beerxml.annotations.Percentage;
import com.beervc.beerxml.annotations.Selection;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JacksonXmlRootElement(localName="RECIPE")
public class Recipe extends BeerXMLElement {
	
	@JacksonXmlProperty(localName="NAME")
	@Getter @Setter
	private String name;
	
	@JacksonXmlProperty(localName="VERSION")
	@Getter @Setter
	private String version;
	
	@Selection(options={ "EXTRACT", "PARTIAL MASH", "ALL GRAIN" }, friendlyName="Recipe Type", tag="RECIPE/TYPE")
	@JacksonXmlProperty(localName="TYPE")
	@Getter @Setter
	private String type;
	
	@JacksonXmlProperty(localName="STYLE")
	@Getter @Setter
	private Style style;
	
	@JacksonXmlProperty(localName="EQUIPMENT")
	@Getter @Setter
	private Equipment equipment;
	
	@JacksonXmlProperty(localName="BREWER")
	@Getter @Setter
	private String brewer;
	
	@JacksonXmlProperty(localName="ASST_BREWER")
	@Getter @Setter
	private String asstBrewer;
	
	@JacksonXmlProperty(localName="BATCH_SIZE")
	@Getter @Setter
	private String batchSize;
	
	@JacksonXmlProperty(localName="BOIL_SIZE")
	@Getter @Setter
	private String boilSize;
	
	@JacksonXmlProperty(localName="BOIL_TIME")
	@Getter @Setter
	private String boilTime;
	
	@Percentage(friendlyName="Efficiency", tag="RECIPE/EFFICIENCY")
	@JacksonXmlProperty(localName="EFFICIENCY")
	@Getter @Setter
	private String efficiency;
	
	@JacksonXmlElementWrapper(localName="HOPS")
	@JacksonXmlProperty(localName="HOP")
	@Getter @Setter
	private List<Hop> hops;
	
//	@JacksonXmlElementWrapper(localName="FERMENTABLES")
//	@JacksonXmlProperty(localName="FERMENTABLE")
//	@Getter @Setter
//	private List<Fermentable> fermentables;
//	
//	@JacksonXmlElementWrapper(localName="MISCS")
//	@JacksonXmlProperty(localName="MISC")
//	@Getter @Setter
//	private List<Misc> miscs;
//	
//	@JacksonXmlElementWrapper(localName="YEASTS")
//	@JacksonXmlProperty(localName="YEAST")
//	@Getter @Setter
//	private List<Yeast> yeasts;
//	
//	@JacksonXmlElementWrapper(localName="WATERS")
//	@JacksonXmlProperty(localName="WATER")
//	@Getter @Setter
//	private List<Water> waters;
//	
//	@JacksonXmlProperty(localName="MASH")
//	@Getter @Setter
//	private Mash mash;
	
	@JacksonXmlProperty(localName="NOTES")
	@Getter @Setter
	private String notes;
	
	@JacksonXmlProperty(localName="TASTE_NOTES")
	@Getter @Setter
	private String tasteNotes;
	
	@BjcpRating(friendlyName="Taste Rating", tag="RECIPE/TASTE_RATING")
	@JacksonXmlProperty(localName="TASTE_RATING")
	@Getter @Setter
	private String tasteRating;
	
	@JacksonXmlProperty(localName="OG")
	@Getter @Setter
	private String og;
	
	@JacksonXmlProperty(localName="FG")
	@Getter @Setter
	private String fg;
	
	@JacksonXmlProperty(localName="FERMENTATION_STAGES")
	@Getter @Setter
	private String fermentationStages;
	
	@JacksonXmlProperty(localName="PRIMARY_AGE")
	@Getter @Setter
	private String primaryAge;
	
	@JacksonXmlProperty(localName="PRIMARY_TEMP")
	@Getter @Setter
	private String primaryTemp;
	
	@JacksonXmlProperty(localName="SECONDARY_AGE")
	@Getter @Setter
	private String secondaryAge;
	
	@JacksonXmlProperty(localName="SECONDARY_TEMP")
	@Getter @Setter
	private String secondaryTemp;
	
	@JacksonXmlProperty(localName="TERTIARY_AGE")
	@Getter @Setter
	private String tertiaryAge;
	
	@JacksonXmlProperty(localName="TERTIARY_TEMP")
	@Getter @Setter
	private String tertiaryTemp;
	
	@JacksonXmlProperty(localName="AGE")
	@Getter @Setter
	private String age;
	
	@JacksonXmlProperty(localName="AGE_TEMP")
	@Getter @Setter
	private String ageTemp;
	
	@JacksonXmlProperty(localName="DATE")
	@Getter @Setter
	private String date;
	
	@JacksonXmlProperty(localName="CARBONATION")
	@Getter @Setter
	private String carbonation;
	
	@JacksonXmlProperty(localName="FORCED_CARBONATION")
	@Getter @Setter
	private String forcedCarbonation;
	
	@JacksonXmlProperty(localName="PRIMING_SUGAR_NAME")
	@Getter @Setter
	private String primingSugarName;
	
	@JacksonXmlProperty(localName="CARBONATION_TEMP")
	@Getter @Setter
	private String carbonationTemp;
	
	@JacksonXmlProperty(localName="PRIMING_SUGAR_EQUIV")
	@Getter @Setter
	private String primingSugarEquiv;
	
	@JacksonXmlProperty(localName="KEG_PRIMING_FACTOR")
	@Getter @Setter
	private String kegPrimingFactor;
	
	@JacksonXmlProperty(localName="EST_OG")
	@Getter @Setter
	private String estOg;
	
	@JacksonXmlProperty(localName="EST_FG")
	@Getter @Setter
	private String estFg;
	
	@JacksonXmlProperty(localName="EST_COLOR")
	@Getter @Setter
	private String estColor;
	
	@JacksonXmlProperty(localName="IBU")
	@Getter @Setter
	private String ibu;
	
	@Selection(options={ "RAGER", "TINSETH", "GARETZ" }, friendlyName="IBU Method", tag="RECIPE/IBU_METHOD")
	@JacksonXmlProperty(localName="IBU_METHOD")
	@Getter @Setter
	private String ibuMethod;
	
	@Percentage(friendlyName="Estimated ABV", tag="RECIPE/EST_ABV")
	@JacksonXmlProperty(localName="EST_ABV")
	@Getter @Setter
	private String estAbv;
	
	@Percentage(friendlyName="ABV", tag="RECIPE/ABV")
	@JacksonXmlProperty(localName="ABV")
	@Getter @Setter
	private String abv;
	
	@Percentage(friendlyName="Actual Efficiency", tag="RECIPE/ACTUAL_EFFICIENCY")
	@JacksonXmlProperty(localName="ACTUAL_EFFICIENCY")
	@Getter @Setter
	private String actualEfficiency;
	
	@JacksonXmlProperty(localName="CALORIES")
	@Getter @Setter
	private String calories;
	
	@JacksonXmlProperty(localName="DISPLAY_BATCH_SIZE")
	@Getter @Setter
	private String displayBatchSize;
	
	@JacksonXmlProperty(localName="DISPLAY_BOIL_SIZE")
	@Getter @Setter
	private String displayBoilSize;
	
	@JacksonXmlProperty(localName="DISPLAY_OG")
	@Getter @Setter
	private String displayOg;
	
	@JacksonXmlProperty(localName="DISPLAY_FG")
	@Getter @Setter
	private String displayFg;
	
	@JacksonXmlProperty(localName="DISPLAY_PRIMARY_TEMP")
	@Getter @Setter
	private String displayPrimaryTemp;
	
	@JacksonXmlProperty(localName="DISPLAY_SECONDARY_TEMP")
	@Getter @Setter
	private String displaySecondaryTemp;
	
	@JacksonXmlProperty(localName="DISPLAY_TERTIARY_TEMP")
	@Getter @Setter
	private String displayTertiaryTemp;
	
	@JacksonXmlProperty(localName="DISPLAY_AGE_TEMP")
	@Getter @Setter
	private String displayAgeTemp;
	
	@JacksonXmlProperty(localName="CARBONATION_USED")
	@Getter @Setter
	private String carbonationUsed;
	
	@JacksonXmlProperty(localName="DISPLAY_CARB_TEMP")
	@Getter @Setter
	private String displayCarbTemp;

}
