package com.tarun.CustomerDataManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tarun.CustomerDataManagement.entity.Person;

public interface PersonRepository  extends JpaRepository<Person, Integer>{

}
