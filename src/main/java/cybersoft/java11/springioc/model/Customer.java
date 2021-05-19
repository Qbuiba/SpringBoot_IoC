package cybersoft.java11.springioc.model;

public class Customer {
	/*
	 * build 1 api "/customer" tra ve danh sach customer cau hinh cac lop,
	 * interface, cho cac lop repository, serviec, controller
	 */
	private String id;
	private String name;
	private String username;
	private String address;
	private String quote;

	public Customer() {
		this.id = "";
		this.name = "Customer A";
		this.username = "cus1";
		this.address = "HCMC";
		this.quote = "This is quote";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}

}
