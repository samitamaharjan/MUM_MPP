package mpp_project;

import java.util.ArrayList;
import java.util.List;

public class CheckoutRecord {
	private List<CheckoutRecordEntry> entry;
	
	public CheckoutRecord(CheckoutRecordEntry e) {
		this.entry = new ArrayList<CheckoutRecordEntry>();
		addEntry(e);
	}

	public List<CheckoutRecordEntry> getEntry() {
		return entry;
	}
	
	public void addEntry(CheckoutRecordEntry e) {
		entry.add(e);
	}
}
