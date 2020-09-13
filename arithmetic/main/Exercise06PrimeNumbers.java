package arithmetic;

public final class Exercise06PrimeNumbers {
	
	public static final int[] generatePrimeNumbersLowerThan(int n) {
		int[] results = new int[] {};
		for (int i=2; i<n; i++) {
			int index = 0;
			if (n/i != 0) {
			results[index]=i;
			index++;
			}
			else continue;
		}
		// TODO: implement
		return new int[] {};
	}
}



