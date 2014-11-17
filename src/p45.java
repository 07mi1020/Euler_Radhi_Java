package problems;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class p45 {

	/*
	 * Triangle Tn=n(n+1)/2 1, 3, 6, 10, 15, ... Pentagonal Pn=n(3n−1)/2 1, 5,
	 * 12, 22, 35, ... Hexagonal Hn=n(2n−1) 1, 6, 15, 28, 45, ... It can be
	 * verified that T285 = P165 = H143 = 40755.
	 */

	public static Set<BigInteger> setTriangle = new HashSet<BigInteger>();
	public static Set<BigInteger> setPentagonal = new HashSet<BigInteger>();
	public static Set<BigInteger> setHexagonal = new HashSet<BigInteger>();
	public static BigInteger numb = null;

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		for (BigInteger n = BigInteger.valueOf(2); n.compareTo(BigInteger
				.valueOf(1000000)) == -1; n = n.add(BigInteger.valueOf(1))) {
			setTriangle.add(n.multiply(n.add(BigInteger.valueOf(1))).divide(
					BigInteger.valueOf(2)));
			setPentagonal.add((n.multiply(BigInteger.valueOf(3))
					.subtract(BigInteger.valueOf(1))).multiply(n).divide(
					BigInteger.valueOf(2)));
			setHexagonal.add(((n.multiply(BigInteger.valueOf(2)))
					.subtract(BigInteger.valueOf(1))).multiply(n));
		}
		Object[] arrayTriangle = setTriangle.toArray();
		BigInteger[] intArrayTriangle = new BigInteger[arrayTriangle.length];
		for (int i = 0; i < arrayTriangle.length; i++) {
			intArrayTriangle[i] = (BigInteger) arrayTriangle[i];
		}
		Arrays.sort(intArrayTriangle);
		for (BigInteger a : intArrayTriangle) {
			if (setPentagonal.contains((Object) a)
					&& setHexagonal.contains((Object) a)) {
				if (!a.equals(BigInteger.valueOf(40755))) {
					numb = a;
					break;
				}
			}
		}
		System.out.println("next Triangle Number is " + numb);
		long endTime = System.currentTimeMillis();

		System.out.println("time taken: " + (endTime - startTime) / 1000 + "s");
	}

}
