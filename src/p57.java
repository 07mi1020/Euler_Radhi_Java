package problems;

import java.math.BigInteger;

public class p57 {

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		System.out.println("Number of such fractions : "
				+ numberOfRequiredFractions());
		long endTime = System.currentTimeMillis();

		System.out.println("time taken: " + (endTime - startTime) / 1000 + "s");
	}

	private static int numberOfRequiredFractions() {
		int numberOfReqFractions = 0;
		BigInteger n1 = BigInteger.ONE, d1 = BigInteger.valueOf(2), n2 = BigInteger.valueOf(2), d2 = BigInteger.valueOf(5), num = BigInteger.ONE, den = BigInteger.ONE, n = BigInteger.ONE, d = BigInteger.ONE;

		for (int i = 3; i <= 1000; i++) {
			n = n1.add(n2.multiply(BigInteger.valueOf(2)));
			d = d1.add(d2.multiply(BigInteger.valueOf(2)));
			n1 = n2;
			d1 = d2;
			n2 = n;
			d2 = d;
			num = n.add(d);
			den = d;
			if (("" + num).length() > ("" + den).length())
				numberOfReqFractions++;
		}
		return numberOfReqFractions;
	}
}
