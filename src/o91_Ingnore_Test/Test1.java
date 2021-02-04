package o91_Ingnore_Test;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
public class Test1 {
	
	String name = "Robert";
	MessageUtil messageUtil = new MessageUtil(name);
	
	@Test
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		name = "Robert";
		assertEquals(name,messageUtil.printMessage());
	}
	@Ignore						//to ingore this test case while executing test cases
	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		name = "Hi "+"Robert";
		assertEquals(name,messageUtil.salutationMessage());
	}
	

}
