package com.main.bean;

import java.io.Serializable;

public class Card implements Serializable{
	//主键id
	private Integer id;
	//身份证编码
	private String code;
	
	public Card(Integer id, String code) {
		super();
		this.id = id;
		this.code = code;
	}
	public Card() {
		super();
		// TODO Auto-generated constructor stub
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
	@Override
	public String toString() {
		return "Card [id=" + id + ", code=" + code + "]";
	}
	
	
}
