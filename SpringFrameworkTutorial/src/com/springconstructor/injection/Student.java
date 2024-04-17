package com.springconstructor.injection;

import java.util.List;

public class Student {
	private int rollno;
	private String name;
	private List<String> subjects;
	
	public Student(int rollno, String name, List<String> subjects) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.subjects = subjects;
	}
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", subjects=" + subjects + "]";
	}

}