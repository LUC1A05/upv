package ZerrendaOrdenatuakLortu;

public class DoubleCircularLinkedList {
	DoubleNode<String> first; // ezin da beste atributurik gehitu
	public DoubleCircularLinkedList() {
		this.first = null;
	}
	public void addNode(DoubleNode<String> nodoa, String hitza) {
		nodoa.data = hitza;
		if(this.first == null) {
			first = nodoa;
			nodoa.prev = nodoa;
			nodoa.next = nodoa;
		}
		else {
			DoubleNode<String> last = first.prev;
			last.next.prev = nodoa;
			nodoa.next = last.next;
			nodoa.prev = last;
			last.next = nodoa;
		}
	}
	public void inprimatu() {
		DoubleNode<String> lag = first;
		
		do {
			System.out.println(lag.data);
			lag = lag.next;
			
		}while(lag != first);
	}
	public void sekuentziakFusionatu(String[] s){
	// Aurre: s sekuentzia ordenatuta dago
	// Post: emaitza s-ren balioak estekadura bikoitzeko zerrenda zirkularrean txertatuta
	//izango da (goranzko ordena mantenduko da)
		DoubleNode<String> lag = first;
		int i = 0;
		do {
			if(lag.data.compareTo(s[i]) > 0) {
				DoubleNode<String> berria = new DoubleNode<String>();
				if(lag == first) {
					berria.data = s[i];
					first.prev.next = berria;
					berria.prev = first.prev;
					berria.next = lag;
					lag.prev = berria;
					first = berria;
				}
				else {
					berria.data = s[i];
					lag.prev.next = berria;
					berria.prev = lag.prev;
					berria.next = lag;
					lag.prev = berria;
				}
				i++;
			}
			else {
				lag = lag.next;
			}
			
		}while(lag != first && s.length>i);
		
	}

}
