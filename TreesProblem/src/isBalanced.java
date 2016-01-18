public class isBalanced {

	// returns maximum height of a tree
	int height(Node root) {
		if (root == null)
			return 0;
		int leftHt = height(root.left);
		int rightHt = height(root.right);
		int maxHt = Math.max(leftHt, rightHt) + 1;
		return maxHt;

	}

	boolean isBalanced(Node root) {

		if (root == null)
			return true;
		int diff = height(root.left) - height(root.right);
		if (Math.abs(diff) > 1)
			return false;
		else
			return isBalanced(root.left) && isBalanced(root.right);

	}

}