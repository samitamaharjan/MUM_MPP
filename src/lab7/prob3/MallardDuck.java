package lab7.prob3;

public class MallardDuck implements Duck {
	public MallardDuck() {
		
	}
	
	@Override
	public void display() {
		System.out.println("  display");
		
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
