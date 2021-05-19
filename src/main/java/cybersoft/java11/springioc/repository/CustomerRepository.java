package cybersoft.java11.springioc.repository;

import java.util.ArrayList;
import java.util.List;

import cybersoft.java11.springioc.model.Customer;

public class CustomerRepository implements CustomerRepositoryInf {

	List<Customer> customerList;

	public CustomerRepository() {
		customerList = new ArrayList<Customer>();
		customerList.add(new Customer());
		customerList.add(new Customer());
		customerList.add(new Customer());
		customerList.add(new Customer());
	}

	@Override
	public List<Customer> findAll() {
		return customerList;
	}

}
