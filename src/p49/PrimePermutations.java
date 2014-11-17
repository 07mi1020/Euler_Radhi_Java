package p49;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PrimePermutations {
	public static ArrayList<Integer> aLi = new ArrayList<Integer>();
	public static int count = 0;
	public static Set<Integer> set;
	
	public static void main(String[] args) throws IOException {
		long startTime = System.currentTimeMillis();
		System.out.println("Sum of products is : " + stringRequired());
		long endTime = System.currentTimeMillis();
		System.out.println("time taken: " + (endTime - startTime) / 1000 + "s");
	}

	public static String stringRequired() {
		for (int j = 1000; j <= 9999; j++) {
			if (isPrime(j)) {
				aLi.add(j);
			}
		}
		//System.out.println(aLi);
		for (int i = 0; i < aLi.size(); i++) {
			//count = 0;
			set = new HashSet<Integer>();
			permutation("", "" + aLi.get(i));
			/*if (count >= 4) {
				set.add(aLi.get(i));
			}*/
		}
		/*for(int jkl:set){
			if(set.contains(jkl+3330) && set.contains(jkl+6660))
				System.out.println(jkl+""+(jkl+3330)+(jkl+6660));
		}*/
		return null;
	}

	private static void permutation(String prefix, String str) {
		int n = str.length();
		if (n == 0) {
			set.add(Integer.parseInt(prefix));
			if (aLi.contains(Integer.parseInt(prefix)) && aLi.contains(Integer.parseInt(prefix)-3330) && aLi.contains(Integer.parseInt(prefix)-6660) && set.contains(Integer.parseInt(prefix)) && set.contains(Integer.parseInt(prefix)-3330) && set.contains(Integer.parseInt(prefix)-6660)) {
				//count++;
				System.out.println(prefix);
			}
		} else {
			for (int i = 0; i < n; i++)
				permutation(prefix + str.charAt(i),
						str.substring(0, i) + str.substring(i + 1));
		}
	}

	public static boolean isPrime(long n) {
		if (n == 1) {
			return false;
		}
		if (n != 2 && n % 2 == 0) {
			return false;
		}
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
