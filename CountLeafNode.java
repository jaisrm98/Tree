package Tree;

public class CountLeafNode {
	Node root;

	static class Node {
		int data;
		Node left, right;

		public Node(int data) {
			this.data = data;
			left = right = null;
		}

	}

	int LeafNode(Node node) {
		if (node == null)
			return 0;
		if (node.left == null && node.right == null)
			return 1;
		else {
			return LeafNode(node.left) + (LeafNode(node.right));
		}

	}

	public static void main(String[] args) {
		CountLeafNode leaf = new CountLeafNode();
		leaf.root = new Node(1);
		leaf.root.left = new Node(2);
		leaf.root.right = new Node(3);
		leaf.root.left.left = new Node(4);
		leaf.root.left.right = new Node(5);
		System.out.println(leaf.LeafNode(leaf.root));

	}

}