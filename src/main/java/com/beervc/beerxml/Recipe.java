package com.beervc.beerxml;

import java.util.List;

import com.beervc.beerxml.utils.BeerXmlUtils;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Getter;
import lombok.Setter;

@JacksonXmlRootElement(localName="RECIPE")
public class Recipe {
	
	@JacksonXmlProperty(localName="NAME")
	@Getter @Setter
	private String name;
	
	@JacksonXmlProperty(localName="VERSION")
	@Getter @Setter
	private Integer version;
	
	@JacksonXmlProperty(localName="TYPE")
	@Getter
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
	private Double batchSize;
	
	@JacksonXmlProperty(localName="BOIL_SIZE")
	@Getter @Setter
	private Double boilSize;
	
	@JacksonXmlProperty(localName="BOIL_TIME")
	@Getter @Setter
	private Double boilTime;
	
	@JacksonXmlProperty(localName="EFFICIENCY")
	@Getter
	private Double efficiency;
	
	@JacksonXmlElementWrapper(localName="HOPS")
	@JacksonXmlProperty(localName="HOP")
	@Getter @Setter
	private List<Hop> hops;
	
	@JacksonXmlElementWrapper(localName="FERMENTABLES")
	@JacksonXmlProperty(localName="FERMENTABLE")
	@Getter @Setter
	private List<Fermentable> fermentables;
	
	@JacksonXmlElementWrapper(localName="MISCS")
	@JacksonXmlProperty(localName="MISC")
	@Getter @Setter
	private List<Misc> miscs;
	
	@JacksonXmlElementWrapper(localName="YEASTS")
	@JacksonXmlProperty(localName="YEAST")
	@Getter @Setter
	private List<Yeast> yeasts;
	
	@JacksonXmlElementWrapper(localName="WATERS")
	@JacksonXmlProperty(localName="WATER")
	@Getter @Setter
	private List<Water> waters;
	
	@JacksonXmlProperty(localName="MASH")
	@Getter @Setter
	private Mash mash;
	
	@JacksonXmlProperty(localName="NOTES")
	@Getter @Setter
	private String notes;
	
	@JacksonXmlProperty(localName="TASTE_NOTES")
	@Getter @Setter
	private String tasteNotes;
	
	@Getter
	private Double tasteRating;
	
	@JacksonXmlProperty(localName="OG")
	@Getter @Setter
	private Double og;
	
	@JacksonXmlProperty(localName="FG")
	@Getter @Setter
	private Double fg;
	
	@JacksonXmlProperty(localName="FERMENTATION_STAGES")
	@Getter @Setter
	private Integer fermentationStages;
	
	@JacksonXmlProperty(localName="PRIMARY_AGE")
	@Getter @Setter
	private Double primaryAge;
	
	@JacksonXmlProperty(localName="PRIMARY_TEMP")
	@Getter @Setter
	private Double primaryTemp;
	
	@JacksonXmlProperty(localName="SECONDARY_AGE")
	@Getter @Setter
	private Double secondaryAge;
	
	@JacksonXmlProperty(localName="SECONDARY_TEMP")
	@Getter @Setter
	private Double secondaryTemp;
	
	@JacksonXmlProperty(localName="TERTIARY_AGE")
	@Getter @Setter
	private Double tertiaryAge;
	
	@JacksonXmlProperty(localName="TERTIARY_TEMP")
	@Getter @Setter
	private Double tertiaryTemp;
	
	@JacksonXmlProperty(localName="AGE")
	@Getter @Setter
	private Double age;
	
	@JacksonXmlProperty(localName="AGE_TEMP")
	@Getter @Setter
	private Double ageTemp;
	
	@JacksonXmlProperty(localName="DATE")
	@Getter @Setter
	private String date;
	
	@JacksonXmlProperty(localName="CARBONATION")
	@Getter @Setter
	private Double carbonation;
	
	@JacksonXmlProperty(localName="FORCED_CARBONATION")
	@Getter @Setter
	private Boolean forcedCarbonation;
	
	@JacksonXmlProperty(localName="PRIMING_SUGAR_NAME")
	@Getter @Setter
	private String primingSugarName;
	
	@JacksonXmlProperty(localName="CARBONATION_TEMP")
	@Getter @Setter
	private Double carbonationTemp;
	
	@JacksonXmlProperty(localName="PRIMING_SUGAR_EQUIV")
	@Getter @Setter
	private Double primingSugarEquiv;
	
	@JacksonXmlProperty(localName="KEG_PRIMING_FACTOR")
	@Getter @Setter
	private Double kegPrimingFactor;
	
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
	private Double ibu;
	
	@JacksonXmlProperty(localName="IBU_METHOD")
	@Getter
	private String ibuMethod;
	
	@JacksonXmlProperty(localName="EST_ABV")
	@Getter
	private Double estAbv;
	
	@JacksonXmlProperty(localName="ABV")
	@Getter
	private Double abv;
	
	@JacksonXmlProperty(localName="ACTUAL_EFFICIENCY")
	@Getter
	private Double actualEfficiency;
	
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

	public void setType(String type) {
		this.type = BeerXmlUtils.validateRecipeType(type, "Recipe type", "RECIPE/TYPE");
	}

	public void setEfficiency(Double efficiency) {
		this.efficiency = BeerXmlUtils.validatePercentage(efficiency, "Efficiency", "RECIPE/EFFICIENCY");
	}

	public void setTasteRating(Double tasteRating) {
		this.tasteRating = BeerXmlUtils.validateBjcpRating(tasteRating, "Taste rating", "RECIPE/TASTE_RATING");
	}

	public void setIbuMethod(String ibuMethod) {
		this.ibuMethod = BeerXmlUtils.validateIbuMethod(ibuMethod, "Ibu method", "RECIPE/IBU_METHOD");
	}

	public void setEstAbv(Double estAbv) {
		this.estAbv = BeerXmlUtils.validatePercentage(estAbv, "Estimated ABV", "RECIPE/EST_ABV");
	}

	public void setAbv(Double abv) {
		this.abv = BeerXmlUtils.validatePercentage(abv, "ABV", "RECIPE/ABV");
	}

	public void setActualEfficiency(Double actualEfficiency) {
		this.actualEfficiency = BeerXmlUtils.validatePercentage(actualEfficiency, "Actual efficiency",
				"RECIPE/ACTUAL_EFFICIENCY");
	}
}
