package com.springref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/springref/springconfig.xml");
		
//		Company company = (Company) applicationContext.getBean("comp");
		
		Company company = (Company) applicationContext.getBean("company");
		System.out.println(company.toString());
	}
}
