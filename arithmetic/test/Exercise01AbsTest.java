package arithmetic;

import static org.junit.Assert.*;

import org.junit.Test;

import arithmetic.Exercise01Abs;

public class Exercise01AbsTest {

	@Test
	public void testPositiveValue() {
		assertEquals(1, Exercise01Abs.abs(1));
		assertEquals(1324, Exercise01Abs.abs(1324));
	}
	
	@Test
	public void testNegativeValue() {
		assertEquals(1, Exercise01Abs.abs(-1));
		assertEquals(1324, Exercise01Abs.abs(-1324));
	}
	
	@Test
	public void testZero() {
		assertEquals(0, Exercise01Abs.abs(0));
	}
	
	
	
	
	
	

}
