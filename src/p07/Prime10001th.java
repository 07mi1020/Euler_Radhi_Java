package p07;

public class Prime10001th {
	public static int count=4;
	public static int j=8;
	
	 public static void main(String []args){
	       int lP=primeNeeded();
	        System.out.println("Largest prime factor is "+lP);
	     }
	 public static int primeNeeded(){
		 while(count<10002){
			 if(isPrime(j)){
				 count++;
			 }
			 if(count==10001){
				 return j;
			 }
			 j++;
		 }
		return 0;
	 }
	 public static boolean isPrime(int n){
        
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
