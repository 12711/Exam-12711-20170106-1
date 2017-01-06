package com.lsm.mapper;

import org.apache.ibatis.annotations.Param;

import com.lsm.dto.Customer;

public interface CustomerMapper {
  
	public Customer queryByFirName(@Param("firstName") String firstName);
	
}
