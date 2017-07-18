package org.fkit.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * Hello1Controller是一个基于注解的控制器
 * 可以同时处理多个请求动作，并且无需实现任何接口
 * spring-context-4.3.9.RELEASE.jar/org.springframework.stereotype用来指示该类是一个控制器
 * @author Cain
 *
 */
@Controller
public class HelloController {
	private static final Log logger=LogFactory.getLog(HelloController.class);
	
	
	/**
	 * org.springframework.web.bind.annotation.RequestMapping注解
	 * 用来映射请求的URL和请求的方法等，本例用来映射“/hello”
	 * hello只是一个普通的方法；
	 * 该方法用来返回一个视图名或视图名和模型的ModelAndView对象
	 * @return
	 */
	@RequestMapping(value="/test")
	public ModelAndView test(){
		logger.info("hello方法被调用");
		//创建准备返回的ModelAndView对象，该对象通常包含了返回视图名、模型的名称以及模型对象
		ModelAndView mv=new ModelAndView();
		//添加模型数据，可以是任意的POJO对象
		mv.addObject("message","Hello World,This is my first MVCProject Annotation");
		//设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面
		mv.setViewName("/WEB-INF/content/welcome.jsp");
		//返回ModelAndView对象
		return mv;
	}
}
