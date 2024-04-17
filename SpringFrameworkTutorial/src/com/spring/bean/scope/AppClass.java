package com.spring.bean.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppClass {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/spring/bean/scope/SpringSingletonConfig.xml");
		
		/* For Singleton Bean Example */
		
//		Singleton singleton = applicationContext.getBean("singleton",Singleton.class);
//		
//		System.out.println(singleton.toString());
//		System.out.println("HashCode of the object is "+singleton.hashCode());
//		
//		Singleton singleton2 = applicationContext.getBean("singleton",Singleton.class);
//		
//		System.out.println(singleton2.toString());
//		System.out.println("HashCode of the second object is "+singleton2.hashCode());
		
		
		/* Prototype Bean Example */
		
		Prototype prototype = applicationContext.getBean("prototype",Prototype.class);
		
		System.out.println(prototype.toString());
		System.out.println("HashCode of the object is "+prototype.hashCode());
		
		Prototype prototype2 = applicationContext.getBean("prototype",Prototype.class);
		
		System.out.println(prototype2.toString());
		System.out.println("HashCode of the object is "+prototype2.hashCode());
		
	}
}
