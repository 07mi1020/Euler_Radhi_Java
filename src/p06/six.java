package p06;

public class six {
	
	/*The sum of the squares of the first ten natural numbers is,

12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.*/
	
	public static void main(String []args){
	       long lP=numberNeeded(100);
	        System.out.println("Largest prime factor is "+lP);
	     }

	private static long numberNeeded(long n) {
		return(sumOfSquares(n)-squareOfSum(n));
	}

	private static long squareOfSum(long n) {
		long Sum= n*(n+1)/2;
		return Sum*Sum;
	}

	private static long sumOfSquares(long n) {
		long sum=0;
		for(long i=1;i<=n;i++){
			sum+=i*i;
		}
		return sum;
	}

}
