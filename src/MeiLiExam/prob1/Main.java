package MeiLiExam.prob1;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
		
	public static void main(String[] args) {
		
		List<LibraryMember> sampleData = TestData.getLibraryMembers();
		sampleData.stream().forEach(System.out::println);
		
		System.out.println("\n Part A");
		//Create a stream pipeline that prints to the console 
		//the full names(first name and last name separated by a space)
		//of Library Members who live in the state of CA 
		//and whose first name starts after the letter 'M', 
		//sorted by age in ascending order.	
		String names = sampleData.stream()
		.filter(member -> member.getAddress().getState().equalsIgnoreCase("CA"))
		.filter(member -> member.getFirstName().charAt(0) > 'M')
		.map(member -> member.getFirstName() + " " + member.getLastName())
		.collect(Collectors.joining(" "));
		
		System.out.println(names);
		
		System.out.println("\n Part B");
		//Turn the stream pipeline from Part A into a LambdaLibrary item 
		//and evaluate it here.
		
		System.out.println(LambdaLibrary.IMPLEMENT.apply(sampleData, "CA", 'M'));
				
		System.out.println("\n Part C");
		//Replace all lambda expressions in the stream pipeline from Part A 
		//with instances of inner classes/functors.
		Predicate<LibraryMember> filterbyState = new Predicate<LibraryMember>() {

			@Override
			public boolean test(LibraryMember member) {
				return member.getAddress().getState().equalsIgnoreCase("CA");
			}
		};
		
		Predicate<LibraryMember> filterbyLetterM = new Predicate<LibraryMember>() {

			@Override
			public boolean test(LibraryMember member) {
				return member.getFirstName().charAt(0) > 'M';
			}
		};
		
		Function<LibraryMember, String> map = new Function<LibraryMember, String>() {

			@Override
			public String apply(LibraryMember member) {
				return member.getFirstName() + " " + member.getLastName();
			}
		};
		
		String names2 = sampleData.stream()
				.filter(filterbyState)
				.filter(filterbyLetterM)
				.map(map)
				.collect(Collectors.joining(" "));
		System.out.println(names2);
		
		
		System.out.println("\n Part D");
		//Extra Credit: Create a stream pipeline that uses the reduce method 
		//to get the Library member who has checked out the greatest number of book copies. 
		//You may assume there is exactly one such member.
		Optional<LibraryMember> mem = sampleData.stream()
				.reduce((m1, m2) ->
					m1.getCheckedOutCopies().size() > m2.getCheckedOutCopies().size() ? m1 : m2);
		if (mem.isPresent()) {
			System.out.println(mem.get());
		}
	}
}
