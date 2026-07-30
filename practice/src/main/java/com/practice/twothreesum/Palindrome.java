package com.practice.twothreesum;


/*
 * ============================================================
 * Problem: Valid Palindrome
 * Pattern: Two Pointers (Opposite Direction)
 * Difficulty: Easy
 * LeetCode: 125
 * ============================================================
 *
 * Problem Statement
 * ============================================================
 *
 * Given a string s, return true if it is a palindrome,
 * otherwise return false.
 *
 * While checking for palindrome:
 *
 * 1. Ignore uppercase and lowercase differences.
 * 2. Ignore spaces.
 * 3. Ignore special characters.
 * 4. Consider only letters and digits.
 *
 * ============================================================
 * Examples
 * ============================================================
 *
 * Example 1:
 *
 * Input:
 * s = "A man, a plan, a canal: Panama"
 *
 * Output:
 * true
 *
 * Explanation:
 *
 * After removing non-alphanumeric characters
 * and converting to lowercase:
 *
 * "amanaplanacanalpanama"
 *
 * This reads the same forward and backward.
 *
 * ------------------------------------------------------------
 *
 * Example 2:
 *
 * Input:
 * s = "race a car"
 *
 * Output:
 * false
 *
 * Explanation:
 *
 * Processed string:
 *
 * "raceacar"
 *
 * Forward  : raceacar
 * Backward : racaecar
 *
 * Not equal.
 *
 * ------------------------------------------------------------
 *
 * Example 3:
 *
 * Input:
 * s = " "
 *
 * Output:
 * true
 *
 * Explanation:
 *
 * After removing spaces:
 *
 * ""
 *
 * Empty string is considered a palindrome.
 *
 * ============================================================
 * Understanding the Pattern
 * ============================================================
 *
 * Use two pointers.
 *
 * left  -> Start of string
 * right -> End of string
 *
 * Example:
 *
 * String:
 *
 * "madam"
 *
 *      left       right
 *        |           |
 *        v           v
 *        m a d a m
 *
 * Compare:
 *
 * m == m
 *
 * Move both pointers
 *
 * a == a
 *
 * Move both pointers
 *
 * Pointers meet.
 *
 * Palindrome found.
 *
 * ============================================================
 * Key Observation
 * ============================================================
 *
 * We only care about:
 *
 * - Letters (A-Z, a-z)
 * - Digits (0-9)
 *
 * Ignore:
 *
 * - Spaces
 * - Commas
 * - Colons
 * - Special characters
 * - Punctuation marks
 *
 * Examples:
 *
 * ' '
 * ','
 * ':'
 * '@'
 * '#'
 * '!'
 *
 * ============================================================
 * Algorithm
 * ============================================================
 *
 * Step 1:
 *
 * Initialize:
 *
 * left = 0
 * right = s.length() - 1
 *
 * ------------------------------------------------------------
 *
 * Step 2:
 *
 * While left < right
 *
 * ------------------------------------------------------------
 *
 * Step 3:
 *
 * Skip invalid characters from the left side.
 *
 * Example:
 *
 * "a,b"
 *
 * If left points to ','
 *
 * Move left forward.
 *
 * ------------------------------------------------------------
 *
 * Step 4:
 *
 * Skip invalid characters from the right side.
 *
 * Example:
 *
 * "a:b"
 *
 * If right points to ':'
 *
 * Move right backward.
 *
 * ------------------------------------------------------------
 *
 * Step 5:
 *
 * Convert both characters to lowercase.
 *
 * Example:
 *
 * 'A'
 * 'a'
 *
 * should be considered equal.
 *
 * ------------------------------------------------------------
 *
 * Step 6:
 *
 * Compare characters.
 *
 * If not equal:
 *
 * return false
 *
 * ------------------------------------------------------------
 *
 * Step 7:
 *
 * Move both pointers.
 *
 * left++
 * right--
 *
 * Continue checking.
 *
 * ------------------------------------------------------------
 *
 * Step 8:
 *
 * If loop completes successfully:
 *
 * return true
 *
 * ============================================================
 * Dry Run
 * ============================================================
 *
 * Input:
 *
 * "A man, a plan, a canal: Panama"
 *
 * ------------------------------------------------------------
 *
 * Compare:
 *
 * A and a
 *
 * Convert to lowercase:
 *
 * a == a
 *
 * Move pointers.
 *
 * ------------------------------------------------------------
 *
 * Skip spaces and punctuation.
 *
 * Compare:
 *
 * m and m
 *
 * Match.
 *
 * Move pointers.
 *
 * ------------------------------------------------------------
 *
 * Compare:
 *
 * a and a
 *
 * Match.
 *
 * Continue until pointers cross.
 *
 * ------------------------------------------------------------
 *
 * Result:
 *
 * true
 *
 * ============================================================
 * Why Two Pointers?
 * ============================================================
 *
 * A palindrome compares:
 *
 * First character   <-> Last character
 * Second character  <-> Second Last character
 * Third character   <-> Third Last character
 *
 * Therefore, checking from both ends is natural.
 *
 * No need to reverse the string.
 *
 * ============================================================
 * Complexity Analysis
 * ============================================================
 *
 * Time Complexity:
 *
 * O(n)
 *
 * Each character is processed at most once.
 *
 * ------------------------------------------------------------
 *
 * Space Complexity:
 *
 * O(1)
 *
 * No extra data structures required.
 *
 * ============================================================
 * Interview Learning
 * ============================================================
 *
 * Clues that suggest Two Pointers:
 *
 * - Palindrome checking
 * - Compare both ends
 * - Reverse string problems
 * - Sorted array pair problems
 *
 * Pattern:
 *
 * left  -----------------> <----------------- right
 *
 * Compare
 * Move
 * Repeat
 *
 * ============================================================
 */

public class Palindrome {

	
	private boolean palindrome(String sentance) {
		char[] chars = sentance.toCharArray();
		int left = 0;
		int right = chars.length-1;
		while(left<right) {
			
			while(left<right && !Character.isLetterOrDigit(chars[right]) ) {
				right--;
			}
			while(left<right && !Character.isLetterOrDigit(chars[left]) ) {
				left++;
			}
			if(Character.toLowerCase(chars[right])!=Character.toLowerCase(chars[left]))
			{
				return false;
			}
			right--;
			left++;
			
		}
		return true;
	}

	public static void main(String[] args) {
		Palindrome t = new Palindrome();
		
		boolean isPalindrom = t.palindrome("...Malayalam???");

		System.out.println(isPalindrom);

	}
}
