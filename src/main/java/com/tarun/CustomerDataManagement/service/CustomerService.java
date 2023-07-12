package com.tarun.CustomerDataManagement.service;

import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.tarun.CustomerDataManagement.Dto.ResponseStructure;
import com.tarun.CustomerDataManagement.entity.Customer;
import com.tarun.CustomerDataManagement.entity.CustomerDTO;
import com.tarun.CustomerDataManagement.repository.CustomerDAO;

@Service
public class CustomerService {

	@Autowired
	private CustomerDAO dao;

	public ResponseStructure<Customer> saveCustomerData(CustomerDTO dto) {
		
		Customer cus= new Customer(dto);
		Customer customer = dao.saveCustomerData(cus);
		ResponseStructure<Customer> rs = new ResponseStructure<>();
		rs.setData(customer);
		rs.setStatusCode(HttpStatus.OK.value());
		rs.setMessage("Customer Data Saved Successfully");
		rs.setTimeStamp(LocalDateTime.now());
		return rs;	

	}

	public ResponseStructure<Customer> updateCustomer(Customer customer) {
		Customer cus = dao.saveCustomerData(customer);
		ResponseStructure<Customer> rs = new ResponseStructure<>();
		rs.setData(cus);
		rs.setStatusCode(HttpStatus.ACCEPTED.value());
		rs.setTimeStamp(LocalDateTime.now());
		rs.setMessage(HttpStatus.ACCEPTED.name());
		return rs;
	}

	public ResponseStructure<List<Customer>> getAllCustomerData() {

		List<Customer> list = dao.getAllCustomerData();
		ResponseStructure<List<Customer>> rs = new ResponseStructure<>();
		if (list.size() != 0) {

			rs.setStatusCode(HttpStatus.FOUND.value());
			rs.setData(list);
			rs.setTimeStamp(LocalDateTime.now());
			rs.setMessage("customer entry found in database");
		} else {
			rs.setStatusCode(HttpStatus.NOT_FOUND.value());
			rs.setData(null);
			rs.setTimeStamp(LocalDateTime.now());
			rs.setMessage(" no Customer entry found in database");

		}

		return rs;
	}
	public Customer getCustomerDataById(int id){
		return dao.getCustomerDataById(id);
	}
	public Customer deleteCustomerDataById(int id){
		return dao.deletCustomerDataById(id);
	}
	public List<Customer> getCustomerByName(String name) {
		
		return dao.getCustomerByName(name);
	}

	public List<Customer> validateCustomers(String name, String email) {
		return dao.validateCustomer(name, email);
	}
}
