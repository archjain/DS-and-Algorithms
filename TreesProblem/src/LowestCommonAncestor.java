public class LowestCommonAncestor {

	//in bst
	static Node lca(Node root, int v1, int v2) {

		if (root.data < v1 && root.data < v2) {
			return lca(root.right, v1, v2);
		}

		if (root.data > v1 && root.data > v2) {
			return lca(root.left, v1, v2);
		}

		return root;

	}
// in a binary tree only(not necessaritly bst)
	static boolean v1=false;
	static boolean v2 = false;
	Node lcaTree(Node root, int n1, int n2){
		if(root==null)
			return null;
		
		if(root.data == n1){
			v1=true;
			return root;
		}
		if(root.data==n2){
			v2 =  true;
			return root;
		}
			
		
		Node left = lcaTree(root.left,n1,n2);
		Node right =  lcaTree(root.right,n1,n2);
		
		if(left!=null&&right!=null)
		{
		 if(v1==true && v2==true)
			return root;
		 else return null;
		}
		
		if(left!=null) return left;
		else return right;
	}

}
