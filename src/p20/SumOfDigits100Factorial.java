package p20;

public class SumOfDigits100Factorial {
	
	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		System.out.println("Sum of Digits of 100! is "
				+ math.util.MathFunctions.sumOfDigits(math.util.MathFunctions.factorialBI(100)));
		long endTime = System.currentTimeMillis();

		System.out.println("time taken: " + (endTime - startTime) / 1000 + "s");
	}


}
