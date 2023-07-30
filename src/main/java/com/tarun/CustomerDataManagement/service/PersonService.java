
package com.tarun.CustomerDataManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.tarun.CustomerDataManagement.entity.Person;
import com.tarun.CustomerDataManagement.repository.PersonDAO;

@Service
public class PersonService {
	
	
	@Autowired
	private PersonDAO dao;
	
	public Person save(Person person) {
		
		return dao.save(person);
	}

}
