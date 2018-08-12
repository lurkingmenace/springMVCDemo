package com.jdivirgilio.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {
	// @CourseCode(value="CSE", message="must start with CSE") Supporting this annotation
	
	private String coursePrefix;
	
	@Override
	public void initialize(CourseCode courseCode) {
		coursePrefix = courseCode.value(); // X of value=X pair of the value field of the annotation
	}
	
	@Override
	public boolean isValid(String courseCodeValue, ConstraintValidatorContext constraintValidatorContext) {
		// courseCodeValue is the value of the Course Code: from the form
		// constraintValidatorContext will contain extra error information
		boolean bisValid = (courseCodeValue != null) && (courseCodeValue.startsWith(coursePrefix) && 
				(courseCodeValue.length() > 4));
		
		return bisValid;
	}

}
