package edu.mum.sc.cs425.demowebapps.eLibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
	
	@GetMapping(value= {"/","/elibrary","elibrary/home"})
	public String homePageDisplay() {
		return "home/index";
	}
	
	

}
