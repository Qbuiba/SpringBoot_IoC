package cybersoft.java11.springioc.model;

public class Home {
	private String name;
	private Address address;
	private String owner;

	public Home() {
		this.name = "full house";
		this.address = new Address();
		this.owner = "God";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

}
