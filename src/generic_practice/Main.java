package generic_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(25, 6, 30, 32);
		List<Integer> list2 = Arrays.asList(6, 32, 5, 10);
		
		List<Integer> list = new ArrayList<>();
		list.addAll(list1);
		list.addAll(list2);
		
		Stream<Integer> stream1 = Stream.concat(list1.stream(), list2.stream());
		
		List<Integer> result = stream1
		.distinct()
		.filter(e -> list1.contains(e) && list2.contains(e))
		.collect(Collectors.toList());
		
		System.out.println(result);
	}
}
