package lab5.prob1;

public class DecoyDuck extends Duck{
	
	@Override
	void display() {
		System.out.println("displaying DecoyDuck");
	}
	
	public DecoyDuck() {
		setFly(new CannotFly());
		setQuack(new MuteQuack());
	}
}
