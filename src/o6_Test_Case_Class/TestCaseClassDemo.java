package o6_Test_Case_Class;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import junit.framework.TestCase;
public class TestCaseClassDemo extends TestCase{

	@Before
	public void setUp() {
		System.out.println("Your @Before method will goes here");
	}
	
	@Test
	public void test1() {
		//counting test cases
		int num = this.countTestCases();
		System.out.println("Number of test Cases : "+num);
		
		//getting name of testcase
		String name = this.getName();
		System.out.println("Current test case name : "+name);
		
		//setting name of testcase
		this.setName("UpdatedTest");
		String newName = this.getName();
		System.out.println("New test case name : "+newName);
	}
	
	@After
	public void tearDown() {
		System.out.println("Your @After method will goes here");
	}
}
