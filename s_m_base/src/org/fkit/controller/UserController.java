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
	 * 自动注入UserService
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
			mv.addObject("message","登录名密码错误，请重新输入");
			mv.setViewName("loginForm");
		}
		return mv;
	}
	
	
	/**
	 * 之前请求一直进不去 对应的controller，原因是modelAndView导包导错了
	 * import org.springframework.web.portlet.ModelAndView;（错误）
	 * import org.springframework.web.servlet.ModelAndView;（正确）
	 */
}
