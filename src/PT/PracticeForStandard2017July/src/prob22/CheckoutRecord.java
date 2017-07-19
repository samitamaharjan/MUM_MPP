package PT.PracticeForStandard2017July.src.prob22;

import java.util.ArrayList;
import java.util.List;

public class CheckoutRecord {
	private List<CheckoutRecordEntry> checkoutEntryList;
	
	public CheckoutRecord() {
		checkoutEntryList = new ArrayList<>();
	}

	public List<CheckoutRecordEntry> getCheckoutEntryList() {
		return checkoutEntryList;
	}
		
	public void addCheckoutEntry(CheckoutRecordEntry entry) {
		checkoutEntryList.add(entry);
	}
}
