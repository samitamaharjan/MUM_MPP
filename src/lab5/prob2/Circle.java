package lab5.prob2;

public class Circle implements Figure {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double computeArea() {
		return Math.PI * radius * radius;
	}

}
