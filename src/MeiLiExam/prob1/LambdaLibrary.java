package MeiLiExam.prob1;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {

	//public static final String IMPLEMENT = "IMPLEMENT";
	
	public static final TriFunction<List<LibraryMember>, String, Character, String> IMPLEMENT = 
			(list, state, letter) -> list.stream()
			.filter(member -> member.getAddress().getState().equalsIgnoreCase(state))
			.filter(member -> member.getFirstName().charAt(0) > letter)
			.map(member -> member.getFirstName() + " " + member.getLastName())
			.collect(Collectors.joining(" "));
}
