package com.cjc;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee1 {
	
	@Id
	private int rollno;
	private String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
