package lab7.prob2;

public interface Polygon extends ClosedCurve {
	public double[] getLength();
	
	default double computePerimeter() {
		double[] arr = getLength();
		double sum = 0;
		
		for (double a : arr) {
			sum += a;
		}
		return sum;
	}
}
