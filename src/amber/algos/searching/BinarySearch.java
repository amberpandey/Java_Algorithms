/*
 * General Algorithms in Java
 * BinarySearch.java
 */
package amber.algos.searching;

/**
 * @author Amber
 * 
 *         Implementation of Binary Search
 */
public class BinarySearch {
	/**
	 * <p>
	 * <b>Binary Search</b> </br>
	 * Also Known as also known as half-interval search,logarithmic search or
	 * binary chop. Binary search looks for a particular item by comparing the
	 * middle most item of the collection. If a match occurs, then the index of
	 * item is returned. If the middle item is greater than the item, then the
	 * item is searched in the sub-array to the left of the middle item.
	 * Otherwise, the item is searched for in the sub-array to the right of the
	 * middle item. This process continues on the sub-array as well until the
	 * size of the subarray reduces to zero.
	 * </p>
	 * <p>
	 * <b>Points :-</b></br>
	 * 1. binary search is used to quickly find a value in a sorted
	 * sequence.</br>
	 * 2. Half of the list is removed before each comparison.</br>
	 * </p>
	 * <p>
	 * <b>Complexities :-</b></br>
	 * <font color = "blue"> </br>
	 * <b>Best Case Time complexity :-</b> O(1)</br>
	 * <b>Worst Case Time complexity :-</b> O(log n)</br>
	 * <b>Average Case Time Complexity :-</b> O(log n)</br>
	 * <b>Space Complexity :-</b> O(1)</br>
	 * </font>
	 * </p>
	 * 
	 * @param arrayOfNumbers
	 *            Target list of numbers where we want to search particular
	 *            number
	 * @param noToSearch
	 *            number we are looking to search in given list.
	 * @return
	 */
	public static int binarySearch(int[] arrayOfNumbers, int noToSearch) {
		int low = 0;
		int high = arrayOfNumbers.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arrayOfNumbers[mid] == noToSearch) {
				return mid;
			} else if (arrayOfNumbers[mid] < noToSearch) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;

	}

}
