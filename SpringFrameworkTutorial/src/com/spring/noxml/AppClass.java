package com.spring.noxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppClass {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
		
//		Student student = applicationContext.getBean("stud",Student.class);
		
		Student student = applicationContext.getBean("studBean",Student.class);
		
		student.study();
	}
}
