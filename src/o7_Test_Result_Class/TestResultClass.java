package o7_Test_Result_Class;

import junit.framework.TestResult;
import junit.framework.AssertionFailedError;

import org.junit.Test;
import org.junit.Assert;
public class TestResultClass extends TestResult{

	//Add the error
	public synchronized void addError(Test test,Throwable t) {
		super.addError((junit.framework.Test) test, t);
	}
	//Add the failure
	public synchronized void addFailure(Test test,AssertionFailedError t) {
		super.addFailure((junit.framework.Test) test, t);
	}
	@Test 
	public void testCheck() {
		Assert.assertEquals(5, 5);		//change the values then check for error result
	}
	public synchronized void stop() {
		//stop the test here
	}
}
