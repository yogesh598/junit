package o94_Parameterized_Test;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PrimeNumberTest {

	private Integer inputNumber;
	private Boolean expectedResult;
	private PrimeNumberChecker primeNumberChecker;
	
	@Before
	public void initialize() {
		primeNumberChecker = new PrimeNumberChecker();
	}
	
	public PrimeNumberTest(Integer inputNumber, Boolean expectedResult) {
		this.inputNumber = inputNumber;
		this.expectedResult = expectedResult;
	}
	@Parameterized.Parameters
	public static Collection primeNumbers() {
		return Arrays.asList(new Object[][] {{2,true},{6,false},{19,true},{22,false},{23,true}});
	}
	
	// this test will run 5 times because we defined 5 parameters
	@Test
	public void testPrimeNumberChecker() {
		System.out.println("Parameterized number is : "+inputNumber);
		assertEquals(expectedResult,primeNumberChecker.validate(inputNumber));
	}
}
