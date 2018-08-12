package com.jdivirgilio.springdemo.mvc;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {

	// Step 1: define the fields required - Step 2 in student-formjsp
	@NotNull(message="required")
	@Size(min=1, message="required")
	private String firstName;

	@NotNull(message="required")
	@Size(min=1, message="required")
	private String lastName;

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
		this.operatingSystems = operatingSystem;	}
}
