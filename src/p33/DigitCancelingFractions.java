package p33;


public class DigitCancelingFractions {
	
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		System.out.println("Number of ways is " + productOfFractions());
		long endTime = System.currentTimeMillis();
		System.out.println("time taken: " + (endTime - startTime) / 1000 + "s");
	}

	private static double productOfFractions() {
		double product = 1;
		int count =0;
		for(double a =1; a<10;a++){
			for(double b = 1; b<10;b++){
				for(double c =1;c<10;c++){
					double ab = 10*a+b;
					double bc = 10*b+c;
					double ba = 10*b+a;
					double cb = 10*c+b;
					if(a/c<1 && ((ab/bc == a/c) || (ba/bc == a/c) || (ab/cb == a/c) || (ba/cb == a/c))){
						count ++;
						System.out.println("Fraction is "+a+" divided by "+c);
						System.out.println("Fraction is "+a/c);
						product *= a/c;
					}
				}
			}
		}
		System.out.println("Value of count is "+count);
		return product;
	}

}
