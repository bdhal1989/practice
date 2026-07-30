package com.practice.twothreesum;


/*
 * ============================================================
 * Problem: Move Zeroes
 * ============================================================
 *
 * Given an integer array nums,
 * move all ZEROES to the END of the array.
 *
 * IMPORTANT:
 *
 * 1. Maintain the relative order of all NON-ZERO elements.
 * 2. Modify the existing array (in-place).
 * 3. Do not create another array.
 *
 * ============================================================
 * Example 1
 * ============================================================
 *
 * Input:
 *
 * nums = [0, 1, 0, 3, 12]
 *
 * Output:
 *
 * [1, 3, 12, 0, 0]
 *
 * Explanation:
 *
 * Non-zero elements:
 *
 * 1, 3, 12
 *
 * remain in the same order.
 *
 * All zeroes are moved to the end.
 *
 * ============================================================
 * Example 2
 * ============================================================
 *
 * Input:
 *
 * nums = [0]
 *
 * Output:
 *
 * [0]
 *
 * ============================================================
 * Key Understanding
 * ============================================================
 *
 * We are NOT moving positive numbers.
 *
 * We are moving NON-ZERO numbers.
 *
 * Therefore:
 *
 * 5   -> keep
 * -2  -> keep
 * 10  -> keep
 * 0   -> move to end
 *
 * Example:
 *
 * Input:
 * [-1, 0, 3]
 *
 * Output:
 * [-1, 3, 0]
 *
 * Notice:
 *
 * -1 is negative
 * but it is NOT zero,
 * so it remains with the other non-zero elements.
 *
 * ============================================================
 * Two Pointer Approach
 * ============================================================
 *
 * slow -> Next position where a non-zero
 *         element should be placed.
 *
 * fast -> Scans the entire array.
 *
 * Whenever:
 *
 * nums[fast] != 0
 *
 * Swap nums[slow] and nums[fast]
 *
 * Then:
 *
 * slow++
 *
 * ============================================================
 * Why nums[fast] != 0 ?
 * ============================================================
 *
 * We want ALL non-zero elements:
 *
 * Positive numbers ✅
 * Negative numbers ✅
 *
 * Only zeroes should move.
 *
 * Therefore:
 *
 * if(nums[fast] != 0)
 *
 * is correct.
 *
 * Using:
 *
 * if(nums[fast] > 0)
 *
 * would be WRONG because it ignores
 * negative numbers.
 *
 * ============================================================
 * Complexity
 * ============================================================
 *
 * Time Complexity:
 * O(n)
 *
 * Space Complexity:
 * O(1)
 *
 * ============================================================
 */
public class MoveZeros {
	


	private int[] moveZeros(int[] nums) {
		int slow = 0;
		int fast = 0;
		while(fast<nums.length) {
			if(nums[fast]!=0) {
				int swap = nums[slow];
				nums[slow] = nums[fast];
				nums[fast] = swap;
				slow++;
			}
			fast++;
		}

		return nums;
	}

	public static void main(String[] args) {
		MoveZeros t = new MoveZeros();
		int[] arr = { 7, 0, 5, 3, 6, 4 };
		
		arr = t.moveZeros(arr);
		
		if(null!=arr)
		for(int i = 0 ;i<arr.length;i++) {
			System.out.println(arr[i]);
			
		}

	}


}
