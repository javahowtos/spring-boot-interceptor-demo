package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/api/demo")
	public String getText() {
		System.out.println("Entered controller.");
		return "some text";
	}
}
