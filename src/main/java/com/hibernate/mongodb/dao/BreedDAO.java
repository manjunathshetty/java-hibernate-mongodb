package com.hibernate.mongodb.dao;

import com.hibernate.mongodb.entity.Breed;

public class BreedDAO extends AbstractEntityDAO<Breed> {

	public BreedDAO() {
		super(Breed.class);
	}

}
