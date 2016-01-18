public class TopView {

	int count = 0;

	void top_view(Node root) {
		if (root == null) {

			return;
		}
		count = count + 1;
		top_view(root.left);
		count = count - 1;
		System.out.print(root.data + " ");

		if (count == 0)
			rightView(root);

	}

	void rightView(Node root) {
		if (root == null)
			return;
		while (root.right != null) {
			System.out.print(root.right.data + " ");
			root = root.right;
		}
	}

}
