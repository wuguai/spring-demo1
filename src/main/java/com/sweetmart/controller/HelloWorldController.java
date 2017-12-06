package com.sweetmart.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping("/hello1")
	public String sayHello(){
		return "Hello World";
	}
	
	@RequestMapping("/hello2")
	public List<String> sayHello2(){
		return Arrays.asList(new String[] { "A", "B", "C" });
	}
	
}
