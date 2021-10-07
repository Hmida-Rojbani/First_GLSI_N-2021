package de.tekup.first.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("newService")
@Primary
public class HelloServiceImplV2 implements HelloService{
	
	public String getHello() {
		return "Hello Worlds !!!";
	}

	public String getHelloName(String name) {
		return "Hello "+name+" !!!";
	}
}
