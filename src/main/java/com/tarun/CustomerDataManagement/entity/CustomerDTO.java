package com.tarun.CustomerDataManagement.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CustomerDTO implements Serializable{
	
	private Integer id;
	private String name;
	private String email ;
	

	public  CustomerDTO(Customer customer) {
		this.id=customer.getId();
		this.name=customer.getName();
		this.email=customer.getEmail();
	}
}
