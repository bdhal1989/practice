package com.practice.twothreesum;

import java.util.ArrayList;

/*
 * ============================================================
 * Problem: Two Sum II - Input Array Is Sorted
 * Pattern: Two Pointers
 * Difficulty: Medium
 * ============================================================
 *
 * Given a 1-indexed array of integers numbers that is already
 * sorted in non-decreasing order, find two numbers such that
 * they add up to a specific target number.
 *
 * Return the indices (1-based) of the two numbers.
 *
 * You may assume that there is exactly one solution.
 *
 * You may not use the same element twice.
 *
 * ------------------------------------------------------------
 *
 * Example 1:
 *
 * Input:
 * numbers = [2,7,11,15]
 * target = 9
 *
 * Output:
 * [1,2]
 *
 * Explanation:
 * 2 + 7 = 9
 *
 * ------------------------------------------------------------
 *
 * Example 2:
 *
 * Input:
 * numbers = [2,3,4]
 * target = 6
 *
 * Output:
 * [1,3]
 *
 * Explanation:
 * 2 + 4 = 6
 *
 * ------------------------------------------------------------
 *
 * Example 3:
 *
 * Input:
 * numbers = [-1,0]
 * target = -1
 *
 * Output:
 * [1,2]
 *
 * ============================================================
 * Interview Hints:
 * ============================================================
 *
 * Since the array is already sorted:
 *
 * left = 0
 * right = numbers.length - 1
 *
 * Calculate:
 *
 * sum = numbers[left] + numbers[right]
 *
 * If sum == target:
 *     Answer found
 *
 * If sum < target:
 *     Move left pointer
 *
 * If sum > target:
 *     Move right pointer
 *
 * ============================================================
 * Expected Time Complexity:
 * O(n)
 *
 * Expected Space Complexity:
 * O(1)
 * ============================================================
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSumSortedArray {
	
	private int[] getTwoSum(int[] nums, int target) {
		int left = 0;
		int right= nums.length-1;
		while(left<right)
		{
			if(nums[left]+nums[left]==target)
				return new int[] {left,right};
			
			else if(nums[left]+nums[right]>target)
				right--;
			else
				left++;
		}
		
		return null;
	}
	
	
	public static void main(String[] args) {
		TwoSumSortedArray t =new TwoSumSortedArray();
		//List<String> s = new ArrayList<>(Arrays.asList("SS"));
		
		int[] arr = {2, 7, 11, 15};
		arr = t.getTwoSum(arr,9);
		
		if(null!=arr)
		for(int i = 0 ;i<arr.length;i++) {
			System.out.println(arr[i]);
			
		}
		
	}

}
