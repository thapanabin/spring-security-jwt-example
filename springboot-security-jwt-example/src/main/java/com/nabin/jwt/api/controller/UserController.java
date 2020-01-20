package com.nabin.jwt.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {

	@GetMapping("/")
	public String welcome() {
		
		return "Welcome to JWT";
	}
}
