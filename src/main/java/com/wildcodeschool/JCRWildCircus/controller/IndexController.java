package com.wildcodeschool.JCRWildCircus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	
	@GetMapping ("/")
	public String index(Model model) {

		return "index";
	} 
	
	
	@GetMapping ("/index")
	public String index1(Model model) {

		return "index";
	}
}
