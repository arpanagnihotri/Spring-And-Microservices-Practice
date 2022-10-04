package com.web.demo.service;
import java.util.*;
import java.util.List;

import org.springframework.stereotype.Service;

import com.web.demo.model.Customer;

@Service
public class CustomerService {
	
	private List<Customer> customers=new ArrayList<>(Arrays.asList(
			new Customer(1,"Santosh",22),
			new Customer(2,"Ramu",24),
			new Customer(3,"Raju",25),
			new Customer(4,"Pathan",26),
			new Customer(5,"Rampat",34),
			new Customer(6,"Sheela",22),
			new Customer(7,"Munni",26),
			new Customer(8,"Pinki",27),
			new Customer(9,"Majhri",25),
			new Customer(10,"Paritosh",30)));
	
	public List<Customer> getAllCustomers(){
		return customers;
	}
	
	public Customer getCustomer(int id) {
		return customers.stream().filter(c->c.getId()==(id)).findFirst().get();
	}

	public void addCustomer(Customer customer) {
		customers.add(customer);
		
	}

	public void updateCustomer(int id,Customer customer) {
		for(int i=0;i<customers.size();i++) {
			Customer c=customers.get(i);
			if(c.getId()==id) {
				customers.set(i, customer);
				return;
			}
		}
		
	}

	public void deleteCustomer(int id) {
		customers.removeIf(c->c.getId()==id);
	}
}
