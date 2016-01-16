
public class ReverseDoublyLinkList {

	/*
	  Insert Node at the end of a linked list 
	  head pointer input could be NULL as well for empty list
	  Node is defined as 
	  class Node {
	     int data;
	     Node next;
	     Node prev;
	  }
	*/

	Node Reverse(Node head) {
	      Node temp=head;
	      while(temp.next!=null)
	          {
	          temp=temp.next;
	      }
	    head = temp;
	    
	    while(temp!=null)
	        {
	        Node temp2 = temp.next;
	        temp.next=temp.prev;
	        temp.prev=temp2;
	        temp=temp.next;
	    }
	    return head;
	}

}
