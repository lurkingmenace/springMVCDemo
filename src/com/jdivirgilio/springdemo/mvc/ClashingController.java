package com.jdivirgilio.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clash")
public class ClashingController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
}
