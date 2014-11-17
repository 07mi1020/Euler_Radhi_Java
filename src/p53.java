package problems;

public class p53 {
	
	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		System.out.println("Number of values greater than one million : "+numbOfValuesGreaterThanMillion());
		long endTime = System.currentTimeMillis();

		System.out.println("time taken: " + (endTime - startTime) / 1000 + "s");
	}

	private static int numbOfValuesGreaterThanMillion() {
		int sum = 0;
		for(int n = 1;n<=100;n++){
			for(int r=2;r<=n/2+1;r++){
				long c = combinatorial(n,r);
				if(c>1000000){
					sum += n-2*(r-1)-1;
					break;
				}
			}
		}
		return sum;
	}

	private static long combinatorial(int n, int r) {
		long prod = 1;
		int greater = Math.max(r, n-r);	
		for(int i = n;i>greater;i--){
			prod *= i;
			//System.out.println("Value of n : "+n+ " where value of prod is :"+prod);
		}
		int prodFactorial = factorial(n-greater);
		//System.out.println("Product is : "+prod+" and productFactorial is : "+prodFactorial);
		prod /=prodFactorial;
		return prod;
	}

	private static int factorial(int numb) {
		int product =1;
		for(int i =1;i<=numb;i++){
			product*=i;
		}
		return product;
	}

}
