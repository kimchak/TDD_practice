package arithmetic;

public final class Exercise04Fibonacci {

	public static final int fibonacci(int n) {
		int fib1 = 0;
		int fib2 = 1;
		int temp = 0;
		if (n == 0)	return 0;
		if (n<0) throw new ArithmeticException();
		else

			for (int i = 1; i < n; i++) {
				temp = fib1;
				fib1 = fib2;
				fib2 = fib2 + temp;

			}

		return fib2;
	}
}
