package com.wildcodeschool.JCRWildCircus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.wildcodeschool.JCRWildCircus.repository.ScheduleRepository;
import com.wildcodeschool.JCRWildCircus.repository.SpectacleEntitieRepository;

@Controller
public class ScheduleController {

	
	@Autowired 
	SpectacleEntitieRepository spectacleEntitieRepository;
	@Autowired
	ScheduleRepository scheduleRepository;
	
	
	@GetMapping ("/agenda")
	public String agenda(Model model) {

		
		model.addAttribute("schedules", scheduleRepository.findAll());
		return "schedule";
	} 
	
}
