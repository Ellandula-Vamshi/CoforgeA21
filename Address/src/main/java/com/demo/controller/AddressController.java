package com.demo.controller;
import com.demo.pojo.Address;

import com.demo.service.AddressService;
import com.demo.repository.AddressRepositary;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
	
	@Autowired
	private AddressService addsess;
	
	@RequestMapping(method=RequestMethod.GET,value=("/addresss"))
	
	 public List<Address> getAllAddresss()
	{
		 
		 return addsess.getAllAddresss();

}
	
	@RequestMapping(method=RequestMethod.POST,value=("/address/add"))
	
	public void addAddress(@RequestBody Address address)
	{
		addsess.addAddress(address);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT,value=("/addresss/{id}"))
	
	public void updateAddress(@PathVariable Integer id,@RequestBody Address address)
	{
		addsess.updateAddress(id,address);
		
	}
	@RequestMapping(method=RequestMethod.DELETE,value=("/addresss/{id}"))
	
	public void DeleteAddress(@PathVariable Integer id)
	{
		addsess.deleteAddress(id);
		
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/addresss/{id}")
	
	public Address findAddressById(@PathVariable int id)
	{
		return addsess.getAddressById(id);
	}
	
	 
	 
	
}
