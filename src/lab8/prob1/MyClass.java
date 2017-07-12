package lab8.prob1;

import java.util.function.Predicate;

public class MyClass {
	int x;
	
	public MyClass(int x) {
		this.x = x;
	}
	
	public boolean myMethod(MyClass cl) {
		Predicate<MyClass> c = this::equals;
		return c.test(cl);
	}
	
	@Override
	public boolean equals(Object ob) {
		if (ob == null || ob.getClass() != this.getClass()) return false;
		MyClass newOb = (MyClass) ob;
		return newOb.x == this.x;		
	}
	
	public static void main(String[] args) {
		MyClass myclass1 = new MyClass(20);
		MyClass myclass2 = new MyClass(10);
		
		System.out.println(myclass1.myMethod(myclass2));
	}
}
