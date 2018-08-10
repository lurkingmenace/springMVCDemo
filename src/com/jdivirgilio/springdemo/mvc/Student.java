package com.jdivirgilio.springdemo.mvc;

public class Student {

	private String firstName;
	private String lastName;

	public Student(String first, String last) {
		firstName = first;
		lastName = last;
	}

	public Student() {

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
}
