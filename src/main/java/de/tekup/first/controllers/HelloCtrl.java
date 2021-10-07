package de.tekup.first.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import de.tekup.first.models.User;
import de.tekup.first.services.HelloService;

@RestController
public class HelloCtrl {
	//Inject
	private HelloService service; // call to bean plus association
		
	public HelloCtrl(@Qualifier("oldService") HelloService service) {
		super();
		this.service = service;
	}

	//@RequestMapping(path = "/hello",method = RequestMethod.GET)
	@GetMapping("/hello")
	@RequestMapping(path = "/hello",method = {RequestMethod.GET,RequestMethod.POST})
	public String sayHello() {
		return service.getHello();
	}
	
	@RequestMapping(path = "/hello/{value}")
	public String sayHello(@PathVariable("value") String name) {
		return service.getHelloName(name);
	}
	
	@RequestMapping(path = "/hello/{value}/{age}")
	public String sayHello(@PathVariable("value") String name,@PathVariable("age") int age) {
		return "Hello "+name+" , your age is : +"+age+"!!!";
	}
	
	@PostMapping("/user")
	public ResponseEntity<User> getUser(@RequestBody User user) {
		user.setName(user.getName().toUpperCase());
		return new ResponseEntity<User>(user, HttpStatus.CREATED);
	}

}
