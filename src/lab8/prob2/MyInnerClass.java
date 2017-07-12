package lab8.prob2;

import java.util.function.Supplier;

public class MyInnerClass {

	public static void main(String[] args) {
		MyInnerClass myInnerClass = new MyInnerClass();
		MyInnerClass.Print ob = myInnerClass.new Print();
		double randomNumber = ob.get();
		System.out.println(randomNumber);
	}
	
	class Print implements Supplier<Double> {

		@Override
		public Double get() {
			return Math.random();
		}
		
	}

}
