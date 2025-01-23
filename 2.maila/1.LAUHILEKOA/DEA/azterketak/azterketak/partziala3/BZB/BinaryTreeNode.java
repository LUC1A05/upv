package BZB;

public class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left, right;
	int numberOfNodes;
	public BinaryTreeNode(T v) {
		this.data = v;
		this.left = null;
		this.right = null;
		this.numberOfNodes = 0;
	}

}
