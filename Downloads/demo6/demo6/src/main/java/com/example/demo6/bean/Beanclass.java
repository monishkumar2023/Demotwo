package com.example.demo6.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
public class Beanclass 
{
	private int StudentId;
	private String StrudentName;
	private String StudentDep;
	private String StudentAdd;
	
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentid(int studentid) {
		StudentId = studentid;
	}
	public String getStrudentName() {
		return StrudentName;
	}
	public void setStrudentName(String strudentName) {
		StrudentName = strudentName;
	}
	public String getStudentDep() {
		return StudentDep;
	}
	public void setStudentDep(String studentDep) {
		StudentDep = studentDep;
	}
	public String getStudentAdd() {
		return StudentAdd;
	}
	public void setStudentAdd(String studentAdd) {
		StudentAdd = studentAdd;
	}
	public void connect()
	{
		System.out.println("this is pojo class");
	}
}
//this is my update code