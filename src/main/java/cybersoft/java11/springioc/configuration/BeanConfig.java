package cybersoft.java11.springioc.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cybersoft.java11.springioc.repository.CustomerRepository;
import cybersoft.java11.springioc.repository.CustomerRepositoryInf;
import cybersoft.java11.springioc.repository.HomeRepository;
import cybersoft.java11.springioc.repository.HomeRepositoryInf;
import cybersoft.java11.springioc.service.CustomerService;
import cybersoft.java11.springioc.service.CustomerServiceInf;
import cybersoft.java11.springioc.service.HomeService;
import cybersoft.java11.springioc.service.HomeServiceInf;

@Configuration
public class BeanConfig {
	@Bean
	public HomeRepositoryInf homeRepositoryInf() {
		// configuration to instatiate components
		return new HomeRepository();

	}

	@Bean
	public HomeServiceInf homeServiceInf() {
		// configuration to instatiate components
		return new HomeService();

	}

	@Bean
	public CustomerRepositoryInf customerRepositoryInf() {
		// configuration to instatiate components
		return new CustomerRepository();

	}

	@Bean
	public CustomerServiceInf customerServiceInf() {
		// configuration to instatiate components
		return new CustomerService();

	}
}
