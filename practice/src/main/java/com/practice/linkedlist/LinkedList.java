package com.practice.linkedlist;

public class LinkedList {
	
	class Node{
		int data;
		Node nextNode;
		
		Node(int data ){
			this.data = data;
			nextNode = null;
		}
	}
	
	private Node head;
	
	
	//logic
	
	//current data that is aaded becon=mes the head
	private void addTohead(int data) {
		Node newNode = new Node(data); //new node -> will become head
		newNode.nextNode=head;
		head = newNode;	
	}
	//search for the head whose next node is null 
	//find it 
	//set new value 
	private void addToTail(int data) {	
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while(temp.nextNode!=null) {
			temp = temp.nextNode;
		}
		temp.nextNode = newNode;
	}
	
	
	private boolean  searchForValue(int data) {		
		Node temp = head;
		while(temp!=null) {
			if(temp.data==data) {
				return true;
			}
			temp = temp.nextNode;
			
		}
		return false;
	}
	
	private void print() {
		Node temp = head;
		while(null!=temp) {
			System.out.println(temp.data);
			temp = temp.nextNode;
		}
	}
	
	private void deleteFromHead() {	
		
		if(head==null) {
			return;
		}
		head = head.nextNode;
	}
	

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addToTail(10);
		ll.addTohead(20);
		ll.addTohead(300);
		System.out.println(ll.searchForValue(10));
		//ll.print();
	}
	
}
