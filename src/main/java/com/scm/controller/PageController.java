package com.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class PageController {
	@RequestMapping("/home")
	public String sayHello(Model model) {
		model.addAttribute("name", "Substrings techonologies");
		model.addAttribute("Youtube", "www.youtube.com");
		return "home";
	}

	//about route
	@RequestMapping("/aboutPage")
	public String requestMethodName(Model model){
		model.addAttribute("isLogin", true);
		return "about";
	}

    //about services
	@RequestMapping("/services")
	public String requestedServices(){
		return "services";
	}

}
