/* Singleton Bean is the default type , a object is created and every request the same object is given to the user */
package com.spring.bean.scope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Singleton {
	@Value("9899")
	private int id;
	
	@Value("Singeleton example Bean")
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Singleton [id=" + id + ", name=" + name + "]";
	}
	
}
