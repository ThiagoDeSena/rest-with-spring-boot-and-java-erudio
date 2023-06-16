package br.com.erudio.services;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import br.com.erudio.model.Person;

@Service
public class PersonServices {
	
	private final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PersonServices.class.getName());
	
	public List<Person> findAll() {
		
		logger.info("Finding all people!");
		
		List<Person> persons = new ArrayList<>();
		for(int i=0;i<8;i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}
		return persons ;
		
	}
	
	
	public Person findById(String id) {
		
		logger.info("Finding one person!");
		
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Thiago");
		person.setLastName("Lima");
		person.setAddress("Jereissati II - Pacatuba");
		person.setGender("Male");
		return person;
	}

	public Person create(Person person) {
		
		logger.info("Creating one person!");
		
		return person;
	}
	
	public Person update(Person person) {
		
		logger.info("Updating one person!");
		
		return person;
	}
	
	public void delete(String id) {
		
		logger.info("Deleting one person!");
		
	}
	
	private Person mockPerson(int i) {
		
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Person name" + i );
		person.setLastName("Lima name" + i);
		person.setAddress("Conjunto Tímbo" + i);
		person.setGender("Male");
		return person;
	}


}
