package com.wildcodeschool.JCRWildCircus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wildcodeschool.JCRWildCircus.repository.ScheduleRepository;
import com.wildcodeschool.JCRWildCircus.repository.SpectacleEntitieRepository;

@Controller
public class SpectacleController {

	
	@Autowired 
	SpectacleEntitieRepository spectacleEntitieRepository;
	@Autowired
	ScheduleRepository scheduleRepository;
	
//spectacles	
	@GetMapping ("/spectacles")
	public String spectacles(Model model) {

		model.addAttribute("spectacles", spectacleEntitieRepository.findAll());
		return "spectacles";
	} 
	
	
	
	
//spectacle
	@PostMapping ("/spectacle")
	public String spectacle(Model model, @RequestParam Long spectacleId) {

		
		model.addAttribute("schedules", scheduleRepository.findScheduleBySpectacleEntitieId(spectacleId));
		model.addAttribute("spectacle", spectacleEntitieRepository.findById(spectacleId).get());
		return "spectacle";
	} 
	
}
