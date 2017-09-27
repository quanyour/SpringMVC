package com.main.bean;

import java.io.Serializable;
import java.util.List;

public class Clazz implements Serializable{
	
	private Integer id;//°à¼¶id£¬Ö÷¼ü
	private String code;//±à¼­±àºÅ
	private String name;//°à¼¶Ãû×Ö
	
	private List<Student> student;

	public Clazz() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Clazz(Integer id, String code, String name, List<Student> student) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.student = student;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Clazz [id=" + id + ", code=" + code + ", name=" + name + "]";
	}
	
	
}
