package com.hibernate.mongodb.main;

import java.util.List;

import com.hibernate.mongodb.dao.BreedDAO;
import com.hibernate.mongodb.dao.DogDAO;
import com.hibernate.mongodb.entity.Breed;
import com.hibernate.mongodb.entity.Dog;

public class Bootstrap {

	public static void main(String[] args) {
		DogDAO dogDAO = new DogDAO();
		BreedDAO breedDAO = new BreedDAO();
		Breed breed = new Breed();
		breed.setName("Dolmison1");
		//breedDAO.persist(breed);

		Dog dog = new Dog();
		dog.setName("Abe");
		dog.setBreed(breed);
		dogDAO.persist(dog);
		
		
		List<Dog> dogs=dogDAO.findByBreed("Dolmison");
		dogs.forEach(d->System.out.println(d.getName()));
		System.out.println("Done");
	}

}
