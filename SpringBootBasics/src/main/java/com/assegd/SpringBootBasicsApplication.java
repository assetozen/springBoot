package com.assegd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootBasicsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(SpringBootBasicsApplication.class, args);
		
		System.out.println("Welcome to boot . . . ");
		
		
		Alien a = context.getBean(Alien.class); //will check the spring container for this class and returns the object 
												// which means that Spring Framework injects this object into your aplication. This is called Dependency Injection
		a.show();

	}
}
