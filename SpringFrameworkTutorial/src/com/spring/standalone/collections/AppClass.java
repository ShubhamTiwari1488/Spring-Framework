package com.spring.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppClass {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/spring/standalone/collections/springconfig.xml");
		
		Person person = applicationContext.getBean("person",Person.class);
		
		System.out.println(person.toString());
	}
}
