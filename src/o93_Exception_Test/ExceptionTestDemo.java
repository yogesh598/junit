package o93_Exception_Test;

import org.junit.Before;
import org.junit.Test;
public class ExceptionTestDemo {

	int a,b,c;
	@Before
	public void setUp() {
		a = 10;
		b = 0;
	}	
	//instead of ArithmeticException try different exception to fail the test
	@Test(expected = java.lang.ArithmeticException.class)
	public void test() {
		c = a/b;
		System.out.println("Division : "+c);
	}
	
	
	
}
