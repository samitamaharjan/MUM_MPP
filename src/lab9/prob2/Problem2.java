package lab9.prob2;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Problem2 {
	public static void main(String[] args) {
		IntStream intStream = IntStream.of(10, 15, 25, 65, 18);
		IntSummaryStatistics stat = intStream.summaryStatistics();
		int max = stat.getMax();
		System.out.println("The maximum value is: " + max);
		
		int min = stat.getMin();
		System.out.println("The minimum value is: " + min);
	}
}
