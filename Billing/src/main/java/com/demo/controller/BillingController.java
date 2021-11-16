package com.demo.controller;

import com.demo.service.BillingService;
import com.demo.pojo.BillingPojo;
import com.demo.repository.BillungRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillingController {

	
	@Autowired
	private BillingService billingService;
	
	@RequestMapping(method=RequestMethod.GET,value=("/billings"))
	 public List<BillingPojo> getAllBillings(){
		 
		 return billingService.getAllBillings();

}
	
	@RequestMapping(method=RequestMethod.POST,value=("/billings/add"))
	public void addBilling(@RequestBody BillingPojo billing)
	{
		billingService.addBilling(billing);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT,value=("/billings/{id}"))
	public void updateBilling(@PathVariable Integer id,@RequestBody BillingPojo billing)
	{
		billingService.updateBilling(id,billing);
		
	}
	@RequestMapping(method=RequestMethod.DELETE,value=("/billings/{id}"))
	public void DeleteBilling(@PathVariable Integer id)
	{
		billingService.deleteBilling(id);
		
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/billings/{id}")
	
	public BillingPojo findBillingById(@PathVariable int id) 
	{
		return billingService.getBillingById(id);
	}
	
	 
	 
	
}
