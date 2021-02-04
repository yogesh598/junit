package o92_Time_Test;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
public class TestJUnit {
	
	String name = "Robert";
	MessageUtil messageUtil = new MessageUtil(name);
	
	@Test
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		name = "Robert";
		assertEquals(name,messageUtil.printMessage());
	}					
	//to perform time Test, remove while loop to pass the test
	@Test(timeout=5000)
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		name = "Hi "+"Robert";
		assertEquals(name,messageUtil.salutationMessage());
		while(true);
	}
	

}
