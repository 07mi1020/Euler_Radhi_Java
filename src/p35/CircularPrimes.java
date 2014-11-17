package p35;

public class CircularPrimes {
	
	/*The number, 197, is called a circular prime because all rotations of the digits: 197, 971, and 719, are themselves prime.

There are thirteen such primes below 100: 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, and 97.

How many circular primes are there below one million?*/
	
	public static void main(String []args){
	       long lP=numerOfCircularPrimes(1000000);
	        System.out.println("No. of circular primes is "+lP);
	     }

	private static long numerOfCircularPrimes(long numb) {
		long j=1;
		long count=0;
		while(j<=numb){
			if(j<10 && math.util.MathFunctions.isPrime(j)){
				count++;
				System.out.println("Count in single digits:" + count);
			}else if(j<100 && math.util.MathFunctions.isPrime(j)){
				int intJ = (int)j;
				int unitsDigit= intJ%10;
				int tensDigit = intJ/10;
				int revJ = unitsDigit*10 +tensDigit;
				if(math.util.MathFunctions.isPrime(revJ)){
					count++;
					System.out.println("The prime is "+intJ);
					System.out.println("The reverse prime is "+revJ);
					System.out.println("Count in double digits:" + count);
				}
			}else if(j<1000 && math.util.MathFunctions.isPrime(j)){
				//3 digit
				int intJ = (int)j;
				int unitsDigit= intJ%10;
				int tensDigit = (intJ%100)/10;
				int hundredsDigit = intJ/100;
				int revJ1 = tensDigit*100 + unitsDigit*10 + hundredsDigit;
				int revJ2 = unitsDigit*100 + hundredsDigit*10+ tensDigit;
				if(math.util.MathFunctions.isPrime(revJ1) && math.util.MathFunctions.isPrime(revJ2)){
					System.out.println("The prime is "+intJ);
					count++;
					System.out.println("Count in 3 digits:" + count);
				}
				
			}else if(j<10000 && math.util.MathFunctions.isPrime(j)){
				//4 digit
				int intJ = (int)j;
				int unitsDigit= intJ%10;
				int tensDigit = (intJ%100)/10;
				int hundredsDigit = (intJ%1000)/100;
				int thousandsDigit = intJ/1000;
				int revJ1 = hundredsDigit*1000 + tensDigit*100 + unitsDigit*10 + thousandsDigit;
				int revJ2 = tensDigit*1000 +unitsDigit*100 + thousandsDigit*10 + hundredsDigit;
				int revJ3 = unitsDigit*1000 + thousandsDigit*100 + hundredsDigit*10 + tensDigit ;
				if(math.util.MathFunctions.isPrime(revJ1) && math.util.MathFunctions.isPrime(revJ2) && math.util.MathFunctions.isPrime(revJ3)){
					System.out.println("The prime is "+intJ);
					count++;
					System.out.println("Count in 4 digits:" + count);
				}
				
			}else if(j<100000 && math.util.MathFunctions.isPrime(j)){
				//5 digit
				int intJ = (int)j;
				int unitsDigit= intJ%10;
				int tensDigit = (intJ%100)/10;
				int hundredsDigit = (intJ%1000)/100;
				int thousandsDigit = (intJ%10000)/1000;
				int tenthousandsDigit = intJ/10000;
				int revJ1 =  thousandsDigit*10000 + hundredsDigit*1000 + tensDigit*100 + unitsDigit*10 + tenthousandsDigit;
				int revJ2 = hundredsDigit*10000 +tensDigit*1000 +   unitsDigit*100 + tenthousandsDigit*10 + thousandsDigit;
				int revJ3 = tensDigit*10000 +  unitsDigit*1000 + tenthousandsDigit*100 + thousandsDigit*10 + hundredsDigit ;
				int revJ4 = unitsDigit*10000 + tenthousandsDigit*1000 + thousandsDigit*100 + hundredsDigit*10 + tensDigit ;
				if(math.util.MathFunctions.isPrime(revJ1) && math.util.MathFunctions.isPrime(revJ2) && math.util.MathFunctions.isPrime(revJ3) && math.util.MathFunctions.isPrime(revJ4)){
					System.out.println("The prime is "+intJ);
					count++;
					System.out.println("Count in 5 digits:" + count);
				}
				
			}else if(math.util.MathFunctions.isPrime(j)){
				//6 digit
				int intJ = (int)j;
				int unitsDigit= intJ%10;
				int tensDigit = (intJ%100)/10;
				int hundredsDigit = (intJ%1000)/100;
				int thousandsDigit = (intJ%10000)/1000;
				int tenthousandsDigit = (intJ%100000)/10000; 
				int lakhDigit = intJ/10000;
				int revJ1 = tenthousandsDigit*100000 + thousandsDigit*10000 + hundredsDigit*1000 + tensDigit*100 + unitsDigit*10 + lakhDigit;
				int revJ2 = thousandsDigit*100000 +  hundredsDigit*10000 + tensDigit*1000 + unitsDigit*100 +lakhDigit*10 + tenthousandsDigit;
				int revJ3 = hundredsDigit*100000 + tensDigit*10000 +   unitsDigit*1000 + lakhDigit*100 + tenthousandsDigit*10 + thousandsDigit ;
				int revJ4 = tensDigit*100000 + unitsDigit*10000 + lakhDigit*1000 + tenthousandsDigit*100 + thousandsDigit*10 + hundredsDigit;
				int revJ5 = unitsDigit*100000 + lakhDigit*10000 + tenthousandsDigit*1000 + thousandsDigit*100 + hundredsDigit*10 + tensDigit ;
				if(math.util.MathFunctions.isPrime(revJ1) && math.util.MathFunctions.isPrime(revJ2) &&
						math.util.MathFunctions.isPrime(revJ3) && math.util.MathFunctions.isPrime(revJ4) && math.util.MathFunctions.isPrime(revJ5)){
					System.out.println("The prime is "+intJ);
					count++;
					System.out.println("Count in six digits:" + count);
				}
			}
			j++;
		}
		return count;
	}

}
