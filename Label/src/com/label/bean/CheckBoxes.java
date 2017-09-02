package com.label.bean;

import java.io.Serializable;
import java.util.List;

public class CheckBoxes implements Serializable{
	
	private List<String> courses;

	public CheckBoxes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	
	

}
