package ListaSimetrikoaLortu;

public class ProbaListaSimetrikoaLortu {
	public static void main(String[]args) {
		MiDoubleLinkedList l = new MiDoubleLinkedList();
		SimpleLinkedList lista = new SimpleLinkedList();
		
		Node<Integer>n1,n2,n3,n4;
		n1 = new Node<Integer>(8);
		n2 = new Node<Integer>(3);
		n3 = new Node<Integer>(4);
		n4 = new Node<Integer>(1);
		
		lista.addNode(n1);
		lista.addNode(n2);
		lista.addNode(n3);
		lista.addNode(n4);
		
		l.obtenerListaSimetrica(lista);
		l.inprimatu();
	}
}
