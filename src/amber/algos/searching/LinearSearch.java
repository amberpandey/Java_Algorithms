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
	 * Linear Search on unsorted Array of numbers
	 * <p>
	 * Linear search is a very simple search algorithm. 
	 * In this type of search, a sequential search is made over all items one by one. 
	 * Every item is checked and if a match is found then that particular item is returned, 
	 * otherwise the search continues till the end of the data collection.
	 * </p>
	 * <p>
	 * Complexities:-
	 *     1. Time Complexity of linear search in worst case will be O(n). 
     *     2. Space Complexity :- O(1)
     * </p>
	 * @param arrayOfNumbers Target list of numbers where we want to search particular number
	 * @param noToSearch number we are looking to search in given list.
	 * @return
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
	 * Linear Search on sorted Array of numbers
	 * search fails as soon as any number becomes greater than the number to besearch in array.
	 * <p>
	 * Linear search is a very simple search algorithm. 
	 * In this type of search, a sequential search is made over all items one by one. 
	 * Every item is checked and if a match is found then that particular item is returned, 
	 * otherwise the search continues till the end of the data collection.
	 * </p>
	 * <p>
	 * Complexities:-
	 *     1. Time Complexity of linear search in worst case will be O(n). 
     *     2. Space Complexity :- O(1)
     * </p>
	 * @param arrayOfNumbers Target list of numbers where we want to search particular number
	 * @param noToSearch number we are looking to search in given list.
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
