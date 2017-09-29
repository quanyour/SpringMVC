package org.fkit.service;

import org.fkit.domain.User;

public interface UserService {
	
	/**
	 * 判断用户登录
	 * @param loginname
	 * @param password
	 * @return
	 * 			找到返回的User对象，没有找到返回null。
	 */
	User login(String loginname,String password);
}
