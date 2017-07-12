package lambda_practice;

@FunctionalInterface
interface Operation {
	int cal(int num1, int num2);
}

public class Calculator {

	public static void main(String[] args) {
		
		Operation ob = (num1, num2) -> num1 + num2;
		int addNum = ob.cal(4, 6);
		System.out.println(addNum);
		
		Operation ob1 = (num1, num2) -> num1 - num2;
		int subNum = ob1.cal(10, 6);
		System.out.println(subNum);
		
		Operation ob2 = (num1, num2) -> num1 / num2;
		int divNum = ob2.cal(10, 2);
		System.out.println(divNum);
		
		Operation ob3 = (num1, num2) -> num1 * num2;
		int multNum = ob3.cal(10, 2);
		System.out.println(multNum);
	}

}
