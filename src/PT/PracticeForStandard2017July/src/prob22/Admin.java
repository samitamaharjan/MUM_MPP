package PT.PracticeForStandard2017July.src.prob22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Admin {
	//Returns phone numbers (in sorted order) of the Library Members who have ever checked out the specified lending item
	public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
		List<String> phoneNums = new ArrayList<String>();
			Predicate<LibraryMember> filterby = new Predicate<LibraryMember>() {
				@Override
				public boolean test(LibraryMember mem) {
					List<CheckoutRecordEntry> entries =  mem.getCheckoutRecord().getCheckoutEntryList();
					for (CheckoutRecordEntry entry : entries) {
						if (entry.getLendingItem().equals(item)) return true;
					}
					return false;
				}
			};
		
			phoneNums = Arrays.stream(members)
					.filter(filterby)
					.map(mem -> mem.getPhone())
					.sorted()
					.collect(Collectors.toList());
			
		return phoneNums;
	}
}
