public class LinkListMergingPoint {
	/*
	 *returns the value of node where two link list merges.
	 */
	class Node {
		int data;
		Node next;
	}

	int FindMergeNode(Node headA, Node headB) {
		if (headA == null) {
			return -1;
		}
		if (headB == null) {
			return -1;
		}

		int aCount = 1;
		int bCount = 1;
		Node tempA = headA;
		Node tempB = headB;
		while (tempA.next != null) {
			tempA = tempA.next;
			aCount++;
		}
		while (tempB.next != null) {
			tempB = tempB.next;
			bCount++;
		}
		int diff = Math.abs(aCount - bCount);
		tempA = headA;
		tempB = headB;
		if (aCount > bCount) {

			for (int i = 0; i < diff; i++) {
				tempA = tempA.next;
			}
		}
		if (bCount > aCount) {

			for (int i = 0; i < diff; i++) {
				tempB = tempB.next;
			}
		}
		while (tempA != tempB) {
			tempA = tempA.next;
			tempB = tempB.next;
		}
		return tempA.data;
	}
}
