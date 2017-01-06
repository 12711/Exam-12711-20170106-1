package com.lsm.dto;

/*用户实体*/
public class Customer {
	private String firstName;  

	public Customer(String firstName) {
		super();
		this.firstName = firstName;
	}

	public Customer() {
		super();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}
