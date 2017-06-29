package lab3.prob3_composition;

public class Cylinder {
	private double height = 1.0;
	Circle circle;
	
	public Cylinder() {
		
	}
	
	public Cylinder(double radius) {
		circle = new Circle(radius);
	}
	
	public Cylinder(double radius, double height) {
		this(radius);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}
	
	public double getVolume() {
		return circle.getArea() * getHeight();
	}
}
