package lab7.prob3;

public class RedheadDuck implements Duck {
	public RedheadDuck() {
		
	}
	
	@Override
	public void display() {
		System.out.println("  displaying");
		
	}
	@Override
	public void fly() {
		flyWithWings();
	}
	@Override
	public void quack() {
		canQuack();
	}
}
