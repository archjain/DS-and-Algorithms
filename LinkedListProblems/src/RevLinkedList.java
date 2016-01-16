public class RevLinkedList {
	/*
	 * Reverse a linked list and return pointer to the head The input list will
	 * have at least one element Node is defined as class Node { int data; Node
	 * next; }
	 */

	Node Reverse(Node head) {

		Node p = head;
		if (head == null) {
			return null;
		}
		if (p.next == null)
			return head;
		Node q = p.next;
		Node r = q.next;
		p.next = null;
		while (r != null) {
			q.next = p;
			p = q;
			q = r;
			r = r.next;

		}
		q.next = p;
		head = q;
		return head;
	}

}
