package arithmetic;

import static arithmetic.Exercise03GCD.greatestCommonDivisor;
import static org.junit.Assert.*;

import org.junit.Test;

public class Exercise03GCDTest {

	@Test
	public void testCommonNumbers() {
		assertEquals(4, greatestCommonDivisor(8, 12));
		assertEquals(14, greatestCommonDivisor(42, 56));
	}
	
	@Test
	public void testCoprimeNumbers() {
		assertEquals(1, greatestCommonDivisor(12, 13));
		assertEquals(1, greatestCommonDivisor(12, 17));
		assertEquals(1, greatestCommonDivisor(12, 19));
	}
	
	public void testEqualNumbers() {
		assertEquals(1, greatestCommonDivisor(1, 1));
		assertEquals(8, greatestCommonDivisor(8, 8));
	}
	
	@Test(expected=Exception.class)
	public void testFirstNegativeNumber() {
		greatestCommonDivisor(-1, 5);
	}
	
	@Test(expected=Exception.class)
	public void testSecondNegativeNumber() {
		greatestCommonDivisor(4, -3);
	}
	
	@Test(expected=Exception.class)
	public void testFirstNumberZero() {
		greatestCommonDivisor(0, 4);
	}
	
	@Test(expected=Exception.class)
	public void testSecondNumberZero() {
		greatestCommonDivisor(3, 0);
	}

}
