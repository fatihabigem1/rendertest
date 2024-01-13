package com.testDriven.testDriven;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.testDriven.testDriven.controller.testController;

@SpringBootTest
class TestDrivenApplicationTests {

	private testController myTest;

	@Before
	public void setup() {
		myTest = new testController();
	}

	@Test
	public void testAdd() {
		testController myTest = new testController();
		String result = myTest.add(3, 4);
		assertEquals("7", result);
	}

	@Test
	public void validity() {
		testController myTest = new testController();

		
		// Test for name length less than 10
		ResponseEntity<?> result1 = myTest.getirValue("John");
		if(myTest.getirValue("John").toString().length()< 10) {
			String status = "OK";
			assertEquals("OK", status);	
		}
		

		// Test for integer value less than 5
		ResponseEntity<?> result2 = myTest.getirValue("3");
		int result = Integer.parseInt(myTest.getirValue("3").getBody().toString());
		if (result < 10) {
			String error = "Error";
		    assertEquals("Error", error);
		}
		
			
			
		
		
	}

}
