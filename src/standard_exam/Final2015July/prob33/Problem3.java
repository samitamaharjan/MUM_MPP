package standard_exam.Final2015July.prob33;



import java.util.Iterator;
import java.util.List;

import standard_exam.Final2015July.helperclasses1.Book;
import standard_exam.Final2015July.helperclasses1.LibraryMember;
import standard_exam.Final2015July.helperclasses1.TestData;
public class Problem3 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Problem3 p = new Problem3();
		List<LibraryMember> members = TestData.INSTANCE.getMembers();
		p.books = TestData.INSTANCE.getAllBooks().iterator();
		
		
	}
	Iterator<Book> books;
	
	public LibraryMember detectIfWinnerDuringCheckout(List<LibraryMember> mems)  {
		return null;
		//fix this
//		return mems.stream().filter(mem -> 
//		       mem.checkout(books.next().getNextAvailableCopy(), LocalDate.now(), LocalDate.of(2015, 9, 1))
//		          .getCheckoutRecordEntries().size() == 10)
//		    .findFirst().orElse(null);
		
		
	}
}
