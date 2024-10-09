package mk.iwec.loops;

public class PrimeNumber {

	public static boolean isPrime(int n) {
		if(n <= 3) {
			return true;
		}
		for (int i = 2; i < n/2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
