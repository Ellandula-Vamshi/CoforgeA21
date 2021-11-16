package com.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.pojo.CustomerDetails;
import com.demo.repository.CustomerRepository;

public class CustomerService {

	@Autowired
	public CustomerRepository customerrepository;
	
	 public List<CustomerDetails> getAllCustomers()
	 {
		 
		 List<CustomerDetails>customers=new ArrayList<>();
		 customerrepository.findAll().forEach(customers::add);
		 return customers; 

}
	 public void addCustomer(CustomerDetails customer) {
		 customerrepository.save(customer);
	 }
	 public void updateCustomer(Integer id,CustomerDetails customer) {
		 customerrepository.save(customer);
	 }
	 public void deleteCustomer(Integer id) {
		 customerrepository.deleteById(id);
	 }
	 public CustomerDetails getCustomerById(int id) {
			return customerrepository.findById(id).orElse(null);
			
			
			
	}
		
}
