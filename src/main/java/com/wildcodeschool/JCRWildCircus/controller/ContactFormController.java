package com.wildcodeschool.JCRWildCircus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.wildcodeschool.JCRWildCircus.entities.ContactEntitie;
import com.wildcodeschool.JCRWildCircus.repository.ContactEntitieRepository;

@Controller
public class ContactFormController {

	@Autowired
	ContactEntitieRepository contactEntitieRepository;
	
	
	@PostMapping ("/contactForm")
	public String submitContactForm (@ModelAttribute ContactEntitie contactEntitie) {
		contactEntitieRepository.save(contactEntitie);
		ModelMap model = new ModelMap();
		model.addAttribute("toastMsg", "validated");
		return "redirect:/compagnie";
	}
}
