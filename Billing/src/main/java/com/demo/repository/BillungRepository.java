package com.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.service.BillingService;
import com.demo.controller.BillingController;
import com.demo.pojo.BillingPojo;

public interface BillungRepository extends CrudRepository<BillingPojo, Integer> {
	
}


