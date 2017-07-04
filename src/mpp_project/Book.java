package mpp_project;

import java.util.ArrayList;
import java.util.List;

public class Book {
	private String title;
	private String isbn;
	private boolean availability;
	private List<BookCopy> bookCopies;
	
	public Book(String title, String isbn, boolean availability, BookCopy bc) {
		this.title = title;
		this.isbn = isbn;
		this.availability = availability;
		bookCopies = new ArrayList<>();
		addBookCopy(bc);
	}
	
	public void addBookCopy(BookCopy bc) {
		bookCopies.add(bc);
	}

	public String getTitle() {
		return title;
	}

	public String getIsbn() {
		return isbn;
	}

	public boolean isAvailability() {
		return availability;
	}

	public List<BookCopy> getBookCopies() {
		return bookCopies;
	}	
}
