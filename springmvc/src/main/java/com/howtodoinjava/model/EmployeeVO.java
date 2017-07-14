package com.howtodoinjava.model;

import java.io.Serializable;

import org.springframework.format.annotation.NumberFormat;

public class EmployeeVO implements Serializable{

	 private static final long serialVersionUID = 1L;
	 
	    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

		private String id;
	    private String firstName;
	    private String lastName;
	 
	    //Setters and Getters
	 
	    @Override
	    public String toString() {
	        return "EmployeeVO [id=" + id + ", firstName=" + firstName
	                + ", lastName=" + lastName + "]";
	    }
}
