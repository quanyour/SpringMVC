package com.main.bean;

import java.io.Serializable;
import java.util.List;

public class User3 implements Serializable{
	
	private Integer id;//用户id ，主键
	private String username;//用户名
	private String loginname;//登录名
	private String password;//密码
	private String phone;//联系电话
	private String address;//收货地址
	
	private List<Order> orders;

	public User3() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User3(Integer id, String username, String loginname, String password, String phone, String address,
			List<Order> orders) {
		super();
		this.id = id;
		this.username = username;
		this.loginname = loginname;
		this.password = password;
		this.phone = phone;
		this.address = address;
		this.orders = orders;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "User3 [id=" + id + ", username=" + username + ", loginname=" + loginname + ", password=" + password
				+ ", phone=" + phone + ", address=" + address + ", orders=" + orders + "]";
	}
	
	
}
