package p46;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class GoldbachOC {
	public static ArrayList<Long> aLi = math.util.MathFunctions
			.savePrimesUptoNumbToArrayList(1000);
	public static Set<Integer> set = new HashSet<Integer>();
	public static ArrayList<Integer> oddCompositeNumbers = new ArrayList<Integer>();

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		for(int i=3;i<1000;i +=2){
			if(!math.util.MathFunctions.isPrime(i))
				oddCompositeNumbers.add(i);
		}
		System.out.println("List of odd Composite Numbers : "+oddCompositeNumbers);
		for(int i=0;i<33;i++){
			for(long a:aLi){
				set.add((int) (a+i*i));
				System.out.println("Value of i :"+i);
                System.out.println("Value of a : "+a);
			}
		}
		System.out.println("List of primes :"+aLi);
		System.out.println("list of required numbers"+set);
		System.out.println("Smallest odd composite number required is " + goldbachOC());
		long endTime = System.currentTimeMillis();

		System.out.println("time taken: " + (endTime - startTime) / 1000 + "s");
	}

	private static int goldbachOC() {
		for (int o: oddCompositeNumbers){
			if(set.contains((Object) o)){
				return o;
			}
		}
		return 0;
	}

}
