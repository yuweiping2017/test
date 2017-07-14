package com.howtodoinjava.model;

import org.springframework.stereotype.Service;

public class User {
		

	public String id;

	public String name;

	public String birthdata;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthdata() {
		return birthdata;
	}
	public void setBirthdata(String birthdata) {
		this.birthdata = birthdata;
	}
	
}
