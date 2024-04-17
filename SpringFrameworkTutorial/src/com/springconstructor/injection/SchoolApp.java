package com.springconstructor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SchoolApp {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/springconstructor/injection/springconfig.xml");

		Student student = (Student) applicationContext.getBean("student");
		
		System.out.println(student.toString());
		
	}
}
