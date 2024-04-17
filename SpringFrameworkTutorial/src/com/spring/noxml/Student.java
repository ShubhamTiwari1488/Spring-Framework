package com.spring.noxml;

import org.springframework.stereotype.Component;

@Component("stud")
public class Student {

	public void study()
	{
		System.out.println("Student is studying");
	}
}
