package p10;

public class SumPrimesBelow2Million {
	public static long sum=17;
	public static int j=8;
	
	 public static void main(String []args){
	       long lP=sumNeeded();
	        System.out.println("Sum of primes below 2 million is "+lP);
	     }
	 public static long sumNeeded(){
		 while(j<2000000){
			 if(isPrime(j)){
				 sum+=j;
			 }
			 j++;
		 }
		return sum;
	 }
	 public static boolean isPrime(long n){
        
        if ( n % 2 == 0 ) {
            return false;
        }
        for ( int i = 3; i <=  Math.sqrt(n); i += 2 ) 
        {
            if ( n % i == 0 ){
                return false;
            }
        }
        System.out.println("isPrime("+n+")");
        System.out.println("true");
        return true;
     }
}
