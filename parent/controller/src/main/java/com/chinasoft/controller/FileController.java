package com.chinasoft.controller;

import java.awt.AWTException;
import java.awt.Canvas;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Robot;
import java.io.File;

import javax.swing.JFrame;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.chinasoft.model.Role;

@Controller
@RequestMapping("/fileController")
public class FileController {

	@RequestMapping("/list")
	public ModelAndView index2(@RequestParam("i") int i, Model model) {
		ModelAndView mv = new ModelAndView();

		// Role role=null;
		// role = new Role();
		// long id= System.currentTimeMillis();
		// role.setId(id);
		// role.setNote("note");
		// role.setRoleName("roleName");
		// roleService.createRole(role);
		//
		// model.addAttribute("message",id);
		//
		// mv.setViewName("index2");
		return mv;
	}

	@RequestMapping("/create")
	public ModelAndView create() {
		ModelAndView mv = new ModelAndView();


		return mv;
	}

}
