package p13;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class First10DigitsOfProdcut {
	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		System.out.println("First 10 digits of product are "
				+ first10Digits(productOfNumbers()));
		long endTime = System.currentTimeMillis();

		System.out.println("time taken: " + (endTime - startTime) / 1000 + "s");
	}

	private static BigInteger productOfNumbers() {
		BigInteger sum = BigInteger.valueOf(0);
		InputStream is = null;
		try {
			is = new FileInputStream(
					"/home/gyandata/workspace/EulerProject/p13_text");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		try {
			String text="";
			while ((text=br.readLine())!=null) {
				sum = sum.add(new BigInteger(text));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sum;
	}

	private static BigInteger first10Digits(BigInteger numb) {
		BigInteger firstTenDigits = BigInteger.valueOf(0);
		int numbOfDigits = numb.toString().length();
		int temp = numbOfDigits - 10;
		if (temp > 0)
			firstTenDigits = numb.divide(BigInteger.valueOf(10).pow(temp));
		return firstTenDigits;
	}

}
