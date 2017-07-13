package lab9.prob4;

import java.util.stream.IntStream;

public class Solutions4 {
	public static void printSquares(int num) {
		IntStream stream = IntStream.iterate(1, n -> n + 1);
		stream.limit(num)
		.map(n -> n * n)
		.forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		printSquares(5);
	}
}
