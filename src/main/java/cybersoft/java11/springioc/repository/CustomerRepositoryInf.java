package cybersoft.java11.springioc.repository;

import java.util.List;

import cybersoft.java11.springioc.model.Customer;

public interface CustomerRepositoryInf {
	List<Customer> findAll();
}
