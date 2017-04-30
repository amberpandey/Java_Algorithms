/*
 * General Algorithms in Java
 *
 */
package amber.algos.sorting;

/**
 * @author Amber
 *
 */
public class InsertionSort {
	/**
	 * <p>
	 * <b>Insertion Sort :-</b></br>
	 * Insertion sort is a simple sorting algorithm that works the way we sort
	 * playing cards in our hands.
	 * </p>
	 * <p>
	 * <b> Steps:-</b></br>
	 * 1. if first number of list , Pass</br>
	 * 2. pick next number and compare in sorted sub array</br>
	 * 3. move all elements which is greater than this number, and insert number.</br>
	 * 4. repeat untill list is sorted.</br>
	 * </p>
	 * <p>
	 * <b>Complexities :-</b></br>
	 * <font color = "blue"> <b>Time Complexity :</b> O(n*n)</br>
	 * <b>Auxiliary Space : </b> O(1)</br>
	 * <b>Boundary Cases : </b>Insertion sort takes maximum time to sort if
	 * elements are sorted in reverse order. And it takes minimum time (Order of
	 * n) when elements are already sorted.</br>
	 * <b>Sorting In Place : </b>Yes</br>
	 * <b>Stable :</b> Yes</br>
	 * <b>Algorithmic Paradigm: </b>Incremental Approach </font>
	 * </p>
	 * 
	 * @param arrayToSort list of numbers for sorting
	 * @return sorted list of numbers
	 */
	public static int[] doInsertionSort(int[] arrayToSort) {
		for (int i = 0; i < arrayToSort.length; i++) {
			int j = i - 1;
			int comparisonKey = arrayToSort[i];
			// Iterating the sorted sub array
			while (j >= 0 && arrayToSort[j] > comparisonKey) {
				arrayToSort[i] = arrayToSort[j];
				j = j - 1;
			}
			arrayToSort[i] = comparisonKey;
		}
		return arrayToSort;
	}

}
