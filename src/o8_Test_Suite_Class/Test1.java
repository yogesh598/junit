package o8_Test_Suite_Class;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class Test1 {
	
	String message = "Robert";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		assertEquals(message,messageUtil.printMessage());
	}
	

}
