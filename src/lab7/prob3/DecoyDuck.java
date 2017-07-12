package lab7.prob3;

public class DecoyDuck implements Duck {
	public DecoyDuck() {
		
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
		muteQuack();		
	}
}
