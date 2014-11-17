package p41;

import java.util.ArrayList;

public class PandigitalPrime {
	public static ArrayList<Long> aLi = math.util.MathFunctions
			.savePrimesUptoNumbToArrayList(987654322);
	
	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
//		System.out.println("Biggest Pandigital Prime is "
//				+ pandigitalPrime());
		permutation("","123");
		long endTime = System.currentTimeMillis();

		System.out.println("time taken: " + (endTime - startTime) / 1000 + "s");
	}

	private static void permutation(String prefix, String str){
        int n = str.length();
        if (n == 0) 
            System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), 
            str.substring(0, i) + str.substring(i+1));
        }
    }
}
