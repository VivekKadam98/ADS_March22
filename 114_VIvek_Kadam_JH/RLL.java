import java.util.*;
//QUESTION NO.2
//REVERSE A LINKED LIST


class RLL{
	static Node head;
static class Node{
      int data;
	  Node next;
	  Node(int a){
		  data = a;
		  next = null;
	  }
}

 static Node reverse(Node head){
	 Node prev = null;
	 Node curr = head;
	 Node next = null;
	 while(curr != null){
		 next = curr.next;
		 curr.next = prev;
		 prev = curr;
		 curr = next;
	 }
	     head = prev;
		 return head;
 }

  static void printList(Node head){
	  Node temp = head;
	  while(temp != null){
		  System.out.println(temp.data + " ");
		  temp = temp.next;
	  }
	  
  }
  public static void main(String args []){
	  
	  RLL obj = new RLL();
	  obj.head = new Node(1);
      obj.head.next = new Node(2);	
      obj.head.next.next = new Node(3);
      obj.head.next.next.next = new Node(4);
      obj.head.next.next.next.next = new Node(4);
      obj.head.next.next.next.next.next = new Node(5);
    	 
      System.out.println("The Linked List before reversing is: ");
      obj.printList(head);
      head = obj.reverse(head);
      System.out.println("After reversal, linked list is: ");
      obj.printList(head);	  
  }
}
