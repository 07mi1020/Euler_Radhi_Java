package p29;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DistinctPowers {
	public static ArrayList<BigInteger> aList = new ArrayList<BigInteger>();
	public static Set<BigInteger> set = new HashSet<BigInteger>();
	
	public static void main(String []args){
	       long lP=numberOfDistinctTerms();
	        System.out.println("Largest prime factor is "+lP);
	     }

	private static long numberOfDistinctTerms() {
		for(int i=2;i<101; i++){
			for(int j=2;j<=100;j++){
				BigInteger temp = BigInteger.valueOf(i).pow(j);
				aList.add(temp);
			}
		}
		set.addAll(aList);
		return set.size();
	}
}
