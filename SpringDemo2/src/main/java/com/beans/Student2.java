package com.beans;

public class Student2 {
	private int id;
	private String name;
	private int rollno;
	public Student2(int id, String name, int rollno) {
		super();
		this.id = id;
		this.name = name;
		this.rollno = rollno;
	}
	public Student2() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Student2 [id=" + id + ", name=" + name + ", rollno=" + rollno + "]";
	}
	
}
