package lab3.prob3;

public class Circle {
	private double radius = 1.0;
	private String color = "red";
	
	public Circle(){
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return Math.PI * getRadius() * getRadius();
	}
	
	@Override
	public String toString() {
		return "Radius of cirle is " + getArea();
	}
}
