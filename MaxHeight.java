package Tree;

public class MaxHeight {
	Node root;
	static class Node
	{
		int data;
		Node left,right;
		Node(int data)
		{
			this.data=data;
			left=right=null;
		}
	}
	public int maxheight(Node node)
	{
		if(node==null)
		return 0;
		else {
			int l=maxheight(node.left);
			int r=maxheight(node.right);
			if(l>r)
				return (l+1);
				else 
					return (r+1);

		}
	}
	public static void main(String[] args) {
		MaxHeight height = new MaxHeight();
		height.root=new Node(1);
		height.root.left=new Node(2);
		
		  height.root.right=new Node(3); 
		  height.root.left.left=new Node(4);
		  height.root.left.left.left=new Node(5); 
		  height.root.left.right=new Node(6);
		 
		System.out.println(height.maxheight(height.root));

	}

}
