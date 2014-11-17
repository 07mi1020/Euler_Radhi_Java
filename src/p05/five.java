package p05;

import math.util.MathFunctions;

public class five {
	/*2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?*/
	
	public static void main(String []args){
	       long lP=productNeeded(20);
	        System.out.println("Smallest number divisible by numbers upto n is "+lP);
	     }

	private static long productNeeded(long n) {
		long j = 1;
		long product=1;
		while(j<=n){
			if(MathFunctions.isPrime(j)){
				product*=j;
			}
			j++;
		}
		for(j=1;j<=Math.sqrt(n);j++){
			product *= j;
		}
		
		System.out.println("Math.pow("+n+",1/3): "+Math.pow(n,1/(double)3));
		System.out.println("Math.pow("+n+",1/4): "+Math.pow(n,1/(double)4));
		return product;
	}
	
	

}
