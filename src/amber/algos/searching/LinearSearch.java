/*
 * General Algorithms in Java
 *
 */
package amber.algos.searching;

/**
 * @author Amber
 *         <p>
 *         Unsorted Linear Search and Sorted/Ordered Linear Search.
 */
public class LinearSearch {
	/**
	 * <p>
	 * <b>Linear Search on unsorted Array of numbers</b></br>
	 * </p>
	 * <p>
	 * <b>Points :- </b></br>
	 * Linear search is a very simple search algorithm. </br>
	 * In this type of search, a sequential search is made over all items one by
	 * one. </br>
	 * Every item is checked and if a match is found then that particular item
	 * is returned,</br>
	 * otherwise the search continues till the end of the data collection.</br>
	 * </p>
	 * <p>
	 * <b>Complexities:- </b></br>
	 * <font color = "blue"> <b>1. Time Complexity of linear search in worst
	 * case : </b> O(n). </br>
	 * <b> 2. Space Complexity :- </b> O(1) </br>
	 * </font>
	 * </p>
	 * 
	 * @param arrayOfNumbers
	 *            Target list of numbers where we want to search particular
	 *            number
	 * @param noToSearch
	 *            number we are looking to search in given list.
	 * @return -1 if search failure else index of number in array.
	 */
	public static int unsortedLinearSearch(int arrayOfNumbers[], int noToSearch) {
		for (int i = 0; i <= arrayOfNumbers.length; i++) {
			if (noToSearch == arrayOfNumbers[i]) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * <b>Linear Search on sorted Array of numbers</b></br>
	 * search fails as soon as any number becomes greater than the number to be
	 * search in array.
	 * <p>
	 * <b>Points :- </b></br>
	 * Linear search is a very simple search algorithm. </br>
	 * In this type of search, a sequential search is made over all items one by
	 * one. </br>
	 * Every item is checked and if a match is found then that particular item
	 * is returned,</br>
	 * otherwise the search continues till the end of the data collection.</br>
	 * </p>
	 * <p>
	 * <b>Complexities:- </b></br>
	 * <font color = "blue"> <b>1. Time Complexity of linear search in worst
	 * case : </b> O(n). </br>
	 * <b> 2. Space Complexity :- </b> O(1) </br>
	 * </font>
	 * </p>
	 * 
	 * @param arrayOfNumbers
	 *            Target list of numbers where we want to search particular
	 *            number
	 * @param noToSearch
	 *            number we are looking to search in given list.
	 * @return -1 if search failure else index of number in array.
	 */
	public static int sortedLinearSearch(int arrayOfNumbers[], int noToSearch) {
		for (int i = 0; i <= arrayOfNumbers.length; i++) {
			if (noToSearch == arrayOfNumbers[i]) {
				return i;
			} else if (arrayOfNumbers[i] > noToSearch) {
				return -1;
			}
		}
		return -1;
	}
}
