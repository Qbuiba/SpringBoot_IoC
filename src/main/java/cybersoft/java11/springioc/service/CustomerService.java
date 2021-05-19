package cybersoft.java11.springioc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cybersoft.java11.springioc.model.Customer;
import cybersoft.java11.springioc.repository.CustomerRepositoryInf;

public class CustomerService implements CustomerServiceInf {
	@Autowired
	CustomerRepositoryInf _repository;

	@Override
	public List<Customer> findAll() {
		return _repository.findAll();
	}

}
