package com.project.start.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

	
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String index1() {
		return "index";
	}
}