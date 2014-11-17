package p09;

public class nine {

	public static void main(String[] args) {
		long lP = pythagoreanTriplet();
		System.out.println("Product of coefficients is " + lP);
	}

	private static long pythagoreanTriplet() {
		int product=1;
		for (int a = 998; a >= 1; a--) {
			for (int b = 998; b >= 1; b--) {
				if (a < b) {
					for (int c = 998; c >= 1; c--) {
						if (b<c && a + b + c ==1000 && a * a + b * b == c * c) {
							product=a*b*c;
						}
					}
				}
			}
		}
		return product;
	}

}
