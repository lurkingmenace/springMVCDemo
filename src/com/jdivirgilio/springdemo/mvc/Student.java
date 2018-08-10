package com.jdivirgilio.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	
	// Now we want to populate the country options and read them to populate the form:select drop down
	private LinkedHashMap<String, String> countryOps = new LinkedHashMap<>(); // name/value pair

	public Student(String first, String last) {
		firstName = first;
		lastName = last;
	}

	public Student() {
		// Using ISO country codes as key 
		System.out.println("Student constructor");
		this.countryOps.put("FR",  "France");
		this.countryOps.put("DEU",  "Germany");
		this.countryOps.put("GBR",  "United Kingdom");
		this.countryOps.put("US",  "United States");
		System.out.println("leaving constructor");
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
		this.country = countryOps.get(country);
	}

	public LinkedHashMap<String, String> getCountryOps() {
		return countryOps;
	}
}
