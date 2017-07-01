package lab5.prob2;

public class Rectangle implements Figure {
	public double width;
	public double length;
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	@Override
	public double computeArea() {
		return width * length;
	}

}
