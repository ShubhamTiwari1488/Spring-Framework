package com.springcore.collection;

import java.util.List;

public class Restaurants {
	private String name;
	private List<String> foodMenu;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getFoodMenu() {
		return foodMenu;
	}
	public void setFoodMenu(List<String> foodMenu) {
		this.foodMenu = foodMenu;
	}
	@Override
	public String toString() {
		return "Restaurants [name=" + name + ", foodMenu=" + foodMenu + "]";
	}
}
