package p39;

public class IntegerRightTriangles {
	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		System.out.println("perimeter with largest number of right triangles is "
				+ perimeterWithMaxRtTriangles());
		long endTime = System.currentTimeMillis();

		System.out.println("time taken: " + (endTime - startTime) / 1000 + "s");
	}

	private static int perimeterWithMaxRtTriangles() {
		int maxCount =0;
		int maxP = 0;
		for(int p=0;p<=1000;p++){
			int count = 0;
			for(int j=1;j<1001;j++){
				for(int k=1;k<p-j-1;k++){
					int i = p-j-k;
					if(i*i==j*j+k*k && j+k>i && j<i && k<i){
						count += 1;
						if (count>maxCount){
							maxCount = count;
							maxP =p;
						}
					}
				}
			}
		}		
		return maxP;
	}
}
