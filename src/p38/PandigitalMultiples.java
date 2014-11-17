package p38;

import java.util.HashSet;
import java.util.Set;

public class PandigitalMultiples {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		System.out.println("Largest Concatenated Pandigital Product is "
				+ largestConcatenatedPandigitalProduct());
		long endTime = System.currentTimeMillis();
		System.out.println("time taken: " + (endTime - startTime) / 1000 + "s");
	}

	private static int largestConcatenatedPandigitalProduct() {
		int max = 0;
		for (int i = 1; i < 50000; i++) {
			Set<Character> set = new HashSet<Character>();
			String product = "";
			for (int k = 1; k < 10; k++) {
				product += "" + k * i;
				if (product.length() == 9) {
					for (int j = 0; j < 9; j++) {
						char charac = product.charAt(j);
						if (!set.contains(charac)) {
							set.add(charac);
						}
					}

					if (set.size() == 9 && !set.contains('0')) {
						int temp = Integer.parseInt(product);
						if (temp > max)
							max = temp;
					}
				}
			}
		}

		return max;
	}

}
