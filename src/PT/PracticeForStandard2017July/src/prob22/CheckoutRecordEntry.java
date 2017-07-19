package PT.PracticeForStandard2017July.src.prob22;

import java.time.LocalDate;

public class CheckoutRecordEntry {
	private LocalDate checkoutDate;
	private LocalDate dueDate;
	private LendingItem lendingItem;
	private ItemType lendingItemType;
	
	public CheckoutRecordEntry(LendingItem item, LocalDate chDate, LocalDate dueDate, ItemType type) {
		this.lendingItem = item;
		checkoutDate = chDate;
		this.dueDate = dueDate;
		this.lendingItemType = type;
	}

	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public LendingItem getLendingItem() {
		return lendingItem;
	}

	public ItemType getLendingItemType() {
		return lendingItemType;
	}
	
	@Override
	public boolean equals(Object ob) {
		if(ob == null || ob.getClass() != this.getClass()) return false;
		CheckoutRecordEntry ob1 = (CheckoutRecordEntry) ob;
		return ob1.getLendingItem().equals(this.getLendingItem());
	}
}
