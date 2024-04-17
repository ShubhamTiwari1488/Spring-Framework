package com.spring.autowire.xml.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/spring/autowire/xml/constructor/springconfig.xml");
		
		Person person = applicationContext.getBean("person",Person.class);
		
		System.out.println(person.toString());
	}
}
