package p32;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class PandigitalProducts {
	public static int sumOfProducts = 0;
	public static Set<Integer> set = new HashSet<Integer>();

	public static void main(String[] args) throws IOException {
		long startTime = System.currentTimeMillis();
		System.out.println("Sum of products is : " + sumOfProducts());
		long endTime = System.currentTimeMillis();
		System.out.println("time taken: " + (endTime - startTime) / 1000 + "s");
	}

	private static int sumOfProducts() {
		sumOfProducts = 0;
		permutation("", "123*456=789");
		for(int i :set){
			sumOfProducts +=i;
		}
		return sumOfProducts;
	}

	private static void permutation(String prefix, String str) {
		int n = str.length();
		if (n == 0) {
			if (prefix.charAt(0) != '*' && prefix.charAt(0) != '='
					&& prefix.charAt(prefix.length() - 1) != '*'
					&& prefix.charAt(prefix.length() - 1) != '='
					&& prefix.indexOf('=') > prefix.indexOf('*') + 1) {
				int d1 = Integer.parseInt(prefix.substring(0,
						prefix.indexOf('*')));
				int d2 = Integer.parseInt(prefix.substring(
						prefix.indexOf('*') + 1, prefix.indexOf('=')));
				int prod = Integer.parseInt(prefix.substring(prefix
						.indexOf('=') + 1));
				if (d1 * d2 == prod) {
					set.add(prod);
					System.out.println(prefix);
				}
			}
		} else {
			for (int i = 0; i < n; i++)
				permutation(prefix + str.charAt(i),
						str.substring(0, i) + str.substring(i + 1));
		}
	}

}
