package de.tekup.first.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.tekup.first.services.HelloService;

@RestController
public class HelloCtrl {
	
	private HelloService service = new HelloService();
	
	@RequestMapping(path = "/hello")
	public String sayHello() {
		return service.getHello();
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
