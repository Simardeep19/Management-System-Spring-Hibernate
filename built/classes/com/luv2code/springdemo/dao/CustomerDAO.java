package com.luv2code.springdemo.dao;

import java.util.List;
import com.luv2code.springdemo.entity.Customer;

public interface CustomerDAO {
	
	public  List<Customer> getCustomers();

	public Object saveCustomer(Customer theCustomer);

	public Customer getCustomers(int theId);

}
