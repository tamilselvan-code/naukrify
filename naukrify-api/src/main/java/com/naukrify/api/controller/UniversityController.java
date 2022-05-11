package com.naukrify.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class UniversityController {

	@GetMapping("/universities")
	public String getUniversities() {
		
		return "Welcome to University";
	}
}
