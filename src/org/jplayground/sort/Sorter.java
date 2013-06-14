package org.jplayground.sort;

import java.util.Collection;
import java.util.Comparator;

/**
 * @author Sheikh Sajid
 * 
 */
public interface Sorter<T> {
	public void sort(byte[] a);

	public void sort(byte[] a, int first, int last);

	public void sort(T[] objectArray, Comparator<T> comparator);

	public void sort(Collection<T> objectColl, Comparator<T> comparator);

}
