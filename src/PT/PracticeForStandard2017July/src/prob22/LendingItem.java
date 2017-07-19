package PT.PracticeForStandard2017July.src.prob22;

public class LendingItem {
	private int numCopiesInLib;

	public int getNumCopiesInLib() {
		return numCopiesInLib;
	}

	public void setNumCopiesInLib(int numCopiesInLib) {
		this.numCopiesInLib = numCopiesInLib;
	}
	
	@Override
	public boolean equals(Object ob) {
		if (ob == null || ob.getClass() != this.getClass()) return false;
		LendingItem ob1 = (LendingItem) ob;
		return ob1.getNumCopiesInLib() == this.getNumCopiesInLib();
	}
}
