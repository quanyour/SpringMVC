package org.fkit.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.fkit.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class User3Controller {
	
	private static final Log logger=LogFactory.getLog(User2Controller.class);
	
	@ModelAttribute
	public void userMode3(String loginname,String password,ModelAndView mv){
		User user=new User();
		user.setLoginname(loginname);
		user.setPassword(password);
		// ��User������ӵ�ModelAndView��Model����
		mv.addObject("user",user);
	}
	
	@RequestMapping(value="/login3")
	public ModelAndView login3(ModelAndView v){
		//ModelAndView ȡ��
		User user=(User) v.getModel().get("user");
		System.out.println(user);
		//����user�����username����
		user.setUsername("����");
		//���÷��ص���ͼ����
		v.setViewName("result3");
		return v;
		
	}
}
