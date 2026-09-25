package com.luminar.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // this represent a table
public class Student {
	@Id                  //primary key their should be this id column in table
	@GeneratedValue(strategy = GenerationType.IDENTITY)// import javax for older version and jakarta for new version
	private int rollno;
	private String name;
	private float mark;

	// according to rule we should add default constructor

	public Student() {
	}

	public Student(int rollno, String name, float mark) {
		this.rollno = rollno;
		this.name = name;
		this.mark = mark;
	}

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

	public float getMark() {
		return mark;
	}

	public void setMark(float mark) {
		this.mark = mark;
	}

}
