package com.main.bean;

import java.io.Serializable;
import java.util.List;

public class Order implements Serializable{
	
	private Integer id;//订单id，主键
	private String code;//订单编号
	private Double total;//订单总金额
	
	private User3 user;
	
	private List<Article> articles;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(Integer id, String code, Double total, User3 user, List<Article> articles) {
		super();
		this.id = id;
		this.code = code;
		this.total = total;
		this.user = user;
		this.articles = articles;
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

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public User3 getUser() {
		return user;
	}

	public void setUser(User3 user) {
		this.user = user;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", code=" + code + ", total=" + total + ", user=" + user + ", articles=" + articles
				+ "]";
	}
	
	
}
