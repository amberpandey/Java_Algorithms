/*
 * General Algorithms in Java
 * ContingSort.java
 */
package amber.algos.sorting;

import java.util.Arrays;

/**
 * @author Amber Implementation of counting sort.
 */
public class CountingSort {
	/**
	 * <p>
	 * <b>Counting Sort :-</b></br>
	 * Counting sort is a sorting technique based on keys between a specific
	 * range. It works by counting the number of objects having distinct key
	 * values (kind of hashing). Then doing some arithmetic to calculate the
	 * position of each object in the output sequence.</br>
	 * </p>
	 * <p>
	 * <b>Steps :-</b></br>
	 * 1) Take a count array to store the count of each unique object.</br>
	 * 2) Modify the count array such that each element at each index stores the
	 * sum of previous counts. </br>
	 * 3) Output each object from the input sequence followed by decreasing its
	 * count by 1.</br>
	 * </p>
	 * </p>
	 * <p>
	 * <b>Complexities :-</b></br>
	 * <font color = "blue"> <b>Time Complexity :</b> </br>
	 * Worst Case : O(n+k) where n is the number of elements in input array and
	 * k is the range of input.</br>
	 * Best Case : O(n+k)</br>
	 * Average Case : O(n+k)</br>
	 * <b>Space Complexity :</b> O(n+k)</br>
	 * </font>
	 * </p>
	 * 
	 * @param arrayToSort
	 *            list of numbers for sorting
	 * @return sorted list of numbers
	 */
	public static int[] doCountSort(int[] arrayToSort) {
		int length = arrayToSort.length;
		int assumedRange = 100;
		int countArray[] = new int[assumedRange];
		int outputArray[] = new int[length];
		for (int j = 0; j < length; j++) {
			countArray[arrayToSort[j]]++;
		}
		for (int i = 1; i < assumedRange; i++) {
			countArray[i] = countArray[i] + countArray[i - 1];
		}
		for (int i = 0; i < length; ++i) {
			outputArray[countArray[arrayToSort[i]] - 1] = arrayToSort[i];
			--countArray[arrayToSort[i]];
		}

		return outputArray;
	}

	/**
	 * 
	 * @param arrayToSort
	 * @param exp
	 * @return
	 */
	public static int[] doCountSortForRadixSort(int[] arrayToSort, int exp) {
		int length = arrayToSort.length;
		int assumedRange = 100;
		int countArray[] = new int[assumedRange];
		int outputArray[] = new int[length];
		Arrays.fill(countArray, 0);

		for (int i = 0; i < length; i++) {
			countArray[(arrayToSort[i] / exp) % 10]++;
		}
		for (int j = 1; j < assumedRange; j++) {
			countArray[j] =countArray[j] + countArray[j - 1];
		}
		for (int j = length-1; j >= 0; j--) {
			outputArray[countArray[(arrayToSort[j]/exp)%10] - 1] = arrayToSort[j];
			--countArray[(arrayToSort[j]/exp)%10];
		}
		return outputArray;
	}

}
