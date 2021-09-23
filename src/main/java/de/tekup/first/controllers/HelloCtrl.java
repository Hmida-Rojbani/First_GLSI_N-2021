package de.tekup.first.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCtrl {
	
	@RequestMapping(path = "/hello")
	public String sayHello() {
		return "Hello World !";
	}
	
	@RequestMapping(path = "/hello/{value}")
	public String sayHello(@PathVariable("value") String name) {
		return "Hello "+name+" !";
	}
	
	@RequestMapping(path = "/hello/{value}/{age}")
	public String sayHello(@PathVariable("value") String name,@PathVariable("age") int age) {
		return "Hello "+name+" , your age is : +"+age+"!!!";
	}

}
