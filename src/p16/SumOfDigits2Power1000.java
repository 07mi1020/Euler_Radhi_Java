package p16;

import java.math.BigInteger;

public class SumOfDigits2Power1000 {

	public static void main(String[] args) {
		BigInteger value = BigInteger.valueOf(1);
		for (int i = 1; i <= 1000; i++) {
			value = value.multiply(BigInteger.valueOf(2));
		}
		System.out.println("Value of value is : " + value);
		long startTime = System.currentTimeMillis();
		System.out.println("Sum of Digits is "
				+ math.util.MathFunctions.sumOfDigits(value));
		long endTime = System.currentTimeMillis();

		System.out.println("time taken: " + (endTime - startTime) / 1000 + "s");
	}

}
