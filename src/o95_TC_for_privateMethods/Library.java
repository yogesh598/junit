package o95_TC_for_privateMethods;

public class Library {

	private int sumOfTwoNumbers(Integer a, Integer b) {
		return a+b;
	}
	public int sumOfNumbers(int a, int b) {
		return sumOfTwoNumbers(a,b);		//calling private method from public method
	}
}
