package com.hibernate.mongodb.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Breed {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
