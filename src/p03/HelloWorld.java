package p03;

public class HelloWorld{
	   public static long lP;
	   public static long x = 600851475143L;
	   public static long reducedNumb;
	   public static boolean boo= true;

	     public static void main(String []args){
	       lP=largestPrimeFactor(x);
	        System.out.println("Largest prime factor is "+lP);
	     }
	     
	     
	     public static boolean isPrime(long n){
	         System.out.println("isPrime("+n+")");
	        if ( n % 2 == 0 ) {
	             System.out.println("false");
	            return false;
	        }
	        long half = (n/2) % 2 == 0 ? (n/2)-1 : n/2; 
	        for ( int i = 3; i < half; i += 2 ) 
	        {
	            if ( n % i == 0 ){
	                 System.out.println("false");
	                return false;
	            }
	        }
	        System.out.println("true");
	        return true;
	     }
	     
	     
	     public static long largestPrimeFactor(long x){
	         long j=2;
	         reducedNumb=x;
	         while(boo){
	        	 if(reducedNumb %j==0){
	        		 reducedNumb /= j;
	        		 if(isPrime(reducedNumb)){
	        			 boo = false;
	        			 return reducedNumb;	        			 
	        		 }
	        		 j--;
	        	 }
	        	 j++;
	         }
	         return 0;
	     }
	     
	     
	}
