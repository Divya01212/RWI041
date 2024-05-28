package com.data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int employeeId;  
	private String name,email;  
	private Address address;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int employeeId, String name, String email, Address address) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.email = email;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [employeeId=" + employeeId + ", name=" + name + ", email=" + email + ", address=" + address
				+ "]";
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	} 
	

}
