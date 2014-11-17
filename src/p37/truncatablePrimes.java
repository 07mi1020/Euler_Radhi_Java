package p37;

import java.io.IOException;

public class truncatablePrimes {

	public static void main(String[] args) throws IOException {
		long startTime = System.currentTimeMillis();
		System.out.println("Sum of products is : " + sumOfTruncatablePrimes());
		// System.out.println(isTruncatable(3797));
		long endTime = System.currentTimeMillis();
		System.out.println("time taken: " + (endTime - startTime) / 1000 + "s");
	}

	private static int sumOfTruncatablePrimes() {
		int sum = 0;
		int count = 1;
		int i = 11;
		while (count < 12) {
			if (isPrime(i) && isTruncatable(i)) {
				sum += i;
				System.out.println("Value of i : "+i);
				count++;
			}
			i++;
		}
		return sum;
	}

	private static boolean isTruncatable(int i) {
		int numb = i;
		String numbString = "" + i;
		numb /= 10;
		numbString = numbString.substring(1);
		while(numb!=0){
			if (!isPrime(numb) || !isPrime(Integer.parseInt(numbString))) {
				return false;
			} else {
				numb /= 10;
				numbString = numbString.substring(1);
			}
		}
		return true;
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
