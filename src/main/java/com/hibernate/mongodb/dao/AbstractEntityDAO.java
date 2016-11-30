package com.hibernate.mongodb.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class AbstractEntityDAO<T> {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("ogm");
	private Class<?> type;

	public AbstractEntityDAO(Class<?> type) {
		this.type = type;
	}

	public EntityManagerFactory getEmf() {
		return this.emf;
	}

	public void persist(T object) {
		EntityManager entityManager = emf.createEntityManager();
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(object);
			entityManager.getTransaction().commit();
		} finally {
			if (entityManager != null)
				entityManager.close();
		}
	}

}
