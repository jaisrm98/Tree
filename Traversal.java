package Tree;

public class Traversal {
	Node root;
	static class Node
	{
		int data;
		Node left,right;
		public Node(int data) 
		{
			this.data=data;
			left=right=null;
		}
	}

   void Inorder(Node node)
   {
	   if(node==null)
		   return;
	  
	   Inorder(node.left);
	   System.out.print(node.data+" ");
	   Inorder(node.right);
   }
   void Postorder(Node node)
   { 
	   if(node==null)
	   return  ;
	   Postorder(node.left);
	   Postorder(node.right);
	   System.out.print(node.data+" ");
   }
	void Preorder(Node node)
	{ 
		if(node==null)
		   return;
		System.out.print(node.data+" ");
		Preorder(node.left);
		Preorder(node.right);
	}
	
	public static void main(String[] args) 
	{
		Traversal tree=new Traversal();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		System.out.println("Inorder");
		tree.Inorder(tree.root);
		System.out.println("\nPreorder");
        tree.Preorder(tree.root);
        System.out.println("\nPostorder");
        tree.Postorder(tree.root);
	}

}
