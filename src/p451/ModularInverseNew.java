package p451;

import java.io.IOException;
import java.math.BigInteger;

public class ModularInverseNew {

	public static void main(String[] args) throws IOException {
		long startTime = System.currentTimeMillis();
		System.out.println("Sum total is : " + functionSumOfI());
		long endTime = System.currentTimeMillis();
		System.out.println("time taken: " + (endTime - startTime) / 1000 + "s");
	}

	private static BigInteger functionSumOfI() {
		BigInteger sum = BigInteger.ZERO;
		for (BigInteger n = BigInteger.valueOf(3); n.compareTo(BigInteger
				.valueOf((long) (2 * Math.pow(10, 7)))) <= 0; n = n
				.add(BigInteger.ONE)) {
			BigInteger nMinusOne = n.subtract(BigInteger.ONE);
			for (BigInteger m = nMinusOne.subtract(BigInteger.ONE); m
					.compareTo(BigInteger.ZERO) > 0; m = m
					.subtract(BigInteger.ONE)) {
				for (BigInteger k = BigInteger.valueOf(1); k.compareTo(n) <= 0; k = k
						.add(BigInteger.ONE)) {
					if (m.multiply(m).subtract(BigInteger.ONE)
							.equals(n.multiply(k)))
						sum = sum.add(m);
				}
			}
		}
		return sum;
	}

}
