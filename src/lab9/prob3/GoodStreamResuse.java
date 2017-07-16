package lab9.prob3;

import java.util.Arrays;
import java.util.List;

public class GoodStreamResuse {
	public static int countWords(List<String> words, char c, char d, int len) {
		int count = (int) words.stream()
				.filter(w -> w.length() == len)
				.filter(w -> w.indexOf(c) >= 0)
				.filter(w -> w.indexOf(d) == -1)
				.count();
		return count;
	}
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("MPP", "FPP", "SAMITA", "FPA", "FA", "SPP");
		System.out.println(countWords(list, 'P', 'F', 3));
		System.out.println(countWords(list, 'A', 'F', 6));
	}
}
