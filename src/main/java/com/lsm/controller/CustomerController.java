package com.lsm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lsm.dto.Customer;
import com.lsm.dto.ResponseData;
import com.lsm.service.CustomerService;

@RestController
@RequestMapping(path = "/customer")
public class CustomerController {
	@Autowired
	CustomerService customerService;

	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public ResponseData<Customer> login(@RequestParam(name = "name") String name) {
		 System.out.println(name);
		Customer customer = customerService.queryByFirName(name);
		ResponseData<Customer> responseData = new ResponseData<>();
		System.out.println(customer);
		if (customer == null) {  
			responseData.setMessage("用户不存在,登录失败!");
		} else {
			List<Customer> customers = new ArrayList<>();
			customers.add(customer);
			responseData.setFilms(customers);
		}
		return responseData;
	}
}
