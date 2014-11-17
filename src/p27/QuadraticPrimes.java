package p27;

public class QuadraticPrimes {
	public static boolean boo = true;

	public static void main(String[] args) {
		long lP = productOfCoefficients();
		System.out.println("Product of coefficients is " + lP);
	}

	private static long productOfCoefficients() {
		long n = 0;
		long maxN = 0;
		long term = 0;
		long product = 1;
		for (long a = -999; a < 1000; a++) {
			for (long b = 2; b < 1000; b++) {
				if (math.util.MathFunctions.isPrime(b)) {
					n = 1;
					boo = true;
					while (boo) {
						term = n * n + a * n + b;
						if (term > 0) {
							if (math.util.MathFunctions.isPrime(term)) {
								n++;
							} else if ((n - 1) > maxN) {
								maxN = n - 1;
								product = a * b;
								boo = false;
								System.out.println("Value of maxN is " + maxN);
								System.out.println("Value of a is " + a);
								System.out.println("Value of b is " + b);
								System.out.println("Value of product is "
										+ product);
							} else {
								boo = false;
							}
						}else{
							boo=false;
						}
					}
				}
			}
		}
		return product;
	}

}
