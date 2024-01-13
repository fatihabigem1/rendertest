package com.testDriven.testDriven.controllerTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.testDriven.testDriven.controller.testController;

@SpringBootTest
public class controTest {

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
		assertEquals(HttpStatus.BAD_REQUEST, result1.getStatusCode());

		// Test for integer value less than 5
		ResponseEntity<?> result2 = myTest.getirValue("3");
		assertEquals(HttpStatus.BAD_REQUEST, result2.getStatusCode());
	}

}
