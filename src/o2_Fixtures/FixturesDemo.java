package o2_Fixtures;

import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;

public class FixturesDemo {

	@BeforeClass
	public static void setUpClass() {
		System.out.println("Your @BeforeClass method goes here");
	}
	@Before
	public void setUp() {
		System.out.println(" Your @Before method wil goes here");
	}
	
	@Test
	public void test1() {
		System.out.println("  Your Test1 method will goes here");
	}
	@Test 
	public void test2() {
		System.out.println("  Your Test2 method will goes here");
	}
	@After
	public void tearDown() {
		System.out.println(" Your @After method will goes here");
	}
	@AfterClass
	public static void tearDownClass() {
		System.out.println("Your AfterClass method will goes here");
	}
}
