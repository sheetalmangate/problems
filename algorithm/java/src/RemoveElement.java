/*
 * Remove given element From array
 * -- given an array of integer `nums` and an integer `val`.
 * -- remove all occurrence of val in nums in-place.
 * -- return the count of elements k in `nums` which are not equal to val 
 * -- modify the nums in such a way that first k elements are not equal to k   
 * -- Input: [1,2,2,1] val =1
 * -- Output : [2,3,_,_] return 2
 * -- Input: [0,1,2,2,3,0,4,2] val = 2
 * -- Output : [0,1,3,0,4,_,_,_] 
 * */
//https://leetcode.com/articles/two-pointer-technique/

import java.util.Arrays;

public class RemoveElement {

	public static void main( String[] args ) {
		
		int[] nums = {0,1,2,2,3,0,4,2};
		int val = 2;
		int count = removeElement(nums, val);
		System.out.println( " Count of element not equal to value "+val+" is : "+count);
	}
	
	public static int removeElement( int[] nums, int val) {
	
		
		int n = nums.length;
		int k = 0;
		int temp = 0;
		
		for( int i =0; i<n; i++ ) {
		
			if(nums[i] != val ) {
				
				temp = nums[k];
				nums[k] = nums[i];
				nums[i] = temp;
				k++;
			}
		}
		
		return k;
		
	}
}
