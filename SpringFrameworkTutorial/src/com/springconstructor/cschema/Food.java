package com.springconstructor.cschema;

import java.util.List;

public class Food {
	private List<String> food;

	public Food(List<String> food) {
		super();
		this.food = food;
	}

	public List<String> getFood() {
		return food;
	}

	public void setFood(List<String> food) {
		this.food = food;
	}

	@Override
	public String toString() {
		return "Food [food=" + food + "]";
	}
	
	
}
