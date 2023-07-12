package com.tarun.CustomerDataManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tarun.CustomerDataManagement.entity.Person;
import com.tarun.CustomerDataManagement.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	private PersonService service;
	
	@PostMapping("/person")
	public Person savePerson(@RequestBody Person person) {
		return service.save(person);
	}

	
	//updat person and bank account
	//get all person
	//get all bank account
	//
	
	
	
	
	
	
	
	
	
	
	
	
	
}
