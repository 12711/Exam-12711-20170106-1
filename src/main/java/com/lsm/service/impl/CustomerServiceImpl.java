package com.lsm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lsm.dto.Customer;
import com.lsm.mapper.CustomerMapper;
import com.lsm.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerMapper customerMapper;
	@Override
	public Customer queryByFirName(String name) {
		
		return customerMapper.queryByFirName(name);
	}

}
