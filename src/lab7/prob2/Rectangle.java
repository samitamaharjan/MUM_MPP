package lab7.prob2;

public class Rectangle implements Polygon {
	private double length, width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double[] getLength() {
		double[] arr = new double[4];
		arr[0] = length;
		arr[1] = width;
		arr[2] = length;
		arr[3] = width;
		return arr;
	}
}
