package com.beervc.beerxml.utils;

import java.util.Arrays;
import java.util.List;

public class BeerXmlConstants {

	public static final List<String> ALLOWED_RECIPE_TYPES = 
			Arrays.asList("EXTRACT", "PARTIAL MASH", "ALL GRAIN");
	
	public static final List<String> ALLOWED_IBU_METHODS = 
			Arrays.asList("RAGER", "TINSETH", "GARETZ");
	
	public static final List<String> ALLOWED_HOP_USES = 
			Arrays.asList("BOIL", "DRY HOP", "MASH", "FIRST WORT", "AROMA");
	
	public static final List<String> ALLOWED_HOP_TYPES = 
			Arrays.asList("BITTERING", "AROMA", "BOTH");
	
	public static final List<String> ALLOWED_HOP_FORMS = 
			Arrays.asList("PELLET", "PLUG", "LEAF");

}
