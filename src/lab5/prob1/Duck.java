package lab5.prob1;

abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public void setQuack(QuackBehavior quack) {
		this.quackBehavior = quack;
	}

	public void setFly(FlyBehavior fly) {
		this.flyBehavior = fly;
	}

	abstract void display();
	
	public void quack() {
		quackBehavior.quack();
	}
	
	public void fly() {
		flyBehavior.fly();
	}
	
	public void swim() {
		System.out.println("swimming");
	}
}
