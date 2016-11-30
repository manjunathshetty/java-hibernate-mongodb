package com.hibernate.mongodb.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.hibernate.mongodb.entity.Dog;

public class DogDAO extends AbstractEntityDAO<Dog> {

	public DogDAO() {
		super(Dog.class);
	}

	public List<Dog> findByBreed(String breed) {
		EntityManager em = getEmf().createEntityManager();
		try {
			return em.createQuery("FROM Dog d where d.breed.name=:name", Dog.class)
					.setParameter("name", breed)
					.getResultList();
		} finally {
			em.close();
		}
	}

}
