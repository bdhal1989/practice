package com.practice.stackds;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
	
	//Input:  [4, 5, 2, 10]
	//Output: [5, 10, 10, -1]
	
	
	//Explanation:
	//4 → next greater is 5
	//5 → next greater is 10
	//2 → next greater is 10
	//10 → no greater → -1
	
	
	//Start from rightmost element
	//While stack is not empty AND stack top ≤ current element → pop
	//If stack empty → result = -1
	//Else → result = stack.peek()
	//Push current element
	
	
	private int[] NextGreaterElement(int[] check) {
		int[] result =new  int[check.length];
		Stack<Integer> st = new Stack<Integer>();
		for(int i=check.length-1;i>=0;i--) {
			while(!st.isEmpty() && st.peek()<=check[i]) {
				st.pop();
			}
			if(st.isEmpty()) {
				result[i] = -1;
			}else {
				result[i] = st.peek();
			}
			
			st.push(check[i]);
		}
		return result;
	}
	
	public static void main(String[] args) {
		NextGreaterElement n = new NextGreaterElement();
		int[] arr = {4, 5, 2, 10};
		System.out.println(Arrays.toString(n.NextGreaterElement(arr)));
	}

}
