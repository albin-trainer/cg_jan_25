package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
//SpringConfiguration+EnableAutoConfiguration+ComponentScan annotations
@SpringBootApplication
//@ComponentScan(basePackages = "com.example")
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx=
		SpringApplication.run(Application.class, args);
		    //initialize ApplicationContext
		    //AppContext scans the class path (maven dependencies)
		    //initialize required components automatically
		    //starts the tomcat server...
	}

}
