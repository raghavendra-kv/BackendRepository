package com.ee.enigma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewController {
	

	@RequestMapping("/")
	public ModelAndView indexPage()
	{
		ModelAndView mav= new ModelAndView("index"); 
		return mav;		
	}
	
	@RequestMapping("/login")
	public ModelAndView loginPage()
	{
		ModelAndView mav= new ModelAndView("login"); 
		return mav;		
	}
}
