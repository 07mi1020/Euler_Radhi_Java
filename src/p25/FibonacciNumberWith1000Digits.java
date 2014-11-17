package p25;

import java.math.BigInteger;

public class FibonacciNumberWith1000Digits {
	
	public static BigInteger firstTerm = BigInteger.valueOf(1);
	public static BigInteger secondTerm = BigInteger.valueOf(1);
	public static BigInteger Term;
	public static boolean boo = true;
	
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		System.out.println("First fibonacci number with 1000 digits is "
				+ nthTermwithThousandDigits());
		long endTime = System.currentTimeMillis();

		System.out.println("time taken: " + (endTime - startTime) / 1000 + "s");
	}


	private static long nthTermwithThousandDigits() {
		long count = 3;
		while(boo){
			Term=firstTerm.add(secondTerm);
			firstTerm=secondTerm;
			secondTerm=Term;
			if(numbOfDigits(Term)>=1000){
				return count;
			}
			count++;
		}
		return 0;
	}


	private static int numbOfDigits(BigInteger term) {
		return term.toString().length();
	}
	
	
}
