package lab5.prob1;

public class MallardDuck extends Duck {
	
	@Override
	public void display() {
		System.out.println("displaying MallardDuck");
	}
	
	public MallardDuck() {
		setFly(new FlyWithWings());
		setQuack(new Quack());
	}
}
