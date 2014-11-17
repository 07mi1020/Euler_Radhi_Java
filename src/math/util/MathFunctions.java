package math.util;

import java.math.BigInteger;
import java.util.ArrayList;

public class MathFunctions {

	public static ArrayList<Long> aLi = math.util.MathFunctions
			.savePrimesUptoNumbToArrayList(987654322);

	public static ArrayList<Long> savePrimesUptoNumbToArrayList(long numb) {
		ArrayList<Long> aList = new ArrayList<Long>();
		for (long i = 0; i < numb; i++) {
			if (math.util.MathFunctions.isPrime(i)) {
				aList.add(i);
			}
		}
		return aList;
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

	public static int reverseNumber(int numb) {
		int reverse = 0;
		while (numb != 0) {
			reverse = reverse * 10;
			reverse = reverse + numb % 10;
			numb = numb / 10;
		}
		return reverse;
	}
	
	public static String numberInBaseTwo (int numb){
		int n=numb;
        int r;
        String s=""; //variable for storing the result
        char dig[]={'0','1'}; //array storing the digits (as characters) in a binary number system
        while(n>0)
            {
                r=n%2; //finding remainder by dividing the number by 2
                s=dig[r]+s; //adding the remainder to the result and reversing at the same time
                n=n/2;
            }
		return s;
	}
	
	public static int hcf(int a , int b){
		int hcf = 1;
		for (int i=1;i<=a;i++){
			if(isPrime(i) && a%i==0 && b%i==0){
				hcf *=i;
			}
		}
		return hcf;
	}
	
	public static long factorial(long numb) {
		long product = 1;
		for (long i = 1; i <= numb; i++) {
			product *= i;
		}
		//System.out.println("Value of factorial is " + product);
		return product;
	}

	public static BigInteger factorialBI(long numb) {
		BigInteger product = BigInteger.valueOf(1);
		for (long i = 1; i <= numb; i++) {
			product = product.multiply(BigInteger.valueOf(i));
			System.out.println("Value of factorial is " + product);
		}
		System.out.println("Value of factorial is " + product);
		return product;
	}

	public static long noOfDivisors(long numb) {
		long numbOfFactors = 1;
		for (int i = 0; i < aLi.size(); i++) {
			long count = 0;
			long numb1 = numb;
			long divisor = aLi.get(i);
			if (divisor > numb / 2)
				break;
			while (numb1 % divisor == 0) {
				numb1 /= divisor;
				count++;
			}
			numbOfFactors *= (count + 1);
		}
		return numbOfFactors;
	}

	public static int sumOfDigits(BigInteger value) {
		int intSum = 0;
		while (value.compareTo(BigInteger.valueOf(0)) == 1) {
			BigInteger remainder = value.mod(BigInteger.valueOf(10));
			intSum += remainder.intValue();
			value = value.divide(BigInteger.valueOf(10));
		}
		return intSum;
	}

	private static void permutation(String prefix, String str) {
		int n = str.length();
		if (n == 0)
			System.out.println(prefix);
		else {
			for (int i = 0; i < n; i++)
				permutation(prefix + str.charAt(i),
						str.substring(0, i) + str.substring(i + 1));
		}
	}
}
