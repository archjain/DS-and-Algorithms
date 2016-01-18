public class HeightOfTree {

	// returns maximum height of a tree
	int height(Node root) {
		if (root == null)
			return 0;
		int leftHt = height(root.left);
		int rightHt = height(root.right);
		int maxHt = Math.max(leftHt, rightHt) + 1;
		return maxHt;

	}
}
