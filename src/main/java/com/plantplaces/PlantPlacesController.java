

package com.plantplaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.plantplaces.dto.SpecimenDTO;
import com.plantplaces.service.ISpecimenService;

/**
 * Handle the /start endpoints
 *
 */
@Controller
public class PlantPlacesController {
	
	@Autowired
	private ISpecimenService specimenServiceStub;
	
	@RequestMapping(value="/start", method=RequestMethod.GET)
	public String read() {
		SpecimenDTO specimen = specimenServiceStub.fetchById(43);
		return "start";
	}
	
	@RequestMapping(value="/start", method=RequestMethod.GET, params= {"loaylty=blue"})
	public String readBlue() {
		return "start";
	}
	
	@RequestMapping(value="/start", method=RequestMethod.GET, params= {"loaylty=silver"})
	public String readSilver() {
		return "start";
	}
	
	@RequestMapping(value="/start", method=RequestMethod.GET, headers= {"content-type=text/json"})
	public String readJSON() {
		return "start";
	}
	
	@PostMapping(value="/start")
	public String create() {
		return "start";
	}
	
	/**
	 * Handle the /index endpoints
	 *
	 */
	@RequestMapping("/")
	public String index() {
		return "start";
	}
}
