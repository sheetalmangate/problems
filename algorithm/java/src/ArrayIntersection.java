/*
* Problem : Given two integer arrays nums1 and nums2, return an array of their intersection
* Each element in the result must be unique and you may return the result in any order.
* Input: nums1 = [1,2,2,1], nums2 = [2,2]
* Output: [2]
*
*/
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

class ArrayIntersection {
	
	public static void main(String[] args ) {
	
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		
		int[] commonNums = intersection(nums1, nums2 );
		
		for(int num : commonNums ) {
			System.out.println(num);	
		}
		
	}
	
	public static int[] intersection(int[] nums1, int[] nums2) {
        
		int n = nums2.length;
		Set<Integer> resultSet = new HashSet<>();
		
		for( int i = 0; i< nums1.length; i++ ) {
			
			int j = 0;
			
			while( j<n ) {
				
				if(nums1[i] == nums2[j]) resultSet.add(nums1[i]);
				j++;
			}
			
		}
		
		int result[] = new int[resultSet.size()];
		int j = 0;
		for( int num : resultSet ) {
			result[j++] = num; 
		}
		
		return result;
		
    }
	
}