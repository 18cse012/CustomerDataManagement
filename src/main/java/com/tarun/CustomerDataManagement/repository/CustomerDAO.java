package com.tarun.CustomerDataManagement.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import com.tarun.CustomerDataManagement.entity.Customer;

@Repository
public class CustomerDAO {

	@Autowired
	private CustomerRepository repository;

	public Customer saveCustomerData(Customer customer) {

		return repository.save(customer);
	}

	public List<Customer> getAllCustomerData() {
		return repository.findAll();
	}

	public Customer getCustomerDataById(int id)
	{
		return repository.findById(id).orElse(new Customer(HttpStatus.NOT_FOUND.value(),HttpStatus.NOT_FOUND.name(),HttpStatus.NOT_FOUND.name()));
	}
	public Customer deletCustomerDataById(int id) {
		Customer customer = getCustomerDataById(id);
		if (customer.getId()!=404) {
			repository.deleteById(id);
		}
		return customer;
		
	}
	

	public List<Customer> getCustomerByName(String name) {

		return repository.findByName(name);
	}

	public List<Customer> validateCustomer(String name, String email) {

		return repository.validateCustomer(name, email);
	}
}
