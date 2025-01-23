package ListaSimetrikoaLortu;

public class MiDoubleLinkedList {
	DoubleNode<Integer>first;
	public void obtenerListaSimetrica(SimpleLinkedList l) {
		Node<Integer> lag = l.first;
		while(lag != null) {
			DoubleNode<Integer>berria = new DoubleNode<Integer>();
			DoubleNode<Integer>berria2 = new DoubleNode<Integer>();
			berria.data = lag.data;
			berria2.data = lag.data * -1;
			if(first == null) {
				first = berria;
				first.prev = berria2;
				first.next = berria2;
				berria2.next = first;
				berria2.prev = berria;
				first = berria2;
			}
			else {
				first.prev.next = berria;
				berria.prev = first.prev;
				berria2.prev = first.prev.next;
				first.prev = berria2;
				berria2.next = first;
				first = berria2;
				first.prev.next = first;
			}
			lag = lag.next;
		}
	}
	public void inprimatu() {
		DoubleNode<Integer> lag = first;
		do{
			System.out.print(lag.data+"--->");
			lag = lag.next;
		}while(lag != first);
		
	}
}
