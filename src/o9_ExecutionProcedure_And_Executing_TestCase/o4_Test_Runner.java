package o9_ExecutionProcedure_And_Executing_TestCase;

import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.JUnitCore;
public class o4_Test_Runner {

	public static void main(String[] args) {

		Result result = JUnitCore.runClasses(o3_Test_Suite.class);
		
		for(Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}

}
