package Tree;
import java.util.*;

//program to insert node in Binary Search tree
class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
 class BST {
	public static  Node insert(Node root,int data)
	{
		if(root==null) {
			return new Node(data);
		}
		else
		{
			Node n;
			if(data<=root.data)
			{
				n=insert(root.left,data);
				root.left=n;
			}
			else
			{
				n=insert(root.right,data);
				root.right=n;
			}
			return root;
		}
			
	}
	static void inorder(Node root)
	{
		if(root==null)
			return;
		
		inorder(root.left);
		System.out.print(root .data+" ");
		inorder(root.right);
	}
	public static int maxheight(Node root)
	{
		if(root==null)
		return -1;
		else {
			int l=maxheight(root.left);
			int r=maxheight(root.right);
			if(l>r)
				return (l+1);
				else  
					return (r+1);

		}
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Node root=null;
		int t=sc.nextInt();
		while(t-->0)
		{
			int data=sc.nextInt();
			root=insert(root,data);
		}
		sc.close();
		inorder(root);
		System.out.println("\nheight of the tree is "+maxheight(root));
	}

}
