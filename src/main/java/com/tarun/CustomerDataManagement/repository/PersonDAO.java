package com.tarun.CustomerDataManagement.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tarun.CustomerDataManagement.entity.Person;

@Repository
public class PersonDAO {
	
	@Autowired
	private PersonRepository repository;
	
	public Person save(Person person) {
		return repository.save(person);
	}
	

}
