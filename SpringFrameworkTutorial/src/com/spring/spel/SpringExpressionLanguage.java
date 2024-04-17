package com.spring.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("spEL")
public class SpringExpressionLanguage {
	@Value("#{3+10}")
	private int id;
	@Value("#{2*10+1}")
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
		return "SpringExpressionLanguage [id=" + id + ", name=" + name + "]";
	}
	
}
