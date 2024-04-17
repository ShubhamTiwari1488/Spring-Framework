package com.springcore.datatypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApp {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/springcore/datatypes/springconfig.xml");
		
		//Student student = (Student)applicationContext.getBean("stud");
		Student student = (Student)applicationContext.getBean("student");
		System.out.println(student.toString());
	}
}
