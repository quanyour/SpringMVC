package com.main.bean;

import java.io.Serializable;

public class Person implements Serializable{
	//主键id
	private Integer id;
	//姓名
	private String name;
	//性别
	private String sex;
	//年龄
	private Integer age;
	
	private Card card;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(Integer id, String name, String sex, Integer age, Card card) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.card = card;
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

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", card=" + card + "]";
	}
	
	
}
