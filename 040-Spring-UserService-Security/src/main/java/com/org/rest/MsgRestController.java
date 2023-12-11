package com.org.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	
	@GetMapping("/contact")
	public String contact() {
		return "Call us :: +91 85974 89154";
	}
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to my application..!";
	}
	
	@GetMapping("/greet")
	public String greet() {
		return "Good Morning..!";
	}
}
