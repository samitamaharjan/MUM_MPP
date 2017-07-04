package lab4.finalinherit1;

//Shows how compiler locates first ancestor
//in inheritance chain in which the final method
//is implemented
public class Sub extends Super {
	public static void main(String[] args) {
		Sub s = new Sub();
		s.print();
	}	
}
