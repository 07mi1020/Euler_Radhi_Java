package p28;

import java.io.IOException;
import java.math.BigInteger;

public class NumberSpiralDiagonals {
	
	public static void main(String[] args) throws IOException {
		long startTime = System.currentTimeMillis();
		System.out.println("Maximum total is : " + sumOfDiagonalNumbers());
		long endTime = System.currentTimeMillis();
		System.out.println("time taken: " + (endTime - startTime) / 1000 + "s");
	}

	private static BigInteger sumOfDiagonalNumbers() {
		BigInteger sumOfDiagonalNumber = BigInteger.ZERO;
		int sum = 1;
		int numb =1;
		for(int i = 1;i<250502;i++){
			int count = 0;
			int diff = i*2;
			while(count<4 && numb<1001*1001){
				numb += diff;
				sum += numb;
				count++;
			}
		}
		sumOfDiagonalNumber = BigInteger.valueOf(sum);
		return sumOfDiagonalNumber;
	}

}
