package lab7.prob3;

public interface FlyBehavior {
	default void cannotFly() {
		System.out.println("  cannot fly");
	}
	
	default void flyWithWings() {
		System.out.println("  fly with wings");
	}
}
