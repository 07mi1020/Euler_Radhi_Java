package problems;

import java.util.HashSet;
import java.util.Set;

public class p52 {
	/*
	 * It can be seen that the number, 125874, and its double, 251748,
	 * contain exactly the same digits, but in a different order.
	 * 
	 * Find the smallest positive integer, x, such that 2x, 3x, 4x, 5x, and
	 * 6x, contain the same digits.
	 */
	
	public static Set<Integer> set;

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		boolean boo = true;
		int x = 10;
		while(boo){
			set = new HashSet<Integer>();	
			permutation("", ""+x);
			if(set.contains(2*x) && set.contains(3*x) && set.contains(4*x) && set.contains(5*x) && set.contains(6*x) ){
				boo = false;
				System.out.println("Required value x is : "+x);
			}			
			x++;
		}
		long endTime = System.currentTimeMillis();

		System.out.println("time taken: " + (endTime - startTime) / 1000 + "s");
	}

	private static void permutation(String prefix, String str) {
		int n = str.length();
		if (n == 0) {
			//System.out.println(prefix);
			set.add(Integer.parseInt(prefix));

		} else {
			for (int i = 0; i < n; i++)
				permutation(prefix + str.charAt(i),
						str.substring(0, i) + str.substring(i + 1));
		}
	}

}
