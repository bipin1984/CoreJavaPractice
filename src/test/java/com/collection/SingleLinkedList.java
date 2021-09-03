package com.collection;

public class SingleLinkedList {

	public static void main(String[] args) {

		NodeClass myLinkedList = new NodeClass();
		myLinkedList.insertFirst(10);
		myLinkedList.insertFirst(11);
		myLinkedList.insertFirst(12);
		myLinkedList.insertFirst(13);
		myLinkedList.insertFirst(4);
		myLinkedList.insertFirst(5);
		
		Node node = new Node();
		node.data = 13;
		//myLinkedList.deleteAfter(node);
		myLinkedList.deleteFirst();
		myLinkedList.printLinkedList();
	}

}
