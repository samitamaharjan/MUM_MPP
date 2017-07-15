package lab9.prob9;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Dish {

    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    public enum Type { MEAT, FISH, OTHER }

    @Override
    public String toString() {
        return name;
    }

    public static final List<Dish> menu =
		Arrays.asList( new Dish("pork", false, 800, Dish.Type.MEAT),
                           new Dish("beef", false, 700, Dish.Type.MEAT),
                           new Dish("chicken", false, 400, Dish.Type.MEAT),
                           new Dish("french fries", true, 530, Dish.Type.OTHER),
                           new Dish("rice", true, 350, Dish.Type.OTHER),
                           new Dish("season fruit", true, 120, Dish.Type.OTHER),
                           new Dish("pizza", true, 550, Dish.Type.OTHER),
                           new Dish("prawns", false, 400, Dish.Type.FISH),
                           new Dish("salmon", false, 450, Dish.Type.FISH));
    
    // a. Is there any Vegetarian meal available ( return type boolean)
    public static boolean isVegAvailable() {
    	Optional<Dish> isAvailable =  menu.stream()
    			.filter(dish -> dish.isVegetarian() == true)
    			.findAny();
    	return isAvailable.isPresent();
    }
    
    // b. Is there any healthy menu have calories less than 1000 ( return type boolean)
    public static boolean isHealthyMenuAvailable() {
    	Optional<Dish> isAvailable = menu.stream()
    			.filter(dish -> dish.getCalories() < 1000)
    			.findAny();
    	return isAvailable.isPresent();    		
    }
    
    // c. Is there any unhealthy menu have calories greater than 1000 ( return type boolean)
    public static boolean isUnhealthyMenuAvailable() {
    	Optional<Dish> isAvailable = menu.stream()
    			.filter(dish -> dish.getCalories() > 1000)
    			.findAny();
    	return isAvailable.isPresent(); 
    }
    
    // d. find and return the first item for the type of MEAT( return type Optional<Dish>)
    public static Optional<Dish> findFirstMeat() {
    	Optional<Dish> isAvailable = menu.stream()
    			.filter(dish -> dish.getType().toString().equalsIgnoreCase("Meat"))
    			.findFirst();
    	return isAvailable;
    }
    
    // e. calculateTotalCalories() in the menu using reduce. (return int)
    public static int calculateTotalCalories() {
    	int totalCalories = menu.stream()
    			.map(dish -> dish.getCalories())
    			.reduce(0, (cal1, cal2) -> cal1 + cal2);
    	return totalCalories;
    }
    
    // f. calculateTotalCaloriesMethodReference()in the menu using MethodReferences. (return int)
    public static int calculateTotalCaloriesMethodReference() {
    	int totalCalories = menu.stream()
    			.map(Dish::getCalories)
    			.reduce(0, Integer::sum);
    	return totalCalories;
    }
    
    // e. Implement a main method to test.    
    public static void main(String[] args) {
    	// a. Is there any Vegetarian meal available
    	System.out.println(isVegAvailable());
    	
    	// b. Is there any healthy menu have calories less than 1000
    	System.out.println(isHealthyMenuAvailable());
    	
    	// c. Is there any unhealthy menu have calories greater than 1000
    	System.out.println(isUnhealthyMenuAvailable());
    	
    	 // d. find and return the first item for the type of MEAT
    	System.out.println(findFirstMeat());
    	
    	// e. calculateTotalCalories() in the menu using reduce
    	System.out.println(calculateTotalCalories());
    	
    	// f. calculateTotalCaloriesMethodReference()in the menu using MethodReferences.
    	System.out.println(calculateTotalCaloriesMethodReference());
    }
    
    
}