package azkenaLortu;

public class DoubleLinkedList<T> {
	DoubleNode<T>first;
	public DoubleLinkedList() {
		first = null;
	}
	public void addNode(DoubleNode<T> n) {
		if(first == null) {
			first = n;
			n.prev = n;
			n.next = n;
		}
		else {
			first.prev.next = n;
			n.prev = first.prev;
			n.next = first;
			first.prev = n;
		}
	}
	public void inprimatu() {
		DoubleNode<T>lag = first;
		do {
			System.out.print(lag.data + " ->");
			lag = lag.next;
		}while(lag != first);
	}
	public T azkenaLortu(Integer jauzia) {
		T ema;
		DoubleNode<T>lag = first;
		while(first.next != first) {
			int i = 0;
			while(i < jauzia) {
				lag = lag.next;
				i++;
			}
			if(lag == first) {
				lag.prev.next = lag.next;
				lag.next.prev = lag.prev;
				first = lag.next;
			}
			else {
				lag.prev.next = lag.next;
				lag.next.prev = lag.prev;
			}
		}
		ema = first.data;
		
		return ema;
	}
}
