package arithmetic;

public final class Exercise03GCD {

	public static final int greatestCommonDivisor(int n, int m) {
if (n <= 0 || m <= 0) throw new IllegalArgumentException();
		while (n!=m) {
			if (n>m) {
				n=n-m;					
			}
			else {
				m=m-n;
						
			}
			
		}
		return n;
	}
}
