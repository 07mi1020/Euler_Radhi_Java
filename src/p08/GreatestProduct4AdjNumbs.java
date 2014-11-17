package p08;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GreatestProduct4AdjNumbs {
	
	public static long max=0;
	
	public static void main(String[] args) throws IOException {
		byte[] fullText = Files.readAllBytes(Paths.get("/home/gyandata/workspace/EulerProject/P8LlargestProductInSeries"));
		long[] intText=new long[fullText.length];
		for(int i=0;i<fullText.length;i++){
			intText[i]=fullText[i]-'0';
		}
				
		for(int k=0;k<(intText.length-12);k++){
			long product =1;
			System.out.println("element of intText : "+intText[k]);
			for(int count=0;count<13;count++){
				product *= intText[k+count];
			}
			System.out.println("product : "+product);
			if(product>max){
				max = product;
			}
		}

		System.out.println("Product is " + max);
	}
}

/*
InputStream input = null;
input = new FileInputStream("F:\\Java\\p8.txt");
InputStreamReader reader = new InputStreamReader(input);
List<Long> list = new ArrayList<Long>();
int charecter;
while((charecter= reader.read())>0){
list.add((long)charecter-'0');
}
*/