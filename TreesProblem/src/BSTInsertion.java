
public class BSTInsertion {
	public static Node root=null;
	public boolean  isBST(Node root){
		if(root==null)
			return true;
		
		if((root.left!=null&&root.left.data>root.data)|| (root.right!=null&&root.right.data<root.data))
			return false;
		return (isBST(root.left)&&isBST(root.right));
		
	}
	
	void Inorder(Node root) {
		if (root == null)
			return;
		Inorder(root.left);
		System.out.print(root.data + " ");
		Inorder(root.right);
	}
	 void Insert(Node node, int value) {
			boolean flag=true;
		if (root == null) {
			root = node;
			root.data=value;
			flag=false;
			//return root;
		}
		Node temp = root;
	
		while (flag==true) {
			if (temp.data < value) {
				if (temp.left == null) {
					temp.left = node;
					temp.left.data=value;
					flag=false;
					
					
				}
				temp = temp.left;
			} else {
				if (temp.right == null) {
					temp.right = node;
					temp.right.data=value;
					flag=false;
				}
				temp = temp.right;
			}
		}
		//return root;

	}
/*public static void main(String[] args)
{
	BSTInsertion obj = new BSTInsertion();
	obj.Insert(new Node(), 10);
	obj.Insert(new Node(), 12);
	obj.Insert(new Node(), 3);
	obj.Insert(new Node(), 7);
	obj.Insert(new Node(), 8);
	obj.Insert(new Node(), 15);
	obj.Insert(new Node(), 13);
	obj.Inorder(root);
	System.out.println(obj.isBST(root));
	
	}*/
}
