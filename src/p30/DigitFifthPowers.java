package p30;

import java.math.BigInteger;

public class DigitFifthPowers {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		System.out.println("Sum is " + sumOfDigitFifthPowers());
		long endTime = System.currentTimeMillis();

		System.out.println("time taken: " + (endTime - startTime) / 1000 + "s");
	}

	private static BigInteger sumOfDigitFifthPowers() {
		BigInteger sum = BigInteger.valueOf(0);
		for (int i = 1; i < 1000000; i++) {
			if (checkIf(i)) {
				sum = sum.add(BigInteger.valueOf(i));
				System.out.println("Value of i :" + i);
			}
		}
		return sum;
	}

	private static boolean checkIf(int n) {
		int numb = n;
		int sum = 0;
		while (numb > 0) {
			for (int i = 0; i < (""+n).length() ; i++) {
				sum += Math.pow(numb % 10, 5);
				numb /= 10;
			}
		}
		if (sum == n)
			return true;
		return false;
	}

}
