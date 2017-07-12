package lab7.prob3;

public interface QuackBehavior {
	default void canQuack() {
		System.out.println("  quacking");
	}
	
	default void muteQuack() {
		System.out.println("  cannot quack");
	}
	
	default void sqneak() {
		System.out.println("  squeaking");
	}
}
