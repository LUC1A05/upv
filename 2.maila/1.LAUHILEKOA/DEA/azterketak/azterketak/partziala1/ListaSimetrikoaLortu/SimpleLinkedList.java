package ListaSimetrikoaLortu;

public class SimpleLinkedList {
	Node<Integer>first;
	public void addNode(Node<Integer> n) {
		Node<Integer>lag = first;
		if(first == null) {
			first = n;
		}
		else {
			while(lag.next!= null) {
				lag = lag.next;
			}
			lag.next = n;
		}
	}
}
