package lab8.prob2;

import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		
		// i. using method reference
		Supplier<Double> num1 = Math::random;
		System.out.println(num1.get());
		
		// ii. using lambda
		Supplier<Double> num2 = () -> Math.random();
		System.out.println(num2.get());
	}

}




