package com.chinasoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.chinasoft.model.Role;
import com.chinasoft.service.RoleService;

@Controller("roleController")
@RequestMapping(value="/roleController")
public class RoleController {
	
	@Autowired
	private RoleService roleService = null;
//	
	@RequestMapping("/index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		Role role=null;
		role = new Role();
		long id= System.currentTimeMillis();
		role.setId(id);
		role.setNote("note");
		role.setRoleName("roleName");
		roleService.createRole(role);
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("/index2")
	public ModelAndView index2(@RequestParam("i") int i, Model model) {
		ModelAndView mv = new ModelAndView();
		
		
		Role role=null;
		role = new Role();
		long id= System.currentTimeMillis();
		role.setId(id);
		role.setNote("note");
		role.setRoleName("roleName");
		roleService.createRole(role);
		
		model.addAttribute("message",id);
		
		mv.setViewName("index2");
		return mv;
	}
	
	@RequestMapping("/homePage")
	public ModelAndView homePage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;
	}
}
