package lab9.prob5;

import java.util.Arrays;
import java.util.stream.Stream;

public class Section {
	public static Stream<String> streamSection(Stream<String> stream, int m, int n) {
		if (m <= 0 || m >= n) return null;
		stream.skip(m)
		.limit(n - m + 1)
		.forEach(System.out::println);
		return stream;
	}

	public static void main(String[] args) {
		// Make three calls for the streamSection() method with different inputs
		// use nextStream() method to supply the Stream input as a first
		// argument in streamSection() method
		streamSection(nextStream(), 4 , 6);
		System.out.println("=========");
		streamSection(nextStream(), 1 , 2);
		System.out.println("=========");
		streamSection(nextStream(), 0 , 6);
	}

	// support method for the main method -- for testing
	private static Stream<String> nextStream() {
		return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh", "iii").stream();
	}
}