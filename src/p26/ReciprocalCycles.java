package p26;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReciprocalCycles {

	public static void main(String[] args) throws IOException {
		long startTime = System.currentTimeMillis();
		System.out
				.println("Value of d for which 1/d contains longest recurring cycle in its decimal part : "
						+ valueOfDWithLongestRecurringDecimals());
		// System.out.println(lengthOfRecurringDecimalPart(11));
		long endTime = System.currentTimeMillis();
		System.out.println("time taken: " + (endTime - startTime) / 1000 + "s");
	}

	private static int valueOfDWithLongestRecurringDecimals() {
		int maxD = 1;
		int maxL = 0;
		for (int i = 1; i < 1000; i++) {
			int temp = lengthOfRecurringDecimalPart(i);
			if (temp > maxL) {
				maxL = temp;
				maxD = i;
			}
		}
		return maxD;
	}

	private static int lengthOfRecurringDecimalPart(int i) {
		int length = 0;
		int dividend = 0;
		if (i <= 10) {
			dividend = 10;
		} else if (i <= 100) {
			dividend = 100;
		} else {
			dividend = 1000;
		}
		int count = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		while (!map.containsKey(dividend)) {
			if (dividend == 0)
				return -1;

			map.put(dividend, count);
			int temp = dividend % i;
			dividend = (temp) * 10;
			count++;
		}
		length = count - map.get(dividend);
		return length;
	}
}
