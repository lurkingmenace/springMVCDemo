package com.jdivirgilio.springdemo.mvc;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student {

	// Step 1: define the fields required - Step 2 in student-formjsp
	@NotNull(message="may not be empty")
	@Size(min=1, message="required")
	private String firstName;

	@NotNull(message="may not be empty")
	@Size(min=1, message="required") // This doesn't work for white-space in the field
	private String lastName;
	
	@Min(value=18, message="Minimum age must be 18")
	@Max(value=65, message="Aren't you too old for this")
	private Integer age;

	@Pattern(regexp="^[0-9]{5}", message="only 5 digits")
	private String postalCode;
	
	private String country;
	private String programmingLanguage;
	private LinkedHashMap<String, String> favoriteProgrammingLanguages = new LinkedHashMap<>();
	private ArrayList<String> operatingSystems = new ArrayList<>();
	private LinkedHashMap<String, String> favoriteOSs = new LinkedHashMap<>();
	
	public Student(String first, String last) {
		firstName = first;
		lastName = last;
	}

	public Student() {
		favoriteProgrammingLanguages.put("Java", "Java");
		favoriteProgrammingLanguages.put("C++", "C++");
		favoriteProgrammingLanguages.put("Go", "Go");
		favoriteProgrammingLanguages.put("JavaScript", "JavaScript");
		favoriteOSs.put("Windows 10", "Windows 10");
		favoriteOSs.put("Mac OS", "Mac OS");
		favoriteOSs.put("Linux", "Linux");
		favoriteOSs.put("MSDOS", "MSDOS");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}
	
	public LinkedHashMap<String, String> getFavoriteProgrammingLanguages() {
		return favoriteProgrammingLanguages;
	}

	public LinkedHashMap<String, String> getFavoriteOSs() {
		return favoriteOSs;
	}

	public ArrayList<String> getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(ArrayList<String> operatingSystem) {
		this.operatingSystems = operatingSystem;	
	}
	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}


}
