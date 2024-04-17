package com.springconstructor.cschema;

public class Person {
	private int pid;
	private String pname;
	private Food foodList;
	
	public Food getFoodList() {
		return foodList;
	}

	public void setFoodList(Food foodList) {
		this.foodList = foodList;
	}

	public Person(int pid, String pname, Food foodList) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.foodList = foodList;
	}

	public Person(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", foodList=" + foodList + "]";
	}
	
}
