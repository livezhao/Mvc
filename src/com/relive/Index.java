package com.relive;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Index {

	@RequestMapping(value="index")
	public ModelAndView index(){
		return new ModelAndView("index");
	}
	
	@RequestMapping(value="add")
	public ModelAndView add(){
		return new ModelAndView("welcome");
	}
	
}
