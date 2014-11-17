package p31;

public class CoinSums {
	
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		System.out.println("Number of ways is " + numberOfDifferentCombos());
		long endTime = System.currentTimeMillis();

		System.out.println("time taken: " + (endTime - startTime) / 1000 + "s");
	}

	private static int numberOfDifferentCombos() {
		int numbOfCombos = 1;
		int sum = 0;
		int onePence=1, twoPence=2, fivePence=5, tenPence=10, twentyPence=20, fiftyPence = 50, hundredPence = 100;
		for(int hP = 0;hP<=2;hP++){
			for(int fifP =0;fifP<=4;fifP++){
				for(int twentP = 0; twentP<=10;twentP++){
					for(int tenP = 0; tenP<=20;tenP++){
						for(int fiveP = 0; fiveP<=40;fiveP++){
							for(int twoP = 0; twoP<=100;twoP++){
								for(int oneP = 0; oneP<=200;oneP++){
									sum = oneP*onePence + twoP*twoPence + fiveP*fivePence + tenP*tenPence + twentP*twentyPence + fifP*fiftyPence + hP*hundredPence ;
									if(sum==200)
										numbOfCombos++;
								}
							}
						}
					}
				}
			}
		}
		return numbOfCombos;
	}

}
