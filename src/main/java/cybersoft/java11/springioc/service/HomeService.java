package cybersoft.java11.springioc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cybersoft.java11.springioc.model.Home;
import cybersoft.java11.springioc.repository.HomeRepositoryInf;

public class HomeService implements HomeServiceInf {

	@Autowired
	private HomeRepositoryInf _repository;

	@Override
	public List<Home> findAll() {
		return _repository.findAll();
	}

}
