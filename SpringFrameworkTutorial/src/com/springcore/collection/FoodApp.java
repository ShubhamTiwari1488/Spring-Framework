package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FoodApp {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/springcore/collection/springconfig.xml");
		
//		Restaurants restaurants = (Restaurants) applicationContext.getBean("restaurant");
		Restaurants restaurants = (Restaurants) applicationContext.getBean("FoodStall");
		System.out.println(restaurants.toString());
	}
}
