package PT.PracticeForStandard2017July.src.prob22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Admin {
	//Returns phone numbers (in sorted order) of the Library Members who have ever checked out the specified lending item
	public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
		List<String> phoneNums = ArrayList<String>();
		
				phoneNums = Arrays.stream(members)
				.filter(mem -> mem.getCheckoutRecord().getCheckoutEntryList().contains(item))
				.map(mem -> mem.getPhone())
				.sorted()
				.collect(Collectors.toList());
					
		return phoneNums;
	}
}
