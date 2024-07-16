/*
 * Remove Duplicate From Sorted Array
 * -- Given an array of integer in non-decreasing order
 * -- Return the count of unique elements from array
 * -- Modify the array in place in such a way that all unique elements are 
 * appears in relative order.
 * -- input : [1,1,2]
 * -- output : [1,2,_] return 2
 * -- input : [0,0,1,2,3,3,8,8,9] 
 * -- output : [0,1,2,3,8,9,_,_,_] return 6
 * 
 * */

import java.util.Arrays;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		int[] nums = new int[] {0,0,1,1,1,2,2,3,3,4};
		
		Arrays.sort(nums);
		
		int result = removeDuplicates( nums );
		
		System.out.println("unique element count is "+result);
	}
	
	
	public static int removeDuplicates(int[] nums ) {
		
		//use two pointer technique
		
		int n = nums.length;
		int k = 0;
		for( int i = 1; i<n; i++ ) {
			
			
			if( nums[k] < nums[i] ) {
				
				k++;
				nums[k] = nums[i];
			}
		}
		
		System.out.println( Arrays.toString(nums));
		return k+1;
	}
}
