public class isBalanced {

	// returns maximum height of a tree
	
	//O(n^2)
	int getHeight(Node root){
		if(root == null)
			return 0;
		return Math.max(getHeight(root.left),getHeight(root.right))+1;
	}
	boolean isBal(Node root){
		if(root==null)
			return true;
		if(getHeight(root.left)-getHeight(root.right)>1){
			return false;
		}
		else return isBal(root.left)&& isBal(root.right);
	}
	
	//O(n), check while checking the height
	int checkHeight(Node root){
		if(root == null){
			return 0;
		}
		int lh = checkHeight(root.left);
		if(lh==-1){
			return -1;
		}
		int rh = checkHeight(root.right);
		if(rh==-1){
			return -1;
			
		}
		int diff=Math.abs(lh-rh);
		if(diff>1){
			return -1;
		}
		else return Math.max(lh,rh)+1;
	}
	boolean isBalBetter(Node root){
		if(checkHeight(root)==-1){
			return false;
		}
		else return true;
	}
	
	
	/*int height(Node root) {
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

	}*/

}