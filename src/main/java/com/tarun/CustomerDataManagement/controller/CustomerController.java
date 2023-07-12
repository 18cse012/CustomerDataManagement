package com.tarun.CustomerDataManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tarun.CustomerDataManagement.Dto.ResponseStructure;
import com.tarun.CustomerDataManagement.entity.Customer;
import com.tarun.CustomerDataManagement.entity.CustomerDTO;
import com.tarun.CustomerDataManagement.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService  service;
	
	@PostMapping("/Customer")
	public @ResponseBody ResponseStructure<Customer> saveCustomerData(@RequestBody CustomerDTO  dto) {
		return service.saveCustomerData(dto);
	}
	
	@PostMapping("/customer")
	public @ResponseBody ResponseStructure<Customer>updateCustomerData(@RequestBody Customer customer) {
		return service.updateCustomer(customer);
	}
	  
	@GetMapping("/customer")
	public @ResponseBody ResponseStructure<List<Customer>> getAllCustomer() {
		return service.getAllCustomerData();
	}
	@GetMapping("/customerbyname/{name}")
	public @ResponseBody List<Customer> getCustomerByName(String name) {
		  return service.getCustomerByName(name);
	  }
	@PostMapping("/validateCustomer/")
	public List<Customer> validateCustomer(@RequestParam("name")String name,@RequestParam("email")String email){
		return service.validateCustomers(name, email);
	}
	
	
}
