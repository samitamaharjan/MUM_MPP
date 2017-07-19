package PT.PracticeForStandard2017July.src.prob22;

public class Book extends LendingItem {
	private String isbn;
	private String title;
	private String authorFirstName;
	private String authorLastName;
	
	public Book(String isbn, String title, String fname, String lname) {
		this.isbn = isbn;
		this.title = title;
		authorFirstName = fname;
		authorLastName = lname;
	}

	@Override
	public boolean equals(Object ob) {
		if (ob == null || ob.getClass() != this.getClass()) return false;
		Book ob1 = (Book) ob;
		return ob1.isbn.equals(this.isbn) && ob1.title.equals(this.title)
				&& ob1.authorFirstName.equals(this.authorFirstName)
				&& ob1.authorLastName.equals(authorLastName);
	}
	
	
}
