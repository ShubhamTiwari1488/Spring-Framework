package com.spring.stereotype.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppClass {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/spring/stereotype/annotation/stereotypeconfig.xml");
		
//		StudentFamily family = applicationContext.getBean("studentFamily",StudentFamily.class);
		
		StudentFamily family = applicationContext.getBean("family",StudentFamily.class);
		
		System.out.println(family.toString());
	}
}
