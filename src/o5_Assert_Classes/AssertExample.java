package o5_Assert_Classes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
public class AssertExample {

	int num;
	String name;
	String str;
	
	@Before
	public void setUp() {
	
		num = 5;
		name = "Yogesh";
		str = null;
	}
	
	@Test
	public void test1() {
		
		assertEquals("Yogesh",name);
	}
	@Test
	public void test2() {

		assertTrue(num<10);
	}
	@Test
	public void test3() {	
		
		assertFalse(num>14);
	}
	@Test
	public void test4() {
		
		assertNull(str);
	}
	@Test
	public void test5() {
			
		assertNotNull(name);
	}
}
