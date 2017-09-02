package com.label.bean;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable{
	
	private boolean reader;
	private List<String> courses;
	public boolean isReader() {
		return reader;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setReader(boolean reader) {
		this.reader = reader;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	
	
}
