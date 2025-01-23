package azkenaLortu;

public class DoubleNode<T> {
	T data;
	DoubleNode<T>prev;
	DoubleNode<T>next;
	public DoubleNode(T pData) {
		data = pData;
		prev = null;
		next = null;
	}
}
