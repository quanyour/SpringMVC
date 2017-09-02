package com.label.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.label.bean.CheckBoxes;

@Controller
public class CheckBoxesController {
	
	@RequestMapping(value="checkboxes",method=RequestMethod.GET)
	public String registerForm(Model model){
		CheckBoxes checkBoxes=new CheckBoxes();
		List<String> list=new ArrayList<>();
		list.add("javaee");
//		list.add("spring");
		checkBoxes.setCourses(list);
		
//		List<String> courseList=new ArrayList<>();
//		courseList.add("javaee");
//		courseList.add("mybatis");
//		courseList.add("spring");
		Map<String, String> courseMap=new HashMap<String,String>();
		courseMap.put("javaee", "JAVAEE");
		courseMap.put("mybatis", "Mybatis");
		
		
		model.addAttribute("checkboxer",checkBoxes);
//		model.addAttribute("courseList",courseList);
		model.addAttribute("courseMap",courseMap);
		return "checkboxesForm";
	}
}
