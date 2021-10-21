package com.vanderlande.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldEndpoint {
	
	@GetMapping(path = "/hello")
	public String helloWorld()  {
		return "Hello World 2 !";
	}
}
