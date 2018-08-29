package com.chinasoft.controller;

import java.awt.AWTException;
import java.awt.Canvas;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.swing.JFrame;

import org.springframework.stereotype.Controller;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/screen")
public class ScreenController {

	@RequestMapping("/scapture")
	public void screen() {
		
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		GraphicsDevice[] gs = ge.getScreenDevices();
		try {
			Robot robot = new Robot(gs[0]);
			Rectangle screenRect = new Rectangle(0, 0, 1920, 1080);//屏幕尺寸
			BufferedImage bi = robot.createScreenCapture(screenRect);
		} catch (AWTException e) {
			e.printStackTrace();
		}
		finally {
			
		}
		

		
		
	}
}
