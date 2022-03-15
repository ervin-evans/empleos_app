package com.evans.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String index() {
		return "index.html";
	}

	@GetMapping("/job/portal")
	public String findAJob() {
		return "portal";
	}
	
	@GetMapping("/search/results")
	public String showSearchReults() {
		return "results";
	}
}
