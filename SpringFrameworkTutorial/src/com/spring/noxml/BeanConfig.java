package com.spring.noxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

	//Using bean annotation ( @Bean Configuration helps the IOC to take this object and returns to us )
	@Bean(name = {"studBean","Vidhyathi"})
	public Student getStudent()
	{
		System.out.println("Creating a new object");
		Student student = new Student();
		
		return student;
	}
}
