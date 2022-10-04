package com.web.demo.service;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.demo.model.Customer;
import com.web.demo.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	
	public List<Customer> getAllCustomers(){
		return customerRepository.findAll();

	}
	
	public Customer getCustomer(int id) {
		return customerRepository.findById(id).orElse(null);
	}

	public void addCustomer(Customer customer) {
		customerRepository.save(customer);
		
	}

	public void updateCustomer(int id,Customer customer) {
		customerRepository.save(customer);
		
	}

	public void deleteCustomer(int id) {
		customerRepository.deleteById(id);
	}
}
