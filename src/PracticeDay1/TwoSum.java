package PracticeDay1;

/**
 * @author: chaudharimehul
 * @date:	Jul 8, 2017
 * 
 * LeetCode challenge.
 * Please visit https://leetcode.com for more challenges
 * Given an array, find two index where sum of value at that index is same as target
 * [1,2,4,5,23,45,76] - target = 68
 * return value: [4,5]
 */
public class TwoSum {

	int[] getIndices(int[] arr, int target){
		int[] indices = new int[2];
		
		for(int i = 0 ; i < arr.length ; i++){
			for(int j = i ; j < arr.length ; j++){
				
				if((arr[i]+arr[j]) == target){
					indices[0] = i;
					indices[1] = j;
				}
			}
		}
		
		return indices;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,4,5,23,45,76};
		int target = 68;
		TwoSum twoSum = new TwoSum();
		
		int[] indices = twoSum.getIndices(arr,target);
		
		System.out.printf("[ arr[%d], arr[%d] ] - [ %d, %d ] - Target %d \n",indices[0], indices[1], arr[indices[0]], arr[indices[1]], target );
	}

}
