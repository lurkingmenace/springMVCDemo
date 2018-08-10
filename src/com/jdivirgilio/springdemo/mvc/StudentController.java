package com.jdivirgilio.springdemo.mvc;

import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Value("#{countryOptions}")
	private LinkedHashMap<String, String> countryOps = new LinkedHashMap<>();
	
	@RequestMapping("/showform")
	public String showForm(Model model) {
		
		Student student = new Student();
		
		model.addAttribute("student", student);
		
		model.addAttribute("countryOps", countryOps);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student) {
		return "student-confirmation";
	}
}
