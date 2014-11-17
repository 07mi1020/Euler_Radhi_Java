package p451;

import java.io.IOException;
import java.math.BigInteger;

public class ModularInverse {

	public static void main(String[] args) throws IOException {
		long startTime = System.currentTimeMillis();
		System.out.println("Sum total is : " + functionSumOfI());
		// System.out.println(moduloInverse(BigInteger.valueOf(4),BigInteger.valueOf(7)));
		//System.out.println(functionI(BigInteger.valueOf(100)));
		long endTime = System.currentTimeMillis();
		System.out.println("time taken: " + (endTime - startTime) / 1000 + "s");
	}

	private static BigInteger functionSumOfI() {
		BigInteger sum = BigInteger.valueOf(0);
		for (BigInteger i = BigInteger.valueOf(3); i.compareTo(BigInteger
				.valueOf((long) (2 * Math.pow(10, 7)))) <= 0; i = i
				.add(BigInteger.ONE)) {
			sum = sum.add(functionI(i));
		}
		return sum;
	}

	private static BigInteger functionI(BigInteger n) {
		BigInteger nMinusOne = n.subtract(BigInteger.ONE);
		for (BigInteger m = nMinusOne.subtract(BigInteger.ONE); m.compareTo(BigInteger.ZERO) > 0; m = m.subtract(BigInteger.ONE)) {
			if (moduloInverse(m, n).equals(m))
				return m;
		}
		return BigInteger.ZERO;
	}

	private static BigInteger moduloInverse(BigInteger m, BigInteger n) {
		for (BigInteger i = BigInteger.valueOf(1); i.compareTo(n) <= 0; i = i
				.add(BigInteger.ONE)) {
			BigInteger mi = m.multiply(i);
			BigInteger quotient = mi.divide(n);
			BigInteger dividend = quotient.multiply(n);
			if ((mi.subtract(dividend)).compareTo(BigInteger.ONE) == 0) {
				return i;
			}
		}
		return BigInteger.ZERO;
	}

}
