package azkenaLortu;

public class ProbaAzkenaLortu {
	public static void main(String[]args) {
		DoubleNode<String>n1,n2,n3,n4,n5;
		n1 = new DoubleNode<String>("ana");
		n2 = new DoubleNode<String>("jon");
		n3 = new DoubleNode<String>("amaia");
		n4 = new DoubleNode<String>("luis");
		n5 = new DoubleNode<String>("ander");
		
		DoubleLinkedList<String>l = new DoubleLinkedList<String>();
		l.addNode(n1);
		l.addNode(n2);
		l.addNode(n3);
		l.addNode(n4);
		l.addNode(n5);
		l.inprimatu();
		
		System.out.println();
		System.out.println(l.azkenaLortu(4));
		l.inprimatu();
	}
}
