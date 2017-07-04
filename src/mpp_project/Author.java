package mpp_project;

public class Author extends Person {
	String credential;
	
	public Author(int id, String name, String phone, Address address, String credential) {
		super(id, name, phone, address);
		this.credential = credential;
	}

}
