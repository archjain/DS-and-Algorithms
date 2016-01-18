public class PrintTree {

	// preorder
	void Preorder(Node root) {
		if (root == null)
			return;
		System.out.print(root.data + " ");
		Preorder(root.left);
		Preorder(root.right);

	}

	// postorder
	void Postorder(Node root) {
		if (root == null)
			return;
		Postorder(root.left);
		Postorder(root.right);
		System.out.print(root.data + " ");
	}

	// inorder
	void Inorder(Node root) {
		if (root == null)
			return;
		Inorder(root.left);
		System.out.print(root.data + " ");
		Inorder(root.right);
	}
}
