package com.practice.twothreesum;

import java.util.HashMap;
import java.util.Map;

/*
 * ============================================================
 * Problem: Two Sum
 * Pattern: HashMap (Unsorted Array)
 * Difficulty: Easy
 * ============================================================
 *
 * Given an array of integers nums and an integer target,
 * return the indices of the two numbers such that they add
 * up to target.
 *
 * Assumptions:
 * 1. Exactly one valid answer exists.
 * 2. You may not use the same element twice.
 * 3. Return the indices of the two numbers.
 *
 * Example 1:
 * Input:
 * nums = [2, 7, 11, 15]
 * target = 9
 *
 * Output:
 * [0, 1]
 *
 * Explanation:
 * nums[0] + nums[1] = 2 + 7 = 9
 *
 * ------------------------------------------------------------
 *
 * Example 2:
 * Input:
 * nums = [3, 2, 4]
 * target = 6
 *
 * Output:
 * [1, 2]
 *
 * Explanation:
 * nums[1] + nums[2] = 2 + 4 = 6
 *
 * ------------------------------------------------------------
 *
 * Example 3:
 * Input:
 * nums = [3, 3]
 * target = 6
 *
 * Output:
 * [0, 1]
 *
 * ============================================================
 * Interview Hints:
 * ============================================================
 *
 * For every number:
 *
 * complement = target - currentNumber
 *
 * Ask:
 * "Have I already seen this complement?"
 *
 * If YES:
 *     Return both indices.
 *
 * If NO:
 *     Store current number and its index.
 *
 * ============================================================
 * Expected Time Complexity:
 * O(n)
 *
 * Expected Space Complexity:
 * O(n)
 * ============================================================
 */
public class TwoSumUnsortedArray {
	
	private int[] getTwoSum(int[] nums, int target) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i = 0 ;i<nums.length;i++) {
			int complement = target-nums[i];
			if(map.containsKey(complement)) {
				 return new int[] { map.get(complement), i };
			}else {
				map.put(nums[i], i);
				
			}
			
		}
		
		return null;
	}
	
	
	public static void main(String[] args) {
		TwoSumUnsortedArray t =new TwoSumUnsortedArray();
		int[] arr = {2, 7, 11, 15};
		arr = t.getTwoSum(arr,9);
		
		if(null!=arr)
		for(int i = 0 ;i<arr.length;i++) {
			System.out.println(arr[i]);
			
		}
		
	}

}
