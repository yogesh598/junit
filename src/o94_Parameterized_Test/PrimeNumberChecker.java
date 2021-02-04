package o94_Parameterized_Test;

public class PrimeNumberChecker {

	public boolean validate(final Integer primeNumber) {
		for(int i=2;i<(primeNumber/2);i++) {
			if(primeNumber%i==0) {
				return false;
			}
		}
		
		return true;
	}
}
