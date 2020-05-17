package com.beervc.beerxml;

import com.beervc.beerxml.utils.BeerXmlUtils;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Getter;
import lombok.Setter;

@JacksonXmlRootElement(localName="HOP")
public class Hop {

	@JacksonXmlProperty(localName="NAME")
	@Getter @Setter
	private String name;
	
	@JacksonXmlProperty(localName="VERSION")
	@Getter @Setter
	private Integer version;
	
	@JacksonXmlProperty(localName="ALPHA")
	@Getter
	private Double alpha;
	
	@JacksonXmlProperty(localName="AMOUNT")
	@Getter @Setter
	private Double amount;
	
	@JacksonXmlProperty(localName="USE")
	@Getter
	private String use;
	
	@JacksonXmlProperty(localName="TIME")
	@Getter @Setter
	private Double time;
	
	@JacksonXmlProperty(localName="NOTES")
	@Getter @Setter
	private String notes;
	
	@JacksonXmlProperty(localName="TYPE")
	@Getter
	private String type;
	
	@JacksonXmlProperty(localName="FORM")
	@Getter
	private String form;
	
	@JacksonXmlProperty(localName="BETA")
	@Getter
	private Double beta;
	
	@JacksonXmlProperty(localName="HSI")
	@Getter
	private Double hsi;
	
	@JacksonXmlProperty(localName="ORIGIN")
	@Getter @Setter
	private String origin;
	
	@JacksonXmlProperty(localName="SUBSTITUTES")
	@Getter @Setter
	private String substitutes;
	
	@JacksonXmlProperty(localName="HUMULENE")
	@Getter
	private Double humulene;
	
	@JacksonXmlProperty(localName="CARYOPHYLLENE")
	@Getter
	private Double caryophyllene;
	
	@JacksonXmlProperty(localName="COHUMULONE")
	@Getter
	private Double cohumulone;
	
	@JacksonXmlProperty(localName="MYRCENE")
	@Getter
	private Double myrcene;
	
	@JacksonXmlProperty(localName="DISPLAY_AMOUNT")
	@Getter @Setter
	private String displayAmount;
	
	@JacksonXmlProperty(localName="INVENTORY")
	@Getter @Setter
	private String inventory;
	
	@JacksonXmlProperty(localName="DISPLAY_TIME")
	@Getter @Setter
	private String displayTime;

	public void setAlpha(Double alpha) {
		this.alpha = BeerXmlUtils.validatePercentage(alpha, "Alpha", "HOP/ALPHA");
	}

	public void setUse(String use) {
		this.use = BeerXmlUtils.validateHopUse(use, "Hop use", "HOP/USE");
	}

	public void setType(String type) {
		this.type = BeerXmlUtils.validateHopType(type, "Hop type", "HOP/TYPE");
	}

	public void setForm(String form) {
		this.form = BeerXmlUtils.validateHopForm(form, "Hop form", "HOP/FORM");;
	}

	public void setBeta(Double beta) {
		this.beta = BeerXmlUtils.validatePercentage(beta, "Beta", "HOP/BETA");
	}

	public void setHsi(Double hsi) {
		this.hsi = BeerXmlUtils.validatePercentage(hsi, "HSI", "HOP/HSI");
	}

	public void setHumulene(Double humulene) {
		this.humulene = BeerXmlUtils.validatePercentage(humulene, "Humulene", "HOP/HUMULENE");
	}

	public void setCaryophyllene(Double caryophyllene) {
		this.caryophyllene = BeerXmlUtils.validatePercentage(caryophyllene, "Caryophellene", "HOP/CARYOPHYLLENE");
	}

	public void setCohumulone(Double cohumulone) {
		this.cohumulone = BeerXmlUtils.validatePercentage(cohumulone, "Cohumulone", "HOP/COHUMULONE");
	}

	public void setMyrcene(Double myrcene) {
		this.myrcene = BeerXmlUtils.validatePercentage(myrcene, "Myrecene", "HOP/MYRCENE");
	}
	
	
}
