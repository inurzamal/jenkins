package com.nur.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	
	@GetMapping("/")
	public String welcome() {
		return "Welcome to NIELIT Guwahati City Centre";
	}

}
