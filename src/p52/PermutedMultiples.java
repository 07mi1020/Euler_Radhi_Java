package p52;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class PermutedMultiples {
	
	public static void main(String[] args) throws IOException {
		long startTime = System.currentTimeMillis();
		System.out.println("Smallest positive integer required is : " +smallestPositiveInteger());
		long endTime = System.currentTimeMillis();
		System.out.println("time taken: " + (endTime - startTime) / 1000 + "s");
	}

	private static long smallestPositiveInteger() {
		for(long i = 1; i<=Math.pow(2, 32);i++){
			if(i+"".length() == i*2+"".length() && i*3+"".length() == i*4+"".length() && i*5+"".length() == i*6+"".length() && i*2+"".length() == i*4+"".length() && i*4+"".length() == i*6+"".length()){
				long numb = i;
				long twoX = i*2;
				long threeX = i*3;
				long fourX = i*4;
				long fiveX = i*5;
				long sixX = i*6;
				
				Set<Integer> set = new HashSet<Integer>();
				Set<Integer> set2 = new HashSet<Integer>();
				Set<Integer> set3 = new HashSet<Integer>();
				Set<Integer> set4 = new HashSet<Integer>();
				Set<Integer> set5 = new HashSet<Integer>();
				Set<Integer> set6 = new HashSet<Integer>();
				for(int j=0; j<i+"".length();j++){
					set.add((int) (numb%10));
					set2.add((int) (twoX%10));
					set3.add((int) (threeX%10));
					set4.add((int) (fourX%10));
					set5.add((int) (fiveX%10));
					set6.add((int) (sixX%10));
					
					numb /=10;
					twoX /=10;
					threeX /=10;
					fourX /=10;
					fiveX /=10;
					sixX /=10;
					
					if(set.equals(set2) && set3.equals(set4) && set5.equals(set6) && set2.equals(set4) && set4.equals(set6))
						return i;
				}
			}
		}
		return 0;
	}

}
