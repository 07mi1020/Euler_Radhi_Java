package p87;

import java.util.ArrayList;

public class PrimePowerTriples {

	public static ArrayList<Long> aLi = math.util.MathFunctions
			.savePrimesUptoNumbToArrayList(7571);

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		System.out.println("Number of numbers is "
				+ numberOfPrimePowerTriples());
		long endTime = System.currentTimeMillis();

		System.out.println("time taken: " + (endTime - startTime) / 1000 + "s");
	}

	public static int numberOfPrimePowerTriples() {
		int LIMIT = 50000000;
		//double numb =0;
		int i = 0;
			for (int k = 0; Math.pow(aLi.get(k), 2)
					+ Math.pow(aLi.get(k), 3)
					+ Math.pow(aLi.get(k), 4)< LIMIT; k++) {
				for (int l = 0;  Math.pow(aLi.get(l), 2)
						+ Math.pow(aLi.get(l), 3)
						+ Math.pow(aLi.get(l), 4)< LIMIT; l++) {
					for (int m = 0;  Math.pow(aLi.get(m), 2)
							+ Math.pow(aLi.get(m), 3)
							+ Math.pow(aLi.get(m), 4) < LIMIT; m++) {
//						numb = Math.pow(aLi.get(m), 2)
//								+ Math.pow(aLi.get(l), 3)
//								+ Math.pow(aLi.get(k), 4);
//						if 
						i++;
					}
				}
			}
			
		return i;
	}

}
