package lab7.prob2;

public class Ellipse implements ClosedCurve {
	private double semiMajorAxis;
	private double ellipseEcc;
	
	public Ellipse(double semiMajorAxis, double ellipseEcc) {
		this.semiMajorAxis = semiMajorAxis;
		this.ellipseEcc = ellipseEcc;
	}
	
	@Override
	public double computePerimeter() {
		return 4 * semiMajorAxis * ellipseEcc;
	}

}
