package com.main.bean;

import java.io.Serializable;

public class User implements Serializable{
	
	private Integer id;
	private String name;
	private String sex;
	private Integer age;
	public User() {
		super();
	}
	public User(Integer id, String name, String sex, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}
	
	
}
