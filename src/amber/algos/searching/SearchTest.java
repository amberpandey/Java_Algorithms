/*
 * General Algorithms in Java
 *
 */
package amber.algos.searching;

import amber.algos.sorting.BubbleSort;
import amber.algos.sorting.InsertionSort;
import amber.algos.sorting.MergeSort;
import amber.algos.sorting.QuickSort;
import amber.algos.sorting.SelectionSort;

/**
 * @author Amber
 *
 */
public class SearchTest {
	public static void main(String args[]) {
		int[] unsortedArrayOfNumbers = { 1, 4, 6, 2, 9, 3, 7, 5 ,30,12,43,3,65,7};
		int[] sortedArrayOfNumbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(BinarySearch.binarySearch(sortedArrayOfNumbers, 5));
		System.out.println(LinearSearch.sortedLinearSearch(sortedArrayOfNumbers, 5));
		System.out.println(LinearSearch.unsortedLinearSearch(unsortedArrayOfNumbers, 5));

		printArray("Before Sort", unsortedArrayOfNumbers.clone());
		printArray("After Selection Sort", SelectionSort.doSelectionSort(unsortedArrayOfNumbers.clone()));
		printArray("After Bubble Sort", BubbleSort.doBubbleSort(unsortedArrayOfNumbers.clone()));
		printArray("After Insertion Sort", InsertionSort.doInsertionSort(unsortedArrayOfNumbers.clone()));
		printArray("After Quick Sort", QuickSort.doQuickSort(unsortedArrayOfNumbers.clone()));
		printArray("After Merge Sort", MergeSort.doMergeSort(unsortedArrayOfNumbers.clone()));
//		QuickSort qs = new QuickSort();
//		printArray("",qs.getSortedArray(unsortedArrayOfNumbers, 0, unsortedArrayOfNumbers.length-1));
		printArray("Before Sort", unsortedArrayOfNumbers.clone());
	}

	/**
	 * 
	 * @param message
	 * @param arrayOfNumber
	 */
	public static void printArray(String message, int[] arrayOfNumber) {
		System.out.print(message + " : ");
		for (Integer i : arrayOfNumber) {
			System.out.print(i+" ");
		}
		System.out.println("");
	}
}
