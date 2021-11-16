package com.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.pojo.CustomerDetails;
import com.demo.service.CustomerService;
import com.demo.controller.CustomerController;

public interface CustomerRepository extends CrudRepository<CustomerDetails, Integer>{

}
