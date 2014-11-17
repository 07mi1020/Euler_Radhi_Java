package p34;

import java.util.HashMap;
import java.util.Map;

public class DigitalFactorials {
	public static Map<Integer, Integer> map = new HashMap<Integer, Integer>();

	public static void main(String[] args) {
		map.put(0, 1);
		map.put(1, 1);
		map.put(2, 2);
		map.put(3, 6);
		map.put(4, 24);
		map.put(5, 120);
		map.put(6, 720);
		map.put(7, 5040);
		map.put(8, 40320);
		map.put(9, 362880);
		long startTime = System.currentTimeMillis();
		System.out.println("Value of sum of digital factorials is "
				+ sumOfDigitalFactorials());
		long endTime = System.currentTimeMillis();

		System.out.println("time taken: " + (endTime - startTime) / 1000 + "s");
	}

	private static int sumOfDigitalFactorials() {
		int sum = 0;
		for (int i = 3; i < 1000000; i++) {
			if (digitalFactorials(i)) {
				sum += i;
				System.out.println("Value of i : " + i);
			}
		}
		return sum;
	}

	public static boolean digitalFactorials(int num) {
		int n = num;
		long sum = 0;
		
		while (n > 0) {
			sum += map.get(n % 10);
			n /= 10;
		}
		return (sum == num);
	}
}
