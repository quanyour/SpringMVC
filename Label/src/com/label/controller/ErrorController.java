package com.label.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.DataBinder;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.label.bean.ErrorBean;
import com.label.validator.ErrorValidator;

@Controller
public class ErrorController {
	
	@RequestMapping(value="/registerForm",method=RequestMethod.GET)
	public String registerForm(Model model){
		ErrorBean errorBean=new ErrorBean();
		model.addAttribute("errorBean",errorBean);
		return "registerForm";
	}
	
	@InitBinder
	public void initBinder(DataBinder binder){
		binder.setValidator(new ErrorValidator());
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String register(@Validated ErrorBean errorBean,Errors error){
		if(error.hasFieldErrors()){
			return "registerForm";
		}
		return "submit";
	}
}
