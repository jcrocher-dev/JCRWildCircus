package com.wildcodeschool.JCRWildCircus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CompanyController {

	
	@GetMapping ("/compagnie")
	public String company(Model model) {

		return "company";
	} 
}
