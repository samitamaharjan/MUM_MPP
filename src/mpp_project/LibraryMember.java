package mpp_project;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LibraryMember extends Person {
	CheckoutRecord checkoutRecord;
	
	public LibraryMember(int id, String name, int age, String phone, Address address) {
		super(id, name, age. phone, address);
	}
	
	public static void main(String[] args) {
	List<LibraryMember> list = new ArrayList<LibraryMember>();
	list.stream()
	.filter(person -> person.getAddress().getState().equalsIgnoreCase("CA"))
	.filter(person -> person.getName().startsWith("M"))
	.sorted(Comparator.comparing(Person::getAge))
	.map(person -> person.get);
	}
}
