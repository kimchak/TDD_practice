package arithmetic;

import static arithmetic.Exercise07InsertionSort.sort;
import static org.junit.Assert.*;

import org.junit.Test;

public class Exercise07InsertionSortTest {

	@Test
	public void testSortCommonArray() {
		assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, sort(new int[] { 3, 4, 1, 5, 2 }));
	}

	@Test
	public void testSortEmptyArray() {
		assertArrayEquals(new int[] {}, sort(new int[] {}));
	}

	@Test
	public void testSortOneElementArray() {
		assertArrayEquals(new int[] {3}, sort(new int[] {3}));
	}

	@Test
	public void testSortArrayWithTheSameElements() {
		assertArrayEquals(new int[] {6, 6, 6, 6, 6, 6}, sort(new int[] {6, 6, 6, 6, 6, 6}));
	}

	@Test
	public void testSortOrderedArray() {
		assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6}, sort(new int[] {1, 2, 3, 4, 5, 6}));
	}

	@Test
	public void testSortArrayWithReversedOrder() {
		assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6}, sort(new int[] {6, 5, 4, 3, 2, 1}));
	}

}
