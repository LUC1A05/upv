package ZerrendaOrdenatuakLortu;

public class ProbaZerrendaOrdenatuakBildu {
	public static void main(String[]args) {
		DoubleNode<String>n1,n2,n3,n4,n5;
		n1 = new DoubleNode<String>();
		n2 = new DoubleNode<String>();
		n3 = new DoubleNode<String>();
		n4 = new DoubleNode<String>();
		n5 = new DoubleNode<String>();
		
		DoubleCircularLinkedList l = new DoubleCircularLinkedList();
		l.addNode(n1, "ama");
		l.addNode(n2, "gas");
		l.addNode(n3, "mar");
		l.addNode(n4, "rio");
		l.addNode(n5, "zar");
		
		String[]s = new String[3];
		s[0]="aaa";
		s[1]="oir";
		s[2]="pan";
		l.sekuentziakFusionatu(s);
		
		l.inprimatu();
	}

}
