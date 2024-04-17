package com.spring.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("SpELStatic")
public class SpELStatic {
	@Value("98")
	private int x;
	
	@Value("883")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(144)}")
	private double z;
	
	@Value("#{T(java.lang.Math).PI}")
	private double w;
	
	@Value("#{ new java.lang.String('Shubham Tiwari')}")
	private String name;
	
	@Value("#{4>3}")
	private boolean isActive;
	
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public double getW() {
		return w;
	}
	public void setW(double w) {
		this.w = w;
	}
	@Override
	public String toString() {
		return "SpELStatic [x=" + x + ", y=" + y + ", z=" + z + ", w=" + w + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}
	
}
