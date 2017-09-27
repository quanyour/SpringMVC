package com.main.bean;

import java.io.Serializable;

public class Student implements Serializable{
	
	private Integer id;//学生id，主键
	private String name;//姓名
	private String sex;//性别
	private Integer age;//年龄
	
	private Clazz clazz;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Integer id, String name, String sex, Integer age, Clazz clazz) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.clazz = clazz;
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

	public Clazz getClazz() {
		return clazz;
	}

	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", clazz=" + clazz + "]";
	}
	
	
}
