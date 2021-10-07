package de.tekup.first.services;

import org.springframework.stereotype.Service;

@Service("oldService")
public class HelloServiceImpl implements HelloService{
	
	public String getHello() {
		return "Hello Worlds !";
	}

	public String getHelloName(String name) {
		return "Hello "+name+" !";
	}
}
