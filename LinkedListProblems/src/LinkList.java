public class LinkList {
	Node head = null;
	Node tail = null;

	public void addNodeAtLast(Node newNode) {
		if (head == null) {
			head = newNode;
			tail = newNode;
			newNode.next = null;
		} else {
			tail.next = newNode;
			tail = newNode;
			tail.next = null;

		}

	}
     
	public void insertLoop(int loopIndex) {
		int i = 0;
		Node temp = head;
		while (i != loopIndex) {
			temp = temp.next;
			i++;
		}
		tail.next = temp;
	}

}
