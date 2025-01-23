package MatrizeBatuketa;

public class Node {
	Integer balioa;
	Integer errenkada;
	Integer zutabea;
	Node next;
	public Node(Integer pEr, Integer pZut, Integer pBal) {
		balioa = pBal;
		errenkada = pEr;
		zutabea = pZut;
		next = null;
	}
	public Node() {
		balioa = 0;
		errenkada =0;
		zutabea = 0;
		next = null;
		
	}
}
