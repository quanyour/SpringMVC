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
		//����user������󣬴洢jspҳ�洫��Ĳ���
		User user=new User();
		user.setLoginname(loginname);
		user.setPassword(password);
		//��User������ӵ�ModeMap��
		modelMap.addAttribute("user",user);
	}
	
	@RenderMapping(value="/login2")
	public String login2(ModelMap modelMap){
		//��modeMap��ȡ��֮ǰ���������user����
		//Modelȡ��Ϊ �� User user=(User)model.asMap().get("user");
		User user=(User) modelMap.get("user");
		System.out.println(user);
		//����user���������
		user.setUsername("����");
		return "result2";
	}
}
