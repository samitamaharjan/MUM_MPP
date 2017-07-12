package lab5.prob1;

public class RubberDuck extends Duck{

	@Override
	void display() {
		System.out.println("displaying RubberDuck");
	}
	
	public RubberDuck() {
		//setFly(new CannotFly());
		this.flyBehavior = new CannotFly();
		this.quackBehavior = new Sneak();
		setQuack(new Sneak());
	}
}
