package problems;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class p42 {
	
	public static ArrayList<Integer> aList = new ArrayList<Integer>();
	
	public static void main(String[] args) throws IOException {
		long startTime = System.currentTimeMillis();
		for(int i=0;i<10000;i++){
			aList.add(i*(i+1)/2);
		}
		System.out.println("Number of triangle words is :"+numberOfTriangleWords());
		long endTime = System.currentTimeMillis();

		System.out.println("time taken: " + (endTime - startTime) / 1000 + "s");
	}

	private static int numberOfTriangleWords() throws IOException {
		File file = new File("/home/radhika/Documents/workspace-sts-3.6.1.RELEASE/EulerProject/p042_words.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String text = "";
		int count = 0;
		while ((text = br.readLine()) != null) {
            String[] words = text.split(",");
            for (String word : words) {
                int len = word.length();
                int sum =0;
                for(int i=0;i<len;i++){
                	int temp = word.charAt(i)-'A'+1;
                	sum +=temp;
                }
                if(aList.contains(sum)){
                	count +=1;
                }
            }
        }
		return count;
	}
}
