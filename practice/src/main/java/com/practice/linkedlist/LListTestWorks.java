package com.practice.linkedlist;

public class LListTestWorks {

	Node head;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	private void addToHead(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	private void addToTail(int data) {

		if (null == head) {
			head = new Node(data);
			return;
		}

		Node newNode = new Node(data);
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	private void print() {
		Node temp = head;
		while (temp!= null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		
	}
	
	private void deleteFromTail() {
		Node temp = head;
		if(head==null) {
			return;
		}
		//for one element
		if(head.next==null) {
			head=null;
			return;
		}
		//reach to second last node
		while (temp.next.next!= null) {
			temp = temp.next;
		}
		//set second last node to null
		temp.next =null; 
		
	}
	
	private void deleteFromHead() {
		if(head==null) {
			return;
		}
		head = head.next;
			
	}
}
