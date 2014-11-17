package p47;

import java.util.HashSet;
import java.util.Set;

public class DistinctPrimeFactors {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		System.out.println("Largest Concatenated Pandigital Product starts with the number "
				+ firstOfDistinctNumbersWithPrimeFactos());
		long endTime = System.currentTimeMillis();
		System.out.println("time taken: " + (endTime - startTime) / 1000 + "s");
	}

	private static int firstOfDistinctNumbersWithPrimeFactos() {
		int numb = 0;
		for (int n = 644; n < 1000000; n++) {
			if (isMultipleOfPrimeFactors(n) && isMultipleOfPrimeFactors(n + 1) && isMultipleOfPrimeFactors(n+2) && isMultipleOfPrimeFactors(n+3))
				return n;
		}
		return numb;
	}

	private static boolean isMultipleOfPrimeFactors(int numb) {
		int n = numb;
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 1; i <= n; i++) {
			if (isPrime(i) && n % i == 0) {
				set.add(i);
				n /= i;
				i--;
				if (n == 1 && set.size()==4)
					return true;
			}
		}
		return false;
	}
	
	public static boolean isPrime(long n) {
		if (n == 1) {
			return false;
		}
		if (n != 2 && n % 2 == 0) {
			return false;
		}
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
