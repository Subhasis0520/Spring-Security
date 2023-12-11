package com.org.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoRestController {
	
	@GetMapping("/contact")
	public String contact() {
		return "Call us :: +91 99 32 76 50 36";
	}
	
	@GetMapping("/about")
	public String about() {
		return "Spring security";
	}

	@GetMapping("/hi")
	public String hi() {
		return "Hi, How are you?";
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello, Welcome to Rest Controller";
	}
}
