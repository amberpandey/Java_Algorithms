/*
 * General Algorithms in Java
 * SelectionSort.java
 */
package amber.algos.sorting;

/**
 * @author Amber
 * @category
 * Implementation of selection sort
 * 
 */
public class SelectionSort {
	/**
	 * <p>
	 * <b>Selection Sort :-</b></br>
	 * The selection sort algorithm sorts an array by repeatedly selecting the minimum element (considering ascending order) 
	 * from unsorted part and putting it at the beginning.
	 * </p>
	 * <p> 
	 * <b>Steps :-</b></br>
	 * 		The algorithm maintains two sub arrays in a given array.</br>
	 * 			1) The sub array which is already sorted.</br>
	 *			2) Remaining sub array which is unsorted.</br>
	 * 		In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted sub array is picked 
	 * 		and moved to the sorted sub array.
	 * </p>
	 * </p>
	 * <p>
	 * <b>Complexities :-</b></br>
	 * <font color = "blue"> 
	 * <b>Time Complexity :</b> O(n^2)</br>
	 * <b>Space Complexity :</b> O(1)</br>
	 * </font>
	 * </p>
	 * @param arrayToSort list of numbers for sorting
	 * @return sorted list of numbers
	 */
	public static int[] doSelectionSort(int[] arrayToSort){
		
		for(int i=0; i<arrayToSort.length; i++){
			int minIndex=i;
			for(int j=i+1;j<arrayToSort.length;j++){
				if(arrayToSort[minIndex]>arrayToSort[j]){
					minIndex = j;
				}
			}
			int tempMinNumber = arrayToSort[minIndex];
			arrayToSort[minIndex] = arrayToSort[i];
			arrayToSort[i] = tempMinNumber;
										
		}
		
		return arrayToSort;
	}

}
