package lab5.prob1;

public class RedheadDuck extends Duck{

	@Override
	void display() {
		System.out.println("displaying RedheadDuck");
	}

	public RedheadDuck() {
		setFly(new FlyWithWings());
		setQuack(new Quack());
		
	}
}
