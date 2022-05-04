package com.genpact.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");

		//HelloWorldService helloWorldService = (HelloWorldService) applicationContext.getBean("bean1");
		//helloWorldService.sayHello();
			
		
		Employee emp1 =(Employee) applicationContext.getBean("bean2");
		System.out.println(emp1);
		
	
	}
}
