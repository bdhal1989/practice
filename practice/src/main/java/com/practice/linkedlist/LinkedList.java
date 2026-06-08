package com.practice.linkedlist;

public class LinkedList {

	class Node {
		int data;
		Node nextNode;

		Node(int data) {
			this.data = data;
			nextNode = null;
		}
	}

	private Node head;

	// logic

	// current data that is aaded becon=mes the head
	private void addTohead(int data) {
		Node newNode = new Node(data); // new node -> will become head
		newNode.nextNode = head;
		head = newNode;
	}

	// search for the head whose next node is null
	// find it
	// set new value
	private void addToTail(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while (temp.nextNode != null) {
			temp = temp.nextNode;
		}
		temp.nextNode = newNode;
	}

	private boolean searchForValue(int data) {
		Node temp = head;
		while (temp != null) {
			if (temp.data == data) {
				return true;
			}
			temp = temp.nextNode;

		}
		return false;
	}

	private void print() {
		Node temp = head;
		while (null != temp) {
			System.out.println(temp.data);
			temp = temp.nextNode;
		}
	}

	private void deleteFromHead() {

		if (head == null) {
			return;
		}
		head = head.nextNode;
	}

	private void deleteFromTail() {
		// empty
		if (head == null) {
			return;
		}
		// one node
		if (head.nextNode == null) {
			head = null;
			return;
		}
		Node temp = head;
		// moving to second last node
		while (temp.nextNode.nextNode != null) {
			temp = temp.nextNode;
		}
		// setting the second last next node to null
		temp.nextNode = null;
	}

	// Floyd’s Cycle Detection (Tortoise & Hare)
	private boolean  detectCycleInLL() {
		Node slow = head;
		Node fast = head;

		while (fast != null && fast.nextNode != null) {
			slow = slow.nextNode;
			fast = fast.nextNode.nextNode;
			if (slow == fast) {
				return true;
			}

		}
		return false;
	}

	public void createCycle() {
		if (head == null || head.nextNode == null)
			return;

		Node temp = head;
		Node second = head.nextNode;

		while (temp.nextNode != null) {
			temp = temp.nextNode;
		}

		temp.nextNode = second; // creating cycle
	}
	
	//detect the cycle using floyds
	//chekc if cycle exists
	//set the slow to head
	//loop until fast meets slow
	public Node startOfTheCycle() {
		
		Node slow = head;
		Node fast = head;
		
		while(fast!=null && fast.nextNode!=null) {
			slow = slow.nextNode;
			fast = fast.nextNode.nextNode;
			
			if(slow==fast) {
				//detected cycle
				break;
			}
		}
		//chekc if cycle exists
		if(fast==null || fast.nextNode==null) {
			return null;
		}
		slow = head;
		//loop until fast meets slow
		while(slow!= fast ){
			slow= slow.nextNode;
			fast= fast.nextNode;		
		}
		
		return slow;
	}

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		//ll.addToTail(10);
		ll.addTohead(20);
		ll.addTohead(300);
		ll.addTohead(50);
		ll.createCycle();
		System.out.println(null!=ll.startOfTheCycle()?ll.startOfTheCycle().data:null);
	//	System.out.println(ll.searchForValue(10));
		// ll.print();
	}

}
