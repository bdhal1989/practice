package com.practice.twothreesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Problem: 3Sum
 *
 * Given an integer array nums, return all unique triplets
 * [nums[i], nums[j], nums[k]] such that:
 *
 *      nums[i] + nums[j] + nums[k] == 0
 *
 * Conditions:
 * 1. i, j, and k must be different indices.
 * 2. The solution set must not contain duplicate triplets.
 *
 * Example 1:
 *
 * Input:
 * nums = {-1, 0, 1, 2, -1, -4}
 *
 * Output:
 * [[-1, -1, 2], [-1, 0, 1]]
 *
 * Explanation:
 *
 * Triplet 1:
 * -1 + -1 + 2 = 0
 *
 * Triplet 2:
 * -1 + 0 + 1 = 0
 *
 * No other unique triplets produce a sum of 0.
 *
 * ------------------------------------------------------
 *
 * Example 2:
 *
 * Input:
 * nums = {0, 1, 1}
 *
 * Output:
 * []
 *
 * Explanation:
 * No three numbers add up to 0.
 *
 * ------------------------------------------------------
 *
 * Example 3:
 *
 * Input:
 * nums = {0, 0, 0}
 *
 * Output:
 * [[0, 0, 0]]
 *
 * Explanation:
 * 0 + 0 + 0 = 0
 *
 * Even though there are multiple ways to pick these
 * indices, only one unique triplet should be returned.
 *
 * ------------------------------------------------------
 *
 * Approach:
 *
 * 1. Sort the array.
 * 2. Fix one element using a for loop.
 * 3. Use two pointers:
 *      left = i + 1
 *      right = n - 1
 * 4. Calculate:
 *
 *      sum = nums[i] + nums[left] + nums[right]
 *
 * 5. If sum < 0:
 *      left++
 *      (Need a larger sum)
 *
 * 6. If sum > 0:
 *      right--
 *      (Need a smaller sum)
 *
 * 7. If sum == 0:
 *      Store the triplet.
 *      Skip duplicates.
 *      Move both pointers.
 *
 * Time Complexity:
 * O(n^2)
 *
 * Space Complexity:
 * O(1)    (excluding output list)
 */

public class ThreeSumProblem {
	
	
	private List <List<Integer>>getThreeSum(int[] arr){
		List <List<Integer>> result = new ArrayList<>();
		//sort the array 
		Arrays.sort(arr);
		
		//a number should have atleast 2 numbers to compare
		for(int i=0;i<arr.length-2;i++) { 
			
			if(i>0&&arr[i]==arr[i-1]) {
				continue;
			}
			int left = i+1;
			int right = arr.length-1;
			
			while(left<right) {
				
				
				int sum = arr[left]+arr[right]+arr[i];
				if(sum<0)
					left++;
				else if(sum>0)
					right --;
				else {
					result.add(Arrays.asList(arr[i], arr[left], arr[right]));
					
					while(left<right && arr[left] == arr[left+1]) {
						left++;
					}
					
					while(left<right && arr[right] == arr[right-1]) {
						right --;
					}
					left++;
					right--;
				}
			}
		}
		
		return result;
	}
	public static void main(String[] args) {
		ThreeSumProblem t =new ThreeSumProblem();
		int[] arr = {-1, 0, 1, 2, -1, -4};
		List <List<Integer>> result = t.getThreeSum(arr);
		
		if(null!=result)
		System.out.println(result);
		
	}

}
