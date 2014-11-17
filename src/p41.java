package problems;

public class p41 {
	
	
	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		permutation("","7654321");
		long endTime = System.currentTimeMillis();

		System.out.println("time taken: " + (endTime - startTime) / 1000 + "s");
	}

	private static void permutation(String prefix, String str){
        int n = str.length();
        if (n == 0){ 
        	if(isPrime(Long.parseLong(prefix)))
        			System.out.println(prefix);
            
        }else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), 
            str.substring(0, i) + str.substring(i+1));
        }
    }
	
	public static boolean isPrime(long n) {
		if (n == 1) {
			return false;
		}
		if (n != 2 && n % 2 == 0) {
			return false;
		}
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
