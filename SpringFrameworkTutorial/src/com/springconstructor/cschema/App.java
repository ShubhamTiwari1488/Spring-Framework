package com.springconstructor.cschema;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/springconstructor/cschema/springconfig.xml");
		
		Person person = (Person) applicationContext.getBean("person");
		Person person2 = (Person) applicationContext.getBean("people");
		
		System.out.println(person.toString());
		System.out.println(person2.toString());
	}
}
