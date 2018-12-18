package com.assegd.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	// this conroller receives an object from client
	@RequestMapping("home")
	public ModelAndView home(Alien alien) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("Obj", alien);
		mv.setViewName("home");
		

		
		return mv;
	}
	
	
	// this controller receives a single string value from client and assigns the value to the jsp page
	/**
	 	@RequestMapping("home")
	public ModelAndView home(@RequestParam("name") String myName) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", myName);
		mv.setViewName("home");
		

		
		return mv;
	}
	 */
}
