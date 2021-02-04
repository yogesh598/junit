package o95_TC_for_privateMethods;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

public class LibraryTest {

	@Test
	public void testSumOfNumbers() {
		Library library = new Library();
		int sum = library.sumOfNumbers(10,20);
		assertEquals(30,sum);
	}
	@Test
	public void testSumOfTwoNumbers() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {	//using reflection here
		
		Method method = Library.class.getDeclaredMethod("sumOfTwoNumbers", Integer.class,Integer.class);
		method.setAccessible(true);
		
		Library library = new Library();
		int sum = (int)method.invoke(library, 10, 20);
		assertEquals(30,sum);
	}
}
