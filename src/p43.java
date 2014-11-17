package problems;

import java.io.IOException;

public class p43 {

	/*
	 * Let d1 be the 1st digit, d2 be the 2nd digit, and so on. In this way, we
	 * note the following:
	 * 
	 * 
	 * efg=357 is divisible by 7 fgh=572 is divisible by 11 ghi=728 is divisible
	 * by 13 hij=289 is divisible by 17
	 * 
	 * a {1,2,3,4,5,6,7,8,9} b {1,2,3,4,5,6,7,8,9,0} c {1,2,3,4,5,6,7,8,9,0} d
	 * {2,4,6,8,0} e {1,2,3,4,5,6,7,8,9,0} f {5,0} g {1,2,3,4,5,6,7,8,9,0} h
	 * {1,2,3,4,5,6,7,8,9,0} i {1,2,3,4,5,6,7,8,9,0} j {1,2,3,4,5,6,7,8,9,0}
	 * 
	 * c+d+e is divisible by 3
	 */
	
	public static long sum = 0;

	public static void main(String[] args) throws IOException {
		long startTime = System.currentTimeMillis();
		System.out.println("Sum of all the required pandigital numbers is :"
				+ sumOfAllReqPandigitalNumbers());
		long endTime = System.currentTimeMillis();

		System.out.println("time taken: " + (endTime - startTime) / 1000 + "s");
	}

	private static long sumOfAllReqPandigitalNumbers() {
		permutation("", "9876543201");
		return sum;
	}

	private static void permutation(String prefix, String str) {
		int n = str.length();
		if (n == 0) {
			//System.out.println(prefix);
			if (Integer.parseInt(prefix.substring(1, 4)) % 2 == 0
					&& Integer.parseInt(prefix.substring(2, 5)) % 3 == 0
					&& Integer.parseInt(prefix.substring(3, 6)) % 5 == 0
					&& Integer.parseInt(prefix.substring(4, 7)) % 7 == 0
					&& Integer.parseInt(prefix.substring(5, 8)) % 11 == 0
					&& Integer.parseInt(prefix.substring(6, 9)) % 13 == 0
					&& Integer.parseInt(prefix.substring(7)) % 17 == 0
					&& Integer.parseInt(prefix.substring(0, 1))!=0) {
				System.out.println(prefix);
				sum += Long.parseLong(prefix.replace("\"", ""));
			}

		} else {
			for (int i = 0; i < n; i++)
				permutation(prefix + str.charAt(i),
						str.substring(0, i) + str.substring(i + 1));
		}
	}
}
