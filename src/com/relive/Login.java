package com.relive;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Login {
//	@RequestMapping
//	public String index(){
//		return "index";
//	}
	@RequestMapping(value="login")
	public ModelAndView login(){
		System.out.println("*******已经进入******");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("welcome");
		mav.addObject("message", "hello modelAndView");
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("c++");
		list.add("oracle");
		mav.addObject("list",list);
		Map<String,String> map = new HashMap<String,String>();
		map.put("张三", "北京");
		map.put("李四", "上海");
		map.put("王五", "深圳");
		mav.addObject("map",map);
		return mav;
	}
}
