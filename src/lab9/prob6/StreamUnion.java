package lab9.prob6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StreamUnion {
	public static Set<String> union(List<Set<String>> sets) {
		Set<String> set = new HashSet<>();
		Set<String> s = sets.stream()
				.reduce(set, (x, y) -> {
					x.addAll(y); 
					return x;
					});
		return s;
	}
	
	/* Alternative Method:
	 * public static Set<String> union(List<Set<String>> sets) {
			Set<String> s= sets.stream()
				.flatMap(x -> x.stream())
				.collect(Collectors.toSet());
			return s;
	}*/
	
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Samita");
		set.add("Maddy");
		set.add("Alex");
		
		Set<String> set1 = new HashSet<>();
		set1.add("2");
		set1.add("34");
		set1.add("kk");
		
		List<Set<String>> list = new ArrayList<>();
		list.add(set);
		list.add(set1);
		
		Set<String> unionSet = union(list);
		System.out.println(unionSet);
	}
}
