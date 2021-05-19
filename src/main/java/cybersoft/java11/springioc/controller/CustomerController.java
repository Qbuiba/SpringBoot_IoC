package cybersoft.java11.springioc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cybersoft.java11.springioc.service.CustomerServiceInf;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerServiceInf _service;

	@GetMapping("")
	public Object findAll() {
		return _service.findAll();
	}

}
