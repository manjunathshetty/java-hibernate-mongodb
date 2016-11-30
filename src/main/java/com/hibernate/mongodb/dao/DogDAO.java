package com.hibernate.mongodb.dao;

import com.hibernate.mongodb.entity.Dog;

public class DogDAO extends AbstractEntityDAO<Dog> {

	public DogDAO() {
		super(Dog.class);
	}

}
