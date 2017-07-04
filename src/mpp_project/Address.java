package mpp_project;

public class Address {
	private String street;
	private String city;
	private String zip;
	private String state;
	private String country;
	
	public Address() {
		
	}
	
	public Address(String street, String city, String zip, String state, String country) {
		this.street = street;
		this.city = city;
		this.zip = zip;
		this.state = state;
		this.country = country;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getZip() {
		return zip;
	}

	public String getState() {
		return state;
	}

	public String getCountry() {
		return country;
	}
}
