package PT.PracticeForStandard2017July.src.prob22;

public class CD extends LendingItem {
	private String productId;
	private String title;
	private String company;
	
	public CD(String productId, String title, String company) {
		this.productId = productId;
		this.title = title;
		this.company = company;
	}

	@Override
	public boolean equals(Object ob) {
		if (ob == null || ob.getClass() != this.getClass()) return false;
		CD ob1 = (CD) ob;
		return ob1.productId.equals(productId)
				&& ob1.title.equals(this.title)
				&& ob1.company.equals(this.company)
				&& super.equals(ob);
	}
	
	
}
