//package Lab1;
import static org.junit.Assert.*;
import org.junit.Test;

public class UtilTest {
	@Test
	public void testReverse() {
		int[] arr1 = new int[] { 1, 2, 3, 4, 5 };
		int[] arr2 = new int[] { 1, 2, 3, 4, 5, 6 };
		Util.reverse(arr1);
		Util.reverse(arr2);
		assertArrayEquals(new int[] { 5, 4, 3, 2, 1 }, arr1);
		assertArrayEquals(new int[] { 6, 5, 4, 3, 2, 1 }, arr2);
	}

	@Test
	public void testReversed() {
		int[] arr1 = new int[] { 1, 2, 3, 4, 5 };
		int[] arr2 = new int[] { 1, 2, 3, 4, 5, 6 };
		int[] arr3 = Util.reversed(arr1);
		int[] arr4 = Util.reversed(arr2);
		assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, arr1);
		assertArrayEquals(new int[] { 5, 4, 3, 2, 1 }, arr3);
		assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6 }, arr2);
		assertArrayEquals(new int[] { 6, 5, 4, 3, 2, 1 }, arr4);
	}

	@Test
	public void testSumOfPositives() {
		assertEquals(3, Util.sumOfPositives(new int[] { 1, 1, 1 }));
		assertEquals(7, Util.sumOfPositives(new int[] { 1, 2, 4 }));
		assertEquals(9, Util.sumOfPositives(new int[] { -3, 0, 3, 6 }));
	}
}
