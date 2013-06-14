/**
 * 
 */
package org.jplayground.tests.sort;

import org.jplayground.sort.BubbleSort;

import junit.framework.TestCase;

/**
 * @author BANSS
 * 
 */
public class BubbleSortTest extends TestCase {
	private BubbleSort bubbleSort = null;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		bubbleSort = new BubbleSort<>();
	}

	/**
	 * Test method for {@link org.jplayground.sort.BubbleSort#sort(byte[])}.
	 */
	public void testSortByteArray() {
		byte[] a = new byte[] { 3, 7, 2, 5 };
		bubbleSort.sort(a);
		validate(a);
	}

	/**
	 * Test method for
	 * {@link org.jplayground.sort.BubbleSort#sort(byte[], int, int)}.
	 */
	public void testSortByteArrayIntInt() {
		fail("Not yet implemented"); // TODO
	}

	private void validate(byte[] a) {
		for (int i = 0; i < a.length - 1; ++i) {
			assertTrue(a[i] <= a[i + 1]);
		}
	}

	private void validate(byte[] a, int first, int last) {
		for (int i = first; i < last; ++i) {
			assertTrue(a[i] <= a[i + 1]);
		}
	}
}
