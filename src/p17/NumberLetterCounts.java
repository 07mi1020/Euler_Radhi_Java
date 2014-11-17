package p17;

import java.io.IOException;

public class NumberLetterCounts {

	public static String[] ONES = { "zero", "one", "two", "three", "four",
			"five", "six", "seven", "eight", "nine" };
	public static String[] TEENS = { "ten", "eleven", "twelve", "thirteen",
			"fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
			"nineteen" };
	public static String[] TENS = { "twenty", "thirty", "forty", "fifty",
			"sixty", "seventy", "eighty", "ninety" };

	public static void main(String[] args) throws IOException {
		long startTime = System.currentTimeMillis();
		System.out.println("Maximum total is : " + numberLetterCount());
		long endTime = System.currentTimeMillis();
		System.out.println("time taken: " + (endTime - startTime) / 1000 + "s");
	}

	private static String numberLetterCount() {
		int sum = 0;
		for (int i = 1; i <= 1000; i++)
			sum += toEnglish(i).length();
		return "" + sum;
	}

	private static String toEnglish(int n) {
		if (n < 0 || n > 99999)
			throw new IllegalArgumentException();

		if (n < 100)
			return tens(n);
		else {
			String big = "";
			if (n >= 1000)
				big += tens(n / 1000) + "thousand";
			if (n / 100 % 10 != 0)
				big += ONES[n / 100 % 10] + "hundred";

			return big + (n % 100 != 0 ? "and" + tens(n % 100) : "");
		}
	}

	private static String tens(int n) {
		if (n < 10)
			return ONES[n];
		else if (n < 20) 
			return TEENS[n - 10];
		else
			return TENS[n / 10 - 2] + (n % 10 != 0 ? ONES[n % 10] : "");

	}

}
