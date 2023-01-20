package com.takeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {
	@RequestMapping("/hello")
	public String loadForm() {
		return "index.jsp";
	}
	
	@RequestMapping("/student")
	public String another(@RequestParam("sno")  int sno,@RequestParam("sname")  String sname,@RequestParam("sadd")  String sadd, Model model) {
		
		model.addAttribute("no",sno);
		model.addAttribute("name",sname);
		model.addAttribute("address", sadd);
		return"nepal.jsp";
	}
}
