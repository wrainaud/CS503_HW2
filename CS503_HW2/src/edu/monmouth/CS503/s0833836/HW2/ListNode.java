package edu.monmouth.CS503.s0833836.HW2;

import edu.monmouth.CS503.s0833836.Book.Book;

public class ListNode {

  private Node head;

  public ListNode() {
    head = null;
  }//ListNode
  
  public Node removeFirst() {
	  Node firstNode = head;
	  head = head.next;
	  return firstNode;
  }//removeFirst
  
  
  public Node first() {
		return head;
  }//first
  
  public Node last() {
	  if (head != null) {
			return head;
		}//if
	return null;
  }

  public void insert(Book book) {
    Node newNode = new Node(book);
    newNode.setNext(head);
    head = newNode;
  }//insert

  public void insertEnd(Book book) {
	  Node newNode = new Node(book);
	  if(head == null) {
		  head = newNode;
	  }//if
	  Node last = head;
	  while(last.next != null) {
		  last = last.next;
	  }//while
	  last.next = newNode;
}//insertEnd

 public boolean isEmpty() { 
	if (head == null) {
		return false;
	}//if
	else {
		return true;    
	}//else
  }//isEmpty
  
  public int size() {
    if(head != null) {
    	return 1;
    }
    return 0;
  }//size
    
  public void clear() {
    head = null;
  }//clear

@Override
  public String toString() {
	StringBuilder logString = new StringBuilder();
    Node node;
    node = head;
    int count = 0;
    
    while (node != null) {
      count++;
      logString.append(count + " . " + node.getInfo() + "\n");
      node = node.getNext();
    }
    return logString.toString();
  }
}
