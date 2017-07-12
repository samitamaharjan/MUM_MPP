package lab7.prob3;

interface Duck extends FlyBehavior, QuackBehavior {
		
	default void swim() {
		System.out.println("  swimming");
	}
	
	public void fly();
	public void quack();
	public void display();
}
