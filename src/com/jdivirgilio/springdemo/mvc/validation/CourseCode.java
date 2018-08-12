package com.jdivirgilio.springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD } )
@Retention( RetentionPolicy.RUNTIME )
public @interface CourseCode {
	//@CourseCode(value="CSE", message="must start with CSE") Supporting this annotation
	
	// Define default course code
	public String value() default "CSE";
	
	// Define default error message 
	public String message() default "must start with CSE";
	
	// Define default groups
	public Class<?>[] groups() default {}; // No groups
	
	// Define default payloads - define custom details about validation failure (severity, error code, etc)
	public Class<? extends Payload>[] payload() default {};
}
