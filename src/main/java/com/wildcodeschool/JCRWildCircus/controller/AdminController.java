package com.wildcodeschool.JCRWildCircus.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wildcodeschool.JCRWildCircus.entities.ContactEntitie;
import com.wildcodeschool.JCRWildCircus.entities.Schedule;
import com.wildcodeschool.JCRWildCircus.entities.SpectacleEntitie;
import com.wildcodeschool.JCRWildCircus.repository.ContactEntitieRepository;
import com.wildcodeschool.JCRWildCircus.repository.ScheduleRepository;
import com.wildcodeschool.JCRWildCircus.repository.SpectacleEntitieRepository;

@Controller
public class AdminController {

	@Autowired
	SpectacleEntitieRepository spectacleEntitieRepository;
	@Autowired
	ScheduleRepository scheduleRepository;
	@Autowired
	ContactEntitieRepository contactEntitieRepository;
	
//accueil
	@GetMapping("/accueilAdmin")
	public String accueilAdmin (Model model) {
		
		model.addAttribute("contacts", contactEntitieRepository.findAll());
		return "adminHome";
	}
	
	
	@PostMapping("/deleteContact")
	public String deleteContact (Model model, @RequestParam Long contactId) {
		
		contactEntitieRepository.deleteById(contactId);;
		return "redirect:/accueilAdmin";
	}
	
	
//spectacle
	@GetMapping("/gestionSpectacle")
	public String adminEvent (Model model) {
		
		model.addAttribute("spectacles", spectacleEntitieRepository.findAll());
		return "adminEvent";
	}
	
	
	@PostMapping("/deleteSpectacle")
	public String deleteSpectacle (Model model, @RequestParam Long spectacleId) {
		
		List<Schedule> schedules = scheduleRepository.findScheduleBySpectacleEntitieId(spectacleId);
		for (Schedule schedule : schedules) {
			scheduleRepository.delete(schedule);
		}
		spectacleEntitieRepository.deleteById(spectacleId);
		return "redirect:/gestionSpectacle";
	}
	
	
	@PostMapping("/updateSpectacle")
	public String updateSpectacle (Model model, @ModelAttribute SpectacleEntitie spectacleEntitie) {
		spectacleEntitieRepository.save(spectacleEntitie);
		
		return "redirect:/gestionSpectacle";
	}
	
	
	@PostMapping("/createSpectacle")
	public String createSpectacle (@ModelAttribute SpectacleEntitie spectacleEntitie) {
	
		spectacleEntitieRepository.save(spectacleEntitie);
		return "redirect:/gestionSpectacle";
	}
	

	
//agenda
	@GetMapping("/gestionAgenda")
	public String adminSchedule (Model model) {
		
		return "adminSchedule";
	}
	
}
