package standard_exam.Final2015July.prob22;


import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import standard_exam.Final2015July.helperclasses1.CheckoutRecordEntry;
import standard_exam.Final2015July.helperclasses1.TestData;


/*
 * Print to the console the list of book Title – in sorted order -- 
 * in which the book has been checked out on June 27, 2015. 
 * The ordering of the book title is as follows: First sort by the length 
 * of the title (number of characters), then by alphabetical order.  
 */
public class Problem2 {

	public static void main(String[] args) {
		
		Function<CheckoutRecordEntry, Integer> sortByLen = new Function<CheckoutRecordEntry, Integer>() {

			@Override
			public Integer apply(CheckoutRecordEntry entry) {
				return entry.getCopy().getBook().getTitle().length();
			}
		};
		
		Function<CheckoutRecordEntry, String> sortByAlphabet = new Function<CheckoutRecordEntry, String>() {

			@Override
			public String apply(CheckoutRecordEntry entry) {
				return entry.getCopy().getBook().getTitle();
			}
		};
		
		//use this list
		List<CheckoutRecordEntry> list = TestData.INSTANCE.getAllEntries();
		list.stream().filter(e -> e.getCheckoutDate().equals(LocalDate.of(2015, 06, 27)))
		.sorted(Comparator.comparing(sortByLen).thenComparing(sortByAlphabet))
		.forEach(System.out::println);
				
	}
	

}
