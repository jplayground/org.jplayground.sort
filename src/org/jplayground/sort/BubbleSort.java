package org.jplayground.sort;

import java.util.Collection;
import java.util.Comparator;

/**
 * @author Sheikh Sajid
 * @param <T>
 * 
 */
public class BubbleSort<T> implements Sorter<T> {

	@Override
	public void sort(byte[] a) {
		sort(a, 0, a.length - 1);
	}

	@Override
	public void sort(byte[] a, int first, int last) {
		for (int i = first; i <= last; ++i) {
			for (int j = i + 1; j <= last; ++j) {
				if (a[i] > a[j])
					swap(a, i, j);
			}
		}
	}

	@Override
	public void sort(T[] objectArray, Comparator<T> comparator) {
		// TODO Auto-generated method stub
	}

	@Override
	public void sort(Collection<T> objectColl, Comparator<T> comparator) {
		// TODO Auto-generated method stub

	}

	private static void swap(byte[] a, int i, int j) {
		byte t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	private static void swap(Object[] a, int i, int j) {
		Object t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
}
