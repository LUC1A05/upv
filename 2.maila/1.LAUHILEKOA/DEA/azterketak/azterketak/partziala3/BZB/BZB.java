package BZB;

public class BZB {
	private BinaryTreeNode<Integer> root;
	
	public void add(int v) {
		//v ez dago zuhaitzean
		//v zuhaitzean dago
		root = this.add(v, root);
	}
	private BinaryTreeNode<Integer> add(int v, BinaryTreeNode<Integer> nodoa) {
		if(nodoa == null) {
			BinaryTreeNode<Integer>berria = new BinaryTreeNode<Integer>(v);
			nodoa = berria;
		}
		else if(nodoa.data < v) {
			nodoa.numberOfNodes ++;
			nodoa.right = this.add(v, nodoa.right);
		}
		else {
			nodoa.numberOfNodes ++;
			nodoa.left = this.add(v, nodoa.left);
		}
		return nodoa;
	}
	
	public void printTartea(int a, int b) {
		if(a == b) {
			System.out.println(a);
		}
		else {
			this.printTartea(a, b, root);
		}
	}
	private void printTartea(int a, int b, BinaryTreeNode<Integer> nodoa) {
		if(nodoa == null) {
			return;
		}
		if(a < nodoa.data) {
			this.printTartea(a, b, nodoa.left);
		}
		if(nodoa.data >= a && nodoa.data <= b) {
			System.out.println(nodoa.data);
		}
		if(b > nodoa.data) {
			this.printTartea(a, b, nodoa.right);
		}
		
	}
	
	public void printNodes() {
		System.out.println("--> " + root.data + " numNodes: " + root.numberOfNodes);
		this.printNodes(root.left);
		this.printNodes(root.right);
	}
	private void printNodes(BinaryTreeNode<Integer> nodoa) {
		if(nodoa == null) {
			return;
		}
		else {
			System.out.println("--> " + nodoa.data + " numNodes: " + nodoa.numberOfNodes);
			this.printNodes(nodoa.left);
			this.printNodes(nodoa.right);	
		}
	}

}
