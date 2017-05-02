/*
 * General Algorithms in Java
 * QuickSort.java
 *
 */
package amber.algos.sorting;

/**
 * @author Amber
 *
 */
public class QuickSort {
	/**
	 * <p>
	 * <b>Quick Sort :-</b></br>
	 * QuickSort is a Divide and Conquer algorithm. It picks an element as pivot
	 * and partitions the given array around the picked pivot. There are many
	 * different versions of quickSort that pick pivot in different ways.</br>
	 *  1) Always pick first element as pivot. </br>
	 *  2) Always pick last element as pivot(implemented below) </br>
	 *  3) Pick a random element as pivot. </br>
	 *  4) Pick median as pivot.</br>
	 * </p>
	 * <p>
	 * <b>Steps :-</b></br>
	 *		1) Select a pivot.</br>
	 * 		2) From both ends, swap elements and make left elements < pivot and all right elements > pivot</br>
	 * 		3) Recursively sort left part and right part</br>
	 * </p>
	 * </p>
	 * <p>
	 * <b>Complexities :-</b></br>
	 * <font color = "blue"> <b>Time Complexity :</b> </br>
	 * 	Worst Case : O(n^2)</br>
	 * 	Best Case : O(n)</br>
	 * 	Average Case : O(n log n)</br>
	 * <b>Space Complexity :</b> O(1)</br>
	 * </font>
	 * </p>
	 * 
	 * @param arrayToSort
	 *            list of numbers for sorting
	 * @return sorted list of numbers
	 */
	public static int[] doQuickSort(int[] arrayToSort) {
		int low = 0;
		int high = arrayToSort.length - 1;
		QuickSort qs = new QuickSort();
		return qs.getSortedArray(arrayToSort, low, high);

	}

	/**
	 * 
	 * @param arrayToSort
	 * @param low
	 * @param high
	 * @return
	 */
	public int[] getSortedArray(int[] arrayToSort, int low, int high) {
		int pivot;
		if (high > low) {
			pivot = implementPartition(arrayToSort, low, high);
			getSortedArray(arrayToSort, low, pivot - 1);
			getSortedArray(arrayToSort, pivot + 1, high);
		}
		return arrayToSort;
	}

	/**
	 * partition implementation 
	 * @param arrayToSort
	 * @param low
	 * @param high
	 * @return
	 */
	private int implementPartition(int[] arrayToSort, int low, int high) {
		int pivot = arrayToSort[high];
		int i = (low - 1); // index of smaller element
		for (int j = low; j <= high - 1; j++) {
			// If current element is smaller than or
			// equal to pivot
			if (arrayToSort[j] <= pivot) {
				i++;

				// swap arr[i] and arr[j] if arr[j] i less or equal to pivot to have all number lesser than pivot on left side
				int temp = arrayToSort[i];
				arrayToSort[i] = arrayToSort[j];
				arrayToSort[j] = temp;
			}
		}

		// swap arr[i+1] and arr[high] (or pivot) to move pivot in between less and greater values
		int temp = arrayToSort[i + 1];
		arrayToSort[i + 1] = arrayToSort[high];
		arrayToSort[high] = temp;
		return i + 1;
	}
	

}
