package com.jdivirgilio.springdemo.mvc;

import java.util.LinkedHashMap;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Value("#{countryOptions}")
	private LinkedHashMap<String, String> countryOps = new LinkedHashMap<>();
	
	@RequestMapping("/showform")
	public String showForm(Model model) {
		
		model.addAttribute("student", new Student());
		
		model.addAttribute("countryOps", countryOps);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public ModelAndView processForm(@Valid @ModelAttribute("student") Student student,
								BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			bindingResult.getModel().keySet().stream().forEach((s) -> { System.out.println(s);
																		System.out.println(bindingResult.getModel().get(s).getClass());
			});
			ModelAndView modelView = new ModelAndView("student-form");
			modelView.addObject("student", new Student());
			modelView.addObject("countryOps", countryOps);
			return modelView; 
		}
		else {
			return new ModelAndView("student-confirmation");
		}
	}
}
