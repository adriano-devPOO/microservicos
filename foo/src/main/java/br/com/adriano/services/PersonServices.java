package br.com.adriano.services;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.com.adriano.model.Person;

@Service
public class PersonServices {

	
	private final AtomicLong counter = new AtomicLong();
	
	public Person findById(String id) {
		
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstname("Adriano");
		person.setLastname("Olimpio");
		person.setAdress("2 Travessa Feaca, 30");
		person.setGender("Masculino");
		
		return person ;
	}
	
}
