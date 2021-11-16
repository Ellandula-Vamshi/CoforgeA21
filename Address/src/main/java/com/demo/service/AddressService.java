package com.demo.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.repository.AddressRepositary;
import com.demo.pojo.Address;

import com.demo.controller.AddressController;

@Service
public class AddressService {
	@Autowired
	public AddressRepositary addressRepository;
	
	 public List<Address> getAllAddresss(){
		 
		 List<Address>addresss=new ArrayList<>();
		 
		 addressRepository.findAll().forEach(addresss::add);
		 return addresss; 

}
	 public void addAddress(Address address) {
		 addressRepository.save(address);
	 }
	 public void updateAddress(Integer id,Address address) {
		 addressRepository.save(address);
	 }
	 public void deleteAddress(Integer id) {
		 addressRepository.deleteById(id);
	 }
	 public Address getAddressById(int id) {
			return addressRepository.findById(id).orElse(null);
			
			
			
	}
		
}




