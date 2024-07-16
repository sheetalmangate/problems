/*
 * Given an array of integer nums and integer target.
 * Return the indices of two number whose addition is equal to target.
 * Input : [2,5,8,17] target = 10
 * Output : [0,2]
 * 
 * */

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main( String[] args ) {
	
		int[] nums = {-3,4,3,90};
		int target = 0;
		
		int[] arrIndices = twoSum(nums, target);
		System.out.print(Arrays.toString(arrIndices));
		
	
	}
	
	public static int[] twoSum( int[] nums, int target ) {
			
		int n = nums.length;
		int diff = 0;
		HashMap<Integer, Integer > numsMap = new HashMap<>();
		int[] indices = new int[2];

		
		for( int i = 0; i<n; i++ ) {
			
			diff =  target - nums[i];
		
			if( numsMap.containsKey(diff)) {
				
				indices[0] = numsMap.get(diff);
				indices[1] = i;
				break;
			}

			numsMap.put(nums[i], i );

		}

		return indices;
	}
}
