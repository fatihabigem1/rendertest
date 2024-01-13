package com.testDriven.testDriven.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class testController {

	
	@GetMapping("/test")
	public String test() {
		return "test";
	}
	
	@GetMapping("/add")
	public String add(@RequestParam int a, @RequestParam int b) {
		
		return  Integer.toString(a + b );
	    //http://localhost:7414/api/add?a=1&b=2
	}
	
	
	@GetMapping("/test2/{id}")
    public ResponseEntity<?> getirValue(@PathVariable String id) {
        try {
            // Check if the id is an integer
            Integer intValue = Integer.parseInt(id);
            return ResponseEntity.ok(intValue);
        } catch (NumberFormatException e) {
            // If the id is not an integer, it will be treated as a string
            return ResponseEntity.ok(id);
        }
    }
	
}
