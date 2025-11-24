package com.vagabond_albatross.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {
	@GetMapping("/")
	public String getIndex() {
		return "index";
	}

	@PostMapping("/login")
	public String postLogin() {
		return "redirect:/login";
	}

	@GetMapping("/login")
	public String getLogin() {
		return "index";
	}
}
