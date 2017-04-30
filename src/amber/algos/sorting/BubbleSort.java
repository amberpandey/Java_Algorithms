/*
 * General Algorithms in Java
 * BubbleSort.java
 */
package amber.algos.sorting;

/**
 * @author Amber
 *
 */
public class BubbleSort {
	/**
	 * <p>
	 * <b>Bubble Sort :-</b></br>
	 * Bubble Sort is the simplest sorting algorithm that works by repeatedly
	 * swapping the adjacent elements if they are in wrong order.
	 * </p>
	 * <p>
	 * <b> Steps:-</b></br>
	 * 1. compare adjacent number.</br>
	 * 2. replace number if in wrong order.</br>
	 * 3. repeat for n-1 iteration.</br>
	 * 4. break if numbers are already sorted to optimize the algo.</br>
	 * </p>
	 * <p>
	 * <b>Complexities :-</b></br>
	 * <font color = "blue"> <b>Worst and Average Case Time Complexity :</b>
	 * O(n*n). Worst case occurs when array is reverse sorted.</br>
	 * <b>Best Case Time Complexity : </b> O(n). Best case occurs when array is
	 * already sorted.</br>
	 * <b>Auxiliary Space : </b> O(1)</br>
	 * <b>Boundary Cases : </b>Bubble sort takes minimum time (Order of n) when
	 * elements are already sorted.</br>
	 * <b>Sorting In Place : </b>Yes</br>
	 * <b>Stable :</b> Yes </font>
	 * </p>
	 * 
	 * @param arrayToSort
	 *            list of numbers for sorting
	 * @return sorted list of numbers
	 */
	public static int[] doBubbleSort(int[] arrayToSort) {
		for (int i = 0; i < arrayToSort.length; i++) {
			boolean swapped = false;
			//Second loop starting from second element of list
			for (int j = i + 1; j < arrayToSort.length; j++) {
				//compare adjacent numbers
				if (arrayToSort[j] < arrayToSort[i]) {
					//Swap if right side is smaller
					int tempMinNum = arrayToSort[j];
					arrayToSort[j] = arrayToSort[i];
					arrayToSort[i] = tempMinNum;
					//setting swap flag to true even if one number get swapped
					swapped = true;
				}
			}
			//if no number is swapped in full iteration list is already swap break now
			if (!swapped)
				break;
		}
		return arrayToSort;
	}

}
