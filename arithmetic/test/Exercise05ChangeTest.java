package arithmetic;

import static arithmetic.Exercise05Change.countChanges;
import static org.junit.Assert.*;

import org.junit.Test;

public class Exercise05ChangeTest {

	@Test
	public void testSampleChange11() {
		assertArrayEquals(new int[] { 0, 0, 1, 0, 0, 1 }, countChanges(11));
	}

	@Test
	public void testSampleChange69() {
		assertArrayEquals(new int[] { 1, 0, 1, 1, 2, 0 }, countChanges(69));
	}

	@Test
	public void testSampleChange100() {
		assertArrayEquals(new int[] { 2, 0, 0, 0, 0, 0 }, countChanges(100));
	}

	@Test
	public void testSampleChange138() {
		assertArrayEquals(new int[] { 2, 1, 1, 1, 1, 1 }, countChanges(138));
	}

}
