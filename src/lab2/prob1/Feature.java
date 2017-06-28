package lab2.prob1;

public class Feature {
	private int hourRequired;
	private int percentageRemaining;
	
	public Feature(int hourRequired, int percentageRemaining) {
		this.hourRequired = hourRequired;
		this.percentageRemaining = percentageRemaining;
	}

	public int getHourRequired() {
		return hourRequired;
	}

	public int getPercentageRemaining() {
		return percentageRemaining;
	}
}
