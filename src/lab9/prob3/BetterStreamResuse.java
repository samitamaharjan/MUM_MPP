package lab9.prob3;

import java.util.Arrays;
import java.util.List;
@FunctionalInterface
interface MyFunction<S, T, U, W, R> {
	R apply(S s, T t, U u, W w);
}

public class BetterStreamResuse {
	private static final MyFunction<List<String>, Character, Character, Integer, Long> COUNTWORDS  =
			(words, c, d, len) -> words.stream()
			.filter(w -> w.length() == len)
			.filter(w -> w.indexOf(c) >= 0)
			.filter(w -> w.indexOf(d) == -1)
			.count();
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("MPP", "FPP", "SAMITA", "FPA", "FA", "SPP", "FP");
		System.out.println(COUNTWORDS.apply(list, 'P', 'F', 3));
		System.out.println(COUNTWORDS.apply(list, 'S', 'F', 6));
		System.out.println(COUNTWORDS.apply(list, 'F', 'P', 2));
	}
}


