package com.spring.fundamentals.repository;

import java.util.ArrayList;
import java.util.List;

import com.spring.fundamentals.model.Customer;

public class HibernateCustomerRespositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.spring.fundamentals.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();

		Customer customer = new Customer();
		customer.setFirstName("Albus");
		customer.setLastName("Dumbledore");

		customers.add(customer);

		return customers;
	}
}
