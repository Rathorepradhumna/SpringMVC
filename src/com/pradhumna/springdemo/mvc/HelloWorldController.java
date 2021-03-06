package com.pradhumna.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	//show initial form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//process form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	//a new method to read data
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request , Model model) {
		String theName = request.getParameter("studentName");
		theName = theName.toUpperCase();
		String result = "YO! " + theName;
		model.addAttribute("message" , result);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName , Model model) {
		theName = theName.toUpperCase();
		String result = "Hey! my Friend " + theName;
		model.addAttribute("message" , result);
		
		return "helloworld";
	}
}
