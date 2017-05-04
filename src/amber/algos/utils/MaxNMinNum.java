/*
 * General Algorithms in Java
 *
 */
package amber.algos.utils;

/**
 * @author Amber
 *
 */
public class MaxNMinNum {
	/**
	 * this method returns max number from the passed array of numbers
	 * @param arrayToSearch
	 * @return
	 */
	public static int getMaxNum(int[] arrayToSearch){
		int max = 0;
		for(int i=0; i<arrayToSearch.length;i++){
			if(arrayToSearch[i]>max){
				max=arrayToSearch[i];
			}
		}
		return max;
	}
	/**
	 * this method returns min number from the passed array of numbers
	 * @param arrayToSearch
	 * @return
	 */
	public static int getMinNum(int[] arrayToSearch){
		int min = 0;
		for(int i=0; i<arrayToSearch.length;i++){
			if(arrayToSearch[i]<min){
				min=arrayToSearch[i];
			}
		}
		return min;
	}

}
