package lab8.prob2;

import java.util.function.Supplier;

public class Problem2 {

	public static void main(String[] args) {
		//Problem2 myInnerClass = new Problem2();
		Problem2.Print ob = new Problem2().new Print(5);
		double randomNumber = ob.get();
		System.out.println(randomNumber);
	}
	
	class Print implements Supplier<Double> {
		int x;
		Print(int x){
			this.x = x;
		}
		@Override
		public Double get() {
			return Math.random();
		}
		
	}

}
