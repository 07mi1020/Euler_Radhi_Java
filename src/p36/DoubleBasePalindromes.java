package p36;

public class DoubleBasePalindromes {

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		System.out.println("Value of sum of digital factorials is "
				+ sumOfDoubleBasePalindromes());
		long endTime = System.currentTimeMillis();

		System.out.println("time taken: " + (endTime - startTime) / 1000 + "s");
	}

	private static long sumOfDoubleBasePalindromes() {
		long sum = 0;
		for (int i = 1; i < 1000000; i++) {
			if (isPalaindrome(Integer.toString(i))
					&& isBinaryPalindrome(i)) {
				sum += i;
				System.out.println("Value of sum is : " + sum);
			}
		}

		return sum;
	}

	private static boolean isPalaindrome(String n) {
		StringBuilder sb = new StringBuilder(n);
		return sb.toString().equals(sb.reverse().toString());
	}

	private static boolean isBinaryPalindrome(long n) {
		return isPalaindrome(Long.toBinaryString(n));
	}

}
