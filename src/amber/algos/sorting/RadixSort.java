/*
 * General Algorithms in Java
 *
 */
package amber.algos.sorting;

import amber.algos.utils.MaxNMinNum;

/**
 * @author Amber
 *
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
