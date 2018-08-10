package com.jdivirgilio.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller // This inherits from @Controller so Spring picks it up when scanning
public class HomeController {

	@RequestMapping("/") // When the user access this address this will be invoked
	public String showMyPage() {// this could be named anything..hook is the @
		return "main-menu";  // this is the VIEW name. 
		// Spring will use prefix and suffix from WEB-INF/view/spring-mvcdemo-servlet.xml
	}
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// new controller method to read form data and add data to the model
	@RequestMapping("/processFormVersonTwo")
	// 1st part was using HttpServletRequest object to read the data
	// 2nd we're going to use annotations to inject the values
	public String toUpper(@RequestParam("firstName") String name,
						  @RequestParam("lastNmae") String lastName,
						  Model model) { // Container for your data - initially it's empty..and you can add data to it
			
		// Not needed now because we're using injection
		//String name = request.getParameter("firstName"); // Form has a field name studentName. THis reads and assigns the data
		//String lastName = request.getParameter("lastName");
		
		name = name.toUpperCase();
		lastName = lastName.toUpperCase();
		
		String result = "Hi " + name + " " + lastName;
		
		model.addAttribute("message", result); // adding data back to the model. name : value pair.
		
		return "helloworld"; // returns control to the helloworld page
	}
}
