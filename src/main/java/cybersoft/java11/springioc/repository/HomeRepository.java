package cybersoft.java11.springioc.repository;

import java.util.ArrayList;
import java.util.List;

import cybersoft.java11.springioc.model.Home;

public class HomeRepository implements HomeRepositoryInf {
	private List<Home> homeList;

	public HomeRepository() {
		homeList = new ArrayList<Home>();
		homeList.add(new Home());
		homeList.add(new Home());
		homeList.add(new Home());
		System.out.println("Home repository has been instantited");
	}

	@Override
	public List<Home> findAll() {
		return homeList;
	}
}
