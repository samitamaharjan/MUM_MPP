package lab7.prob2;

public class EquilateralTriangle implements Polygon {
	private double side;
	
	public EquilateralTriangle(double side) {
		this.side = side;
	}
	
	@Override
	public double[] getLength() {
		double[] arr = new double[3];
		arr[0] = side;
		arr[1] = side;
		arr[2] = side;
		return arr;
	}

}
