package org.fkit.controller;

import javax.servlet.http.HttpSession;

import org.fkit.domain.User;
import org.fkit.mapper.UserMapper;
import org.fkit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class UserController {
	/**
	 * �Զ�ע��UserService
	 */
	@Autowired
	@Qualifier("userService")
	private UserService userService;
	
	@RequestMapping(value="/login")
	public ModelAndView login(String loginname,
			String password,
			ModelAndView mv,
			HttpSession session){
		User user=userService.login(loginname, password);
		if(user!=null){
			session.setAttribute("user", user);
			mv.setView(new RedirectView("main"));
		}else{
			mv.addObject("message","��¼�������������������");
			mv.setViewName("loginForm");
		}
		return mv;
	}
	
	
	/**
	 * ֮ǰ����һֱ����ȥ ��Ӧ��controller��ԭ����modelAndView����������
	 * import org.springframework.web.portlet.ModelAndView;������
	 * import org.springframework.web.servlet.ModelAndView;����ȷ��
	 */
}
