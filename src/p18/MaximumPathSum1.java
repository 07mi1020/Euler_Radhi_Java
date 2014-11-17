package p18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class MaximumPathSum1 {

	public static void main(String[] args) throws IOException {
		long startTime = System.currentTimeMillis();
		System.out.println("Maximum total is : " + maxTotal());
		long endTime = System.currentTimeMillis();
		System.out.println("time taken: " + (endTime - startTime) / 1000 + "s");
	}

	private static BigInteger maxTotal() throws IOException {
		BigInteger maxTotal = BigInteger.valueOf(0);
		InputStream is = null;
		is = new FileInputStream(
				"/home/gyandata/workspace/EulerProject/p067_triangle.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String text = "";
		int i = 0;
		int[][] twoDArray = new int[100][];
		while ((text = br.readLine()) != null) {
			String[] words = text.split(" ");
			twoDArray[i] = new int[i + 1];
			for (int j = 0; j < words.length; j++) {
				twoDArray[i][j] = Integer.parseInt(words[j]);
			}
			i++;
		}
		br.close();
		
		for (int m = 98; m >= 0; m--) {
			for (int n = 0; n < twoDArray[m].length; n++)
				twoDArray[m][n] += Math.max(twoDArray[m + 1][n], twoDArray[m + 1][n + 1]);  
		} 
		
		maxTotal = BigInteger.valueOf(twoDArray[0][0]);
		return maxTotal;
	}

}
