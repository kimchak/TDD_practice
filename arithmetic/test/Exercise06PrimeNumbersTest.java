package arithmetic;

import static arithmetic.Exercise06PrimeNumbers.generatePrimeNumbersLowerThan;
import static org.junit.Assert.*;

import org.junit.Test;

public class Exercise06PrimeNumbersTest {

	@Test
	public void test() {
		assertArrayEquals(new int[] { 2, 3, 5, 7 }, generatePrimeNumbersLowerThan(10));
		assertArrayEquals(new int[] { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47 },
				generatePrimeNumbersLowerThan(50));
		assertArrayEquals(new int[] { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73,
				79, 83, 89, 97 }, generatePrimeNumbersLowerThan(100));

	}

}
