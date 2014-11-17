package p04;

public class LargestPalindromeProduct {
	
	public static void main(String []args){
	       int lP=largestPalindromeProduct();
	       System.out.println("Largest palindrome product is "+lP);
	     }

	private static int largestPalindromeProduct() {
		int max = 0;
		for(int i=100;i<1000;i++){
			for(int j=100;j<1000;j++){
				int product=i*j;
				if(isPalindrome(product)){
					if(product>max)
						max=product;
				}
			}
		}
		return max;
	}

	private static boolean isPalindrome(int product) {
		int originalNumb=product;
		int reverse=0;
		while( product != 0 )
	      {
	          reverse = reverse * 10;
	          reverse = reverse + product%10;
	          product = product/10;
	      }
		return (originalNumb==reverse) ;
	}
	

}
