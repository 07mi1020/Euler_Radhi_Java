package problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class p46 {

	public static ArrayList<Long> aLi = savePrimesUptoNumbToArrayList(10000);
	public static Set<Integer> set = new HashSet<Integer>();
	public static ArrayList<Integer> oddCompositeNumbers = new ArrayList<Integer>();

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		for (int i = 3; i < 10000; i += 2) {
			if (!isPrime(i))
				oddCompositeNumbers.add(i);
		}
		System.out.println("List of odd Composite Numbers : "
				+ oddCompositeNumbers);
		for (int i = 1; i < 93; i++) {
			for (long a : aLi) {
				set.add((int) (a + 2*i*i));
				System.out.println("Value of i :" + i);
				System.out.println("Value of a : " + a);
			}
		}
		System.out.println("List of primes :" + aLi);
		System.out.println("list of required numbers" + set);
		System.out.println("Smallest odd coposite numb req is " + goldbachOC());
		long endTime = System.currentTimeMillis();

		System.out.println("time taken: " + (endTime - startTime) / 1000 + "s");
	}

	private static int goldbachOC() {
		for (int o : oddCompositeNumbers) {
			if (!set.contains((Object) o)) {
				return o;
			}
		}
		return 0;
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

	public static ArrayList<Long> savePrimesUptoNumbToArrayList(long numb) {
		ArrayList<Long> aList = new ArrayList<Long>();
		for (long i = 0; i < numb; i++) {
			if (isPrime(i)) {
				aList.add(i);
			}
		}
		return aList;
	}

}
