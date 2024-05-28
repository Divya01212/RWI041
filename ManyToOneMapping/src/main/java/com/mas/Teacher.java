package com.mas;
import javax.persistence.*;

@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int teacherId;

    private String name;

	public Teacher(int teacherId, String name) {
		super();
		this.teacherId = teacherId;
		this.name = name;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    
}
