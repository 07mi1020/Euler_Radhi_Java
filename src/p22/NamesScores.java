package p22;

import java.util.ArrayList;
import java.util.Collections;

public class NamesScores {

	public static long sum = 0;

	public static ArrayList<String> nameList = new ArrayList<String>();

	public static void main(String[] args) throws Exception {
		String content = network_util.NetworkFunctions.getText("http://projecteuler.net/project/resources/p022_names.txt").replace("\"", "");
        String delimiter = ",";
        String[] temp = content.split(delimiter);
        for (int l = 0; l < temp.length; l++){
            nameList.add(temp[l]);
        }
        Collections.sort(nameList);
		long lP = sumOfNamesScores();
		System.out.println("Product of coefficients is " + lP);
	}
	
	

	private static long sumOfNamesScores() {
		for (long i = 0; i < nameList.size(); i++) {
			String name = nameList.get((int) i);
			sum += (i + 1) * nameValue(name);
		}
		return sum;
	}

	private static long nameValue(String name) {
		int sumP = 0;
		for (int i = 0;i < name.length(); i++){
			int x = name.charAt(i)-64;
		    sumP += x;
		}
		return sumP;
	}

}
