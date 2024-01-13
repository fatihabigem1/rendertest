package com.testDriven.testDriven.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.testDriven.testDriven.dal.CustomObject;

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
	
	   @GetMapping("/example")
	    public ResponseEntity<String> getExample() {
	        String responseBody = "This is an example response";
	        return ResponseEntity.ok(responseBody);
	    }
	   
	   
	   @GetMapping("/custom")
	    public ResponseEntity<List<CustomObject>> getCustomObjects() {
	        // Assume CustomObject is a custom class
	        List<CustomObject> customObjectList = new ArrayList<>();
	        // Add some custom objects to the list (can be fetched from a database or any other source)
	        customObjectList.add(new CustomObject("1", "First object"));
	        customObjectList.add(new CustomObject("2", "Second object"));
	        // Return the list in the ResponseEntity with a 200 OK status
	        return ResponseEntity.ok(customObjectList);
	    }
	
}





/*

…or create a new repository on the command line

echo "# rendertest" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/fatihabigem1/rendertest.git
git push -u origin main



…or push an existing repository from the command line
git remote add origin https://github.com/fatihabigem1/rendertest.git
git branch -M main
git push -u origin mai

*/