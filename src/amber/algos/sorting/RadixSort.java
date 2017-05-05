/*
 * General Algorithms in Java
 * RadixSort.java
 */
package amber.algos.sorting;

import amber.algos.utils.MaxNMinNum;

/**
 * <p>
 * <b>Radix Sort :-</b></br>
 *  Radix Sort is a non-comparative integer sorting algorithm that sorts data with integer keys by 
 *  grouping keys by the individual digits which share the same significant position and value. 
 *  A positional notation is required, but because integers can represent strings of characters (e.g., names or dates) 
 *  and specially formatted floating point numbers, We will be using Count sort for sorting numbers on each place.</br>
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
 * Worst Case : O((n+b)*log(max))  where max is the maximum elements in input array and</br>
 * Best Case : O((n+b)*log(max))</br>
 * Average Case : O((n+b)*log(max))</br>
 * </font>
 * </p>
 * 
 * @param arrayToSort
 *            list of numbers for sorting
 * @return sorted list of numbers
 */
public class RadixSort {
	public static int[] doRadixSort(int[] arrayToSort){
		int max = MaxNMinNum.getMaxNum(arrayToSort);
		for(int exp=1;max/exp>1;exp*=10){
			arrayToSort=CountingSort.doCountSortForRadixSort(arrayToSort, exp);
		}
		return arrayToSort;
	}
}
