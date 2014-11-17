package problems;

import java.math.BigInteger;

public class p56 {
	
	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		System.out.println("Maximum digital sum : "+maxDigitalSum());
		long endTime = System.currentTimeMillis();

		System.out.println("time taken: " + (endTime - startTime) / 1000 + "s");
	}

	private static int maxDigitalSum() {
		int maxSum = 0;
		for(int b=100;b>=1;b--){
			for(BigInteger a=BigInteger.ONE;a.compareTo(BigInteger.valueOf(100))<=0;a = a.add(BigInteger.ONE)){
				BigInteger n = a.pow(b);
				int sum = sumOfDigits(n);
				if(sum>maxSum)
					maxSum = sum;
			}
		}
		
		return maxSum;
	}

	private static int sumOfDigits(BigInteger n) {
		String s = ""+n;
		int sum =0;
		for(int i=0;i<s.length();i++){
			sum += Integer.parseInt(""+s.charAt(i));
		}
		return sum;
	}

}
