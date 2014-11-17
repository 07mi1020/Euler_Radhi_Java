package p21;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AmicableNumbers {
	
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		System.out.println("Sum of amicable numbers upto 1000 is : "
				+ sumOfAmicableNumbers());
		long endTime = System.currentTimeMillis();
		System.out.println("time taken: " + (endTime - startTime) / 1000 + "s");
	}

	private static int sumOfAmicableNumbers() {
		int sum =0;
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 1; i<10000;i++){
			if(isAmicable(i)){
				set.add(i);
				set.add(sumOfDivisors(i));
			}			
		}
		System.out.println(set);
		Iterator<Integer> iterator = set.iterator();
	    while(iterator.hasNext()) {
	        sum += iterator.next();
	    }
		return sum;
	}

	private static Integer sumOfDivisors(int numb) {
		int sum =0;
		for(int i =1;i<=numb/2;i++){
			if(numb%i==0)
				sum +=i;
		}
		return sum;
	}

	private static boolean isAmicable(int numb) {
		int temp1 = sumOfDivisors(numb);
		int temp2 = sumOfDivisors(temp1);
		if(temp2==numb && temp1!=temp2){
			return true;
		}
		return false;
	}

}
