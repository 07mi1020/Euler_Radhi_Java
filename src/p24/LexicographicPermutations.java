package p24;

import java.util.ArrayList;

public class LexicographicPermutations {
	public static ArrayList<String> aList = new ArrayList<String>();
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		System.out.println("millionth lexicographic permutatuion is "
				+ lexicographicPermutation(1000000));
		long endTime = System.currentTimeMillis();

		System.out.println("time taken: " + (endTime - startTime) / 1000 + "s");
	}
	
	private static void permutation(String prefix, String str) {
		int n = str.length();
		if (n == 0){
			aList.add(prefix);
			}	
		else {
			for (int i = 0; i < n; i++)
				permutation(prefix + str.charAt(i),
						str.substring(0, i) + str.substring(i + 1));
		}
	}

	private static String lexicographicPermutation(int i) {
		permutation("","0123456789");
		return aList.get(i-1);
	}
}
