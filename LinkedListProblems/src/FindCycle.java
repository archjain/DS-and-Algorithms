public class FindCycle {

	// checks if a loop exists in list or not
	public boolean ifCycleExists(LinkList list) {
		boolean flag = false;
		Node slowIterator = list.head; // moves to next node
		Node fastIterator = list.head; // moves by two nodes

		while (fastIterator.next != null && fastIterator.next.next != null) {
			slowIterator = slowIterator.next;
			fastIterator = fastIterator.next.next;
			if (slowIterator == fastIterator) {
				flag = true;
				break;
			}

		}

		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList list = new LinkList();
		list.addNodeAtLast(new Node(2));
		list.addNodeAtLast(new Node(4));
		list.addNodeAtLast(new Node(5));
		list.addNodeAtLast(new Node(1));
		list.addNodeAtLast(new Node(8));
		list.addNodeAtLast(new Node(6));

		// add loop, pass index
		// add a cycle from last node to node at passed index
		list.insertLoop(2);

		FindCycle object = new FindCycle();
		System.out.println(object.ifCycleExists(list));
	}

}
