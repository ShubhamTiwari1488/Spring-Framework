package com.spring.autowire.xml.constructor;

public class Person {
	private Address addres1;

	
	public Person(Address addres1) {
		super();
		this.addres1 = addres1;
		System.out.println("Constructor being called for Person class");
	}

	public Address getAddres1() {
		return addres1;
	}

	public void setAddres1(Address addres1) {
		System.out.println("Setting property for Person Class");
		this.addres1 = addres1;
	}

	@Override
	public String toString() {
		return "Person [addres1=" + addres1 + "]";
	}
	
}
