package cybersoft.java11.springioc.model;

public class Address {
	private String number;
	private String street;
	private String district;
	private String city;

	public Address() {
		this.number = "459";
		this.street = "Su Van Hanh";
		this.district = "Quan 10";
		this.city = "Ho Chi Minh";
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
