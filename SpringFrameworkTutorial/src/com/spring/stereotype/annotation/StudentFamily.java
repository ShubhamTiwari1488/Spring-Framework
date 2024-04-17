package com.spring.stereotype.annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component		//CamelCase will be followed ( ex :- "studentFamily" )
//---------------//
@Component("family")	// Now the bean name will be family
public class StudentFamily {
	@Value("192005")
	private int rollno;
	@Value("Manmohan Singh Tomar")
	private String studentName;
	@Value("O+")
	private String bloodGroup;
	@Value("#{address}")
	private List<String> address;
	
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	@Override
	public String toString() {
		return "StudentFamily [rollno=" + rollno + ", studentName=" + studentName + ", bloodGroup=" + bloodGroup
				+ ", address=" + address + "]";
	}
	
}
