package com.springlifecycle.xml;

public class MotorCar {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting property");
		this.name = name;
	}

	
	//Init method --- called after setting property value
	public void init()
	{
		System.out.println("Init method is called");
	}
	
	
	//Destroy method --- called just before destroying bean
	public void destroy()
	{
		System.out.println("Destroy Method is called");
	}
	
	@Override
	public String toString() {
		return "MotorCar [name=" + name + "]";
	}

}
