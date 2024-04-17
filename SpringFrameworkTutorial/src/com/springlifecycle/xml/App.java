package com.springlifecycle.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/springlifecycle/xml/springconfig.xml");
		
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/springlifecycle/xml/springconfig.xml");
		
//		MotorCar car = applicationContext.getBean("motorcar",MotorCar.class);
		
		MotorCar car = applicationContext.getBean("motorcar",MotorCar.class);
		
		applicationContext.registerShutdownHook();	// this will make the destroy method to be called before destruction the bean.
		
		System.out.println(car.toString());
	}
}
