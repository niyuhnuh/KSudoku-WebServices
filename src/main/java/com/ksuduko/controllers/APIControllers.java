package com.ksuduko.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBodys

@RestController //a combination of @Controller and @ResponseBody
public class APIControllers {
	
	@GetMapping("/ping")
	public ResponseEntity<String> ping(){
		return ResponseEntity.ok("Healthy naman");
	}
	
}
