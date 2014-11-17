package p12;

public class Over500Divisors {	
	
	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		System.out.println("Number with more than 500 factors is "
				+ numbWithAtleast500Divisors());
		long endTime = System.currentTimeMillis();
		
		System.out.println("time taken: "+(endTime-startTime)/1000+"s");
	}

	private static long numbWithAtleast500Divisors() {
		long n = 1;
		long numb=0;
		while (true) {
			numb = n * (n + 1) / 2;
			if(math.util.MathFunctions.noOfDivisors(numb)>500){
				return numb;
			}else{
				n++;
			}
		}
	}

}
