package lambda_practice;

import java.util.function.Function;

@FunctionalInterface
interface Circle {
	double area(double r);
	//void apply();
}

public class Test {

	public static void main(String[] args) {
		/*Circle circle = (r) -> Math.PI * r * r;
		
		double result = circle.area(5.5);
		System.out.println(result);
		
		result = circle.area(7.5);
		System.out.println(result);*/
		
		Function<Double, Double> ob = (r) -> Math.PI * r * r;
		Double result = ob.apply(5.5);
		System.out.println(result);
	}
}
