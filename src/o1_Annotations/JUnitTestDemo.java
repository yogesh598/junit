//Run this program as Run as JUnit testCase

package o1_Annotations;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JUnitTestDemo {

	static int beforeclassCount = 1;
	static int afterclassCount = 1;
	static int beforeTestCount = 1;
	static int afterTestCount = 1;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeClass - Im running before Class, count : "+ beforeclassCount++);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterClass - Im running after Class, count : "+afterclassCount++);
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("  @Before - Im running before test, count : "+beforeTestCount++);
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("    @After - Im running after test, count : "+afterTestCount++);
	}

	int num = 6;
	@Test
	public void test1() {
		assertTrue(num<10);
	}
	
	String name = "Yogesh";
	@Test
	public void test2()
	{
		assertEquals("Yogesh",name);   
	}
	
	String name2 = null;
	@Test
	public void test3() {
		assertNull(name2);
	}
	
	String name3 = "some text";
	@Test 
	@Ignore
	public void test4() {
		assertNotNull(name3);
	}
}
