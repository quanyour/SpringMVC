package com.label.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.label.bean.User;

@Controller
public class UserController {
	
	@RequestMapping(value="/checkboxForm",method=RequestMethod.GET)
	public String registerFrom(Model model){
		User user=new User();
		user.setReader(true);
		List<String> list=new ArrayList<>();
		list.add("javaee");
		list.add("spring");
		user.setCourses(list);
		model.addAttribute("user", user);
		return "checkboxForm";
	}
}
