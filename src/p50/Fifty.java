package p50;

import java.util.ArrayList;

public class Fifty {

	public static long maxSum = 0;
	public static int maxK = 1;
	public static long sum = 0;
	public static ArrayList<Long> aList = new ArrayList<Long>();

	public static void main(String[] args) {
		long lP = highestPrimeSumOfPrimes();
		System.out.println("Largest prime factor is " + lP);
	}

	private static long highestPrimeSumOfPrimes() {
		for (long i = 0; i < 1000000; i++) {
			if (math.util.MathFunctions.isPrime(i)) {
				aList.add(i);
			}
		}
		long arrayListLength = aList.size();
		for (int i = 0; i < arrayListLength; i++) {
			sum = aList.get(i);
			int k = 1;
			for (int j = 1; (j < arrayListLength - i) && sum<1000000; j++) {
				sum += aList.get(i + j);
				k++;
				if (math.util.MathFunctions.isPrime(sum) 
						&& sum < 1000000 && k>maxK && sum > maxSum) {
					maxSum = sum;
					maxK=k;
				}
			}
		}
		return maxSum;
	}

}
