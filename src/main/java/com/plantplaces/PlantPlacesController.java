package com.plantplaces;

import org.springframework.web.bind.annotation.RequestMapping;

public class PlantPlacesController {

@RequestMapping

	public String start() {
		
		return "start";
	}
	
	
}
