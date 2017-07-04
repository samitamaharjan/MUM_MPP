package mpp_project;

public class LibraryMember extends Person {
	CheckoutRecord checkoutRecord;
	
	public LibraryMember(int id, String name, String phone, Address address) {
		super(id, name, phone, address);
	}

}
