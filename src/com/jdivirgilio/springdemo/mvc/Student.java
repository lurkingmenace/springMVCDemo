package com.jdivirgilio.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private String programmingLanguage;
	private LinkedHashMap<String, String> favoriteProgrammingLanguages = new LinkedHashMap<>();
	
	public Student(String first, String last) {
		firstName = first;
		lastName = last;
	}

	public Student() {
		favoriteProgrammingLanguages.put("Java", "Java");
		favoriteProgrammingLanguages.put("C++", "C++");
		favoriteProgrammingLanguages.put("Go", "Go");
		favoriteProgrammingLanguages.put("JavaScript", "JavaScript");
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
}
