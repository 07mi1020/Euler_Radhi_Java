package p23;

import java.util.HashSet;
import java.util.Set;

public class NonAbundantSums {

	public static Set<Integer> set = new HashSet<Integer>();
	public static Set<Integer> abundantSumSet = new HashSet<Integer>();

	public static void main(String[] args) {
		for (int i = 1; i < 28124; i++) {
			if (isAbundant(i))
				set.add(i);
		}

		Object[] arr = set.toArray();

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int temp = (int) arr[i] + (int) arr[j];
				abundantSumSet.add(temp);
			}
		}
		System.out.println("Sum of number is " + sumOfNumbers());
	}

	private static int sumOfNumbers() {
		int sum = 23 * 12;
		for (int i = 24; i < 29124; i++) {
			if (!abundantSumSet.contains((Object) i)) {
				sum += i;
			}

		}
		return sum;
	}

	public static boolean isAbundant(int numb) {
		boolean ret = false;
		int sum = 0;
		for (int i = 1; i < (numb / 2) + 1; i++) {
			if (numb % i == 0)
				sum += i;
		}
		if (sum > numb) {
			ret = true;
		}
		return ret;
	}

}
