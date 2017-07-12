package lab7.prob3;

public class RubberDuck implements Duck {
	public RubberDuck() {
	
	}
	
	@Override
	public void display() {
		System.out.println("  displaying");
		
	}
	@Override
	public void fly() {
		cannotFly();
	}
	@Override
	public void quack() {
		sqneak();
	}
}
