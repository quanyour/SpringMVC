package org.fkit.service;

import org.fkit.domain.User;

public interface UserService {
	
	/**
	 * �ж��û���¼
	 * @param loginname
	 * @param password
	 * @return
	 * 			�ҵ����ص�User����û���ҵ�����null��
	 */
	User login(String loginname,String password);
}
