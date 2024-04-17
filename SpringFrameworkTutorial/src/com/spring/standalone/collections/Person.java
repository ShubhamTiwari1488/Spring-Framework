package com.spring.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	private List<String> friends;
	private Map<Integer, String> buketList;
	private Properties properties;
	
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public Map<Integer, String> getBuketList() {
		return buketList;
	}
	public void setBuketList(Map<Integer, String> buketList) {
		this.buketList = buketList;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	@Override
	public String toString() {
		return "Person [friends=" + friends + ", buketList=" + buketList + ", properties=" + properties + "]";
	}
	
}
