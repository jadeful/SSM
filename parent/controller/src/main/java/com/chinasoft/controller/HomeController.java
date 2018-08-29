package com.chinasoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("homeController")
@RequestMapping("/homeController")
public class HomeController {
	
	@RequestMapping("/homePage")
	public ModelAndView homePage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/image")
	public ModelAndView imagePage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("image");
		return mv;
	}

	@RequestMapping("/find")
	public ModelAndView findPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("find");
		return mv;
	}
}
