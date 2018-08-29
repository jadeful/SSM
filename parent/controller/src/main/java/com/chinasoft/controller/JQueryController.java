package com.chinasoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/jquery")
public class JQueryController {
	@RequestMapping("/find")
	public ModelAndView homePage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("find");
		return mv;
	}
}
