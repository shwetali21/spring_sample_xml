package com.spring.fundamentals.service;

import java.util.List;

import com.spring.fundamentals.model.Customer;
import com.spring.fundamentals.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl() {
	}

	//Constructor Injection
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	/* (non-Javadoc)
	 * @see com.spring.fundamentals.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	//Setter Injection
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	//Autowire - byName
	public void setFoo(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
}
