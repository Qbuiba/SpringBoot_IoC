package cybersoft.java11.springioc.repository;

import java.util.List;

import cybersoft.java11.springioc.model.Home;

public interface HomeRepositoryInf {
	// higher components will call interface instead of directly
	List<Home> findAll();

}
