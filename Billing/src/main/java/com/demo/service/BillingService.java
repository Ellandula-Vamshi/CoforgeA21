package com.demo.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.repository.BillungRepository;
import com.demo.pojo.BillingPojo;

import com.demo.controller.BillingController;

@Service
public class BillingService {

	@Autowired
	public BillungRepository billRepo;
	 public List<BillingPojo> getAllBillings(){
		 
		 List<BillingPojo>billings=new ArrayList<>();
		 
		 billRepo.findAll().forEach(billings::add);
		 return billings; 

}
	 public void addBilling(BillingPojo billing)
	 {
		 billRepo.save(billing);
	 }
	 
	 public void updateBilling(Integer id,BillingPojo billing)
	 {
		 billRepo.save(billing);
	 }
	 
	 public void deleteBilling(Integer id)
	 {
		 billRepo.deleteById(id);
	 }
	 
	 public BillingPojo getBillingById(int id) 
	 {
			return billRepo.findById(id).orElse(null);
			
			
			
	}
		
}


