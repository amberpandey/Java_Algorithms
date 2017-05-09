/*
 * General Algorithms in Java
 * BucketSort.Java
 */
package amber.algos.sorting;

import java.util.Arrays;

import amber.algos.utils.MaxNMinNum;

/**
 * @author Amber
 *
 */
public class BucketSort {
	/**
	 * <p>
	 * <b>Bucket Sort :-</b></br>
	 * Bucket sort is mainly useful when input is uniformly distributed over a
	 * range. For example, consider the following problem. Sort a large set of
	 * floating point numbers which are in range from 0.0 to 1.0 and are
	 * uniformly distributed across the range. How do we sort the numbers
	 * efficiently?</br>
	 * </p>
	 * <p>
	 * <b>Steps :-</b></br>
	 * 1) Create n empty buckets (Or lists).</br>
	 * 2) Do following for every array element arrayToSort[i]. </br>
	 * ______a) Insert arr[i] into bucket[n*array[i]]</br>
	 * 3) Sort individual buckets using insertion sort.</br>
	 * 4) Concatenate all sorted buckets.</br>
	 * </p>
	 * </p>
	 * <p>
	 * <b>Complexities :-</b></br>
	 * <font color = "blue"> <b>Time Complexity :</b> </br>
	 * Worst Case : O(n^2) where max is the maximum elements in input
	 * array and</br>
	 * Best Case : O(n+k)</br>
	 * Average Case :O(n+k)</br>
	 * <b>Auxiliary space Complexity :</b></br>
	 * O(n+k) auxiliary
	 * </font>
	 * </p>
	 * 
	 * @param arrayToSort
	 *            list of numbers for sorting
	 * @return sorted list of numbers
	 */
	public static int[] doBucketSort(int[] arrayToSort) {
		int max = MaxNMinNum.getMaxNum(arrayToSort);
		int[] bucket = new int[max + 1];
		Arrays.fill(bucket, 0);

		for (int i = 0; i < arrayToSort.length; i++) {
			bucket[arrayToSort[i]]++;
		}

		int outPos = 0;
		for (int i = 0; i < bucket.length; i++) {
			for (int j = 0; j < bucket[i]; j++) {
				arrayToSort[outPos++] = i;
			}
		}
		return arrayToSort;
	}

}
