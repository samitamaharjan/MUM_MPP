package mpp_project;

public class Person {
	private int id;
	private String name;
	private int age
	private String phone;
	private Address address;
	
	public Person(int id, String name, int age, String phone, Address address) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public Address getAddress() {
		return address;
	}
}
