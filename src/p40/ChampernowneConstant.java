package p40;

public class ChampernowneConstant {
	
	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		System.out.println("perimeter with largest number of right triangles is "
				+ champernowneConstant());
		long endTime = System.currentTimeMillis();

		System.out.println("time taken: " + (endTime - startTime) / 1000 + "s");
	}

	private static int champernowneConstant() {
		String s = "";
		for(int i =1;s.length()<1000002 && i<=185186;i++){
			s = s+ Integer.toString(i);
		}
		System.out.println("s : "+s);
		//d1 × d10 × d100 × d1000 × d10000 × d100000 × d1000000
		return Integer.parseInt(s.substring(0, 1))*Integer.parseInt(s.substring(9, 10))*Integer.parseInt(s.substring(99, 100))*Integer.parseInt(s.substring(999, 1000))*Integer.parseInt(s.substring(9999, 10000))*Integer.parseInt(s.substring(99999, 100000))*Integer.parseInt(s.substring(999999, 1000000));
	}

}
