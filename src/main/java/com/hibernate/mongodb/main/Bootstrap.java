package com.hibernate.mongodb.main;

import com.hibernate.mongodb.dao.BreedDAO;
import com.hibernate.mongodb.dao.DogDAO;
import com.hibernate.mongodb.entity.Breed;
import com.hibernate.mongodb.entity.Dog;

public class Bootstrap {

	public static void main(String[] args) {
		DogDAO dogDAO = new DogDAO();
		BreedDAO breedDAO = new BreedDAO();
		Breed breed = new Breed();
		breed.setName("Dolmison");
		breedDAO.persist(breed);

		Dog dog = new Dog();
		dog.setName("Abe");
		dog.setBreed(breed);

		dogDAO.persist(dog);
		
		System.out.println("Done");
	}

}
