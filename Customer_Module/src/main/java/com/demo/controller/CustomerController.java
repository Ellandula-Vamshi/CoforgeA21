package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.pojo.CustomerDetails;

public class CustomerController {

	@Autowired
	
	private Service customerService;
	
	@RequestMapping(method=RequestMethod.GET,value=("/customers"))
	
	 public List<CustomerDetails> getAllCustomers(){
		 
		 return customerService.getAllCustomers();

}
	
	@RequestMapping(method=RequestMethod.POST,value=("/customers/add"))
	public void addCustomer(@RequestBody CustomerDetails customer)
	{
		customerService.addCustomer(customerrepository);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT,value=("/customers/{id}"))
	public void updateCustomer(@PathVariable Integer id,@RequestBody CustomerDetails customer)
	{
		customerService.updateCustomer(id,customer);
		
	}
	@RequestMapping(method=RequestMethod.DELETE,value=("/customers/{id}"))
	public void DeleteCustomer(@PathVariable Integer id)
	{
		customerService.deleteCustomer(id);
		
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/customers/{id}")
	public CustomerDetails findCustomerById(@PathVariable int id) {
		return customerService.getCustomerById(id);
	}
	
	 
	 
	
}
