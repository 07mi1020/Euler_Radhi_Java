package p48;

import java.math.BigInteger;

public class SelfPowers {
	
	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		System.out.println("Last ten digits of sum of self powers is "
				+ sumOfSelfPowers());
		long endTime = System.currentTimeMillis();

		System.out.println("time taken: " + (endTime - startTime) / 1000 + "s");
	}

	private static BigInteger sumOfSelfPowers() {
		BigInteger sum = BigInteger.valueOf(0);
		for (int i = 1;i<1001;i++){
			BigInteger power = BigInteger.valueOf(i).pow(i);
			sum = sum.add(power.mod(BigInteger.valueOf((long) Math.pow(10, 10))));
		}
		return sum.mod(BigInteger.valueOf((long) Math.pow(10, 10)));
	}

}
