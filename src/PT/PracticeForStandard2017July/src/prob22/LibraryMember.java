package PT.PracticeForStandard2017July.src.prob22;

public class LibraryMember {
	private String memberId;
	private String firstName;
	private String LastName;
	private String phone;
	private CheckoutRecord checkoutRecord;
	
	public LibraryMember(String id, String fname, String lname, String phone) {
		memberId = id;
		firstName = fname;
		LastName = lname;
		this.phone = phone;
	}

	public String getMemberId() {
		return memberId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public String getPhone() {
		return phone;
	}

	public CheckoutRecord getCheckoutRecord() {
		return checkoutRecord;
	}

	public void setCheckoutRecord(CheckoutRecord checkoutRecord) {
		this.checkoutRecord = checkoutRecord;
	}
	
}
