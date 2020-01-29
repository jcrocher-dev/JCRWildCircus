package com.wildcodeschool.JCRWildCircus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpectacleController {

	
	@GetMapping ("/spectacles")
	public String index(Model model) {

		return "spectacle";
	} 
}
