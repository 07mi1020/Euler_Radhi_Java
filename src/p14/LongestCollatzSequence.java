package p14;

public class LongestCollatzSequence {

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		System.out.println("Number with longest Collatz Sequence is "
				+ numbWithLongestChain());
		long endTime = System.currentTimeMillis();

		System.out.println("time taken: " + (endTime - startTime) / 1000 + "s");
	}

	private static long numbWithLongestChain() {
		long maxChainLength = 0;
		long iWithMaxChain = -1;
		for (long i = 2; i < 1000000; i++) {
			long length = lengthOfChain(i);
			if (length > maxChainLength) {
				maxChainLength = length;
				iWithMaxChain = i;
			}
		}
		return iWithMaxChain;
	}

	private static long lengthOfChain(long i) {
		long count = 0;
		long numb = i;
		while (numb != 1) {
			if (numb % 2 == 0) {
				numb /= 2;
			} else {
				numb = 3 * numb + 1;
			}
			count += 1;
		}
		return count;
	}

}
