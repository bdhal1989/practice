package com.practice.stackds;

public class StackPracticeWithMinStack {

	private int[] arr;
	private int top;
	private int capacity;
	private int minarr[];
	private int minTop ;

	StackPracticeWithMinStack(int size) {
		this.arr = new int[size];
		capacity = size;
		this.minarr = new int[size];
		top = -1;
		minTop= -1;
	}

	private void push(int data) {
		if (top == capacity - 1) {
			System.out.println("Stsck is full");
			return;
		}
		arr[++top] = data;
		if(minTop==-1 || data<=minarr[minTop]) {
			minarr[++minTop] = data;
		}
	}

	private int pop() {
		if (top == -1) {
			System.out.println("Stack has no data");
			return -1;
		}
		int removed = arr[top--];
		
		if(removed==minarr[minTop]) {
			minTop--;
		}
		
		return removed;
	}

	private int peek() {
		if (top == -1) {
			System.out.println("Stack has no data");
			return -1;
		}
		return arr[top];
	}

	// Check if empty
	public boolean isEmpty() {
		return top == -1;
	}

	// Get size
	public int size() {
		return top + 1;
	}

}
