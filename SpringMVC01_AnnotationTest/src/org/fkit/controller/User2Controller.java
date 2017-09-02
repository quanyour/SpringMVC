package org.fkit.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.fkit.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

@Controller
public class User2Controller {
	//Attribute sx
	
	private static final Log logger=LogFactory.getLog(User2Controller.class);
	
	@ModelAttribute
	public void userMode2(String loginname,String password,ModelMap modelMap){
		logger.info("userMode2");
		//创建user对象对象，存储jsp页面传入的参数
		User user=new User();
		user.setLoginname(loginname);
		user.setPassword(password);
		//将User对象添加到ModeMap中
		modelMap.addAttribute("user",user);
	}
	
	@RenderMapping(value="/login2")
	public String login2(ModelMap modelMap){
		//从modeMap中取出之前存在里面的user对象
		//Model取数为 ： User user=(User)model.asMap().get("user");
		User user=(User) modelMap.get("user");
		System.out.println(user);
		//设置user对象的属性
		user.setUsername("测试");
		return "result2";
	}
}
