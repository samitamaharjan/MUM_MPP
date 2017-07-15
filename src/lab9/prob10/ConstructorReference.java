package lab9.prob10;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Human {
	String name;
	int age;
	String gender;

	public Human(String name) {
		this.name = name;
	}

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Human(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}

public class ConstructorReference {
	public static void main(String args[]) {
		Human[] list = { new Human("Joe", 35, "Male"), new Human("Jane", 45, "Female"), new Human("John", 30, "Male"),
				new Human("Samita", 32, "Female"), new Human("Janice", 25, "Female")};

		// Query 1 : Print only male canditates
		Stream<Human> stream = Arrays.stream(list);
		stream.filter(n -> n.getGender().equalsIgnoreCase("Male"))
				.forEach(System.out::println);

		// Query 2 : add some more objects to the list, and print the count of
		// female candidates whose age is greater than 30
		Stream<Human> stream1 = Arrays.stream(list);
		long nosOfFemale = stream1.filter(n -> n.getGender().equalsIgnoreCase("Female"))
				.filter(n -> n.age > 30)
				.count();
		System.out.println(nosOfFemale);

		// Query 3 : Practice for method reference Classname::new - Create an
		// object by choosing suitable Interface to the specified
		// constructors(Totally 3 constuctors) and print the object status
		Function<String, Human> const1 = Human::new;
		System.out.println(const1.apply("samita"));
		
		BiFunction<String, Integer, Human> const2 = Human::new;
		System.out.println(const2.apply("samita", 32));
		
		MyFunction<String, Integer, String, Human> const3 = Human::new;
		System.out.println(const3.myFunction("samita", 32, "Female"));

		// Query 4 : convert your Human array into ArrayList of Human by
		// creating a static method, decide your arguments and return type
		List<Human> col1 = arrayToCollection(list);
		System.out.println(col1);
	}

	// Implement the body for Query 4
	public static List<Human> arrayToCollection(Human[] arr){
		Stream<Human> stream = Arrays.stream(arr);
		List<Human> humanList = stream.collect(Collectors.toList());
		return humanList;		
	}
	
	interface MyFunction<S, T, U, R> {
		R myFunction(S name, T age, U gender);
	}
}
