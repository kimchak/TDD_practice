package arithmetic;

import static arithmetic.Exercise04Fibonacci.fibonacci;
import static org.junit.Assert.*;

import org.junit.Test;

public class Exercise04FibonacciTest {

	@Test
	public void testPositiveNumbers() {
		assertEquals(1, fibonacci(1));
		assertEquals(1, fibonacci(2));
		assertEquals(2, fibonacci(3));
		assertEquals(5, fibonacci(5));
		assertEquals(55, fibonacci(10));
		assertEquals(6765, fibonacci(20));
	}
	
	@Test
	public void testZero() {
		assertEquals(0, fibonacci(0));
	}
	
	@Test(expected=Exception.class)
	public void testNegativeNumber() {
		fibonacci(-1);
	}
	
	

}
