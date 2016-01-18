
public class BSTInsertion {
	static Node Insert(Node root, int value) {
		Node newNode = new Node();
		newNode.data = value;
		newNode.left = null;
		newNode.right = null;
		if (root == null) {
			root = newNode;
			return root;
		}
		Node temp = root;
		while (true) {
			if (temp.data > value) {
				if (temp.left == null) {
					temp.left = newNode;
					break;
				}
				temp = temp.left;
			} else {
				if (temp.right == null) {
					temp.right = newNode;
					break;
				}
				temp = temp.right;
			}
		}
		return root;

	}

}
