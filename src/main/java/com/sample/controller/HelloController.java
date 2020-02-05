package com.sample.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.entity.TestClass;

@RestController
public class HelloController {

	@Value("${name.of.application}")
	private String name_app;
	
	@GetMapping("/hello")
	public ResponseEntity<TestClass> sayHello() {
		
		TestClass tc = new TestClass();
		tc.setName("Karunakar Battula");
		tc.setValue("Software Engineer");
//		return "Hello"+ name_app;
		return new ResponseEntity<TestClass>(tc, HttpStatus.ACCEPTED);
	}
	
	
	@GetMapping("/hi")
	public TestClass sayHi() {
		
		TestClass tc = new TestClass();
		tc.setName("abc");
		tc.setValue("xyz");
		return tc;
	}
}
