/*
 * General Algorithms in Java
 *MergeSort.java
 */
package amber.algos.sorting;

/**
 * @author Amber
 *
 */
public class MergeSort {
	/**
	 * <p>
	 * <b>Merge Sort :-</b></br>
	 * Merge Sort is a Divide and Conquer algorithm. It divides input array in
	 * two halves, calls itself() for the two halves and then merges the two
	 * sorted halves. The merge() function is used for merging two halves. The
	 * merge(arrayToSort, low, mid, high) is key process that assumes that array[low..mid]
	 * and array[mid+1..high] are sorted and merges the two sorted sub-arrays into
	 * one.</br>
	 * </p>
	 * <p>
	 * <b>Steps :-</b></br>
	 * 1)Find middle point to divide the array into 2 halves</br>
	 * 2) call mergeSort on the 2 halves.</br>
	 * 3) Merge the 2 sorted halves</br>
	 * </p>
	 * </p>
	 * <p>
	 * <b>Complexities :-</b></br>
	 * <font color = "blue"> <b>Time Complexity :</b> </br>
	 * Worst Case : O(n log n)</br>
	 * Best Case : O(n log n)</br>
	 * Average Case : O(n log n)</br>
	 * <b>Space Complexity :</b> O(n)</br>
	 * </font>
	 * </p>
	 * 
	 * @param arrayToSort
	 *            list of numbers for sorting
	 * @return sorted list of numbers
	 */
	public static int[] doMergeSort(int[] arrayToSort) {
		int low = 0;
		int high = arrayToSort.length - 1;
		MergeSort ms = new MergeSort();
		ms.doSorting(arrayToSort, low, high);
		return arrayToSort;
	}

	/**
	 * merge Sort function which divides 2 arrays and than call merge to sort
	 * and merge
	 * 
	 * @param arrayToSort
	 * @param low
	 * @param high
	 */
	private void doSorting(int[] arrayToSort, int low, int high) {
		if (low < high) {
			// Same as (l+r)/2, but avoids overflow for
			// large l and h
			int mid = (high + low) / 2;

			// Sort first and second halves
			doSorting(arrayToSort, low, mid);
			doSorting(arrayToSort, mid + 1, high);

			merge(arrayToSort, low, mid, high);
		}
	}

	/**
	 * sort and merge
	 * 
	 * @param arrayToSort
	 * @param low
	 * @param mid
	 * @param high
	 */
	private void merge(int[] arrayToSort, int low, int mid, int high) {
		int n1 = mid - low + 1;
		int n2 = high - mid;

		/* Create temporary arrays */
		int left[] = new int[n1];
		int right[] = new int[n2];

		/* Copy data to temporary arrays */
		for (int i = 0; i < n1; i++) {
			left[i] = arrayToSort[low + i];
		}
		for (int j = 0; j < n2; j++) {
			right[j] = arrayToSort[mid + 1 + j];
		}

		/* Merge the temporary arrays */

		// Initial indexes of first and second sub arrays
		int i = 0, j = 0;

		// Initial index of merged sub array array
		int k = low;
		while (i < n1 && j < n2) {
			if (left[i] <= right[j]) {
				arrayToSort[k] = left[i];
				i++;
			} else {
				arrayToSort[k] = right[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of left[] if any */
		while (i < n1) {
			arrayToSort[k] = left[i];
			i++;
			k++;
		}

		/* Copy remaining elements of left[] if any */
		while (j < n2) {
			arrayToSort[k] = right[j];

			j++;
			k++;
		}
	}

}
