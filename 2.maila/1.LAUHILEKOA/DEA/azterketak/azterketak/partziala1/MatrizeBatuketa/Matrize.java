package MatrizeBatuketa;

public class Matrize {
	Node first;
	public Matrize() {
		first = null;
	}
	public void addNode(Node n) {
		Node lag = first;
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
	public void inprimatuMat() {
		Node lag = first;
		Integer i = 1;
		Integer j = 1;
		while(lag != null) {
			if(i < lag.errenkada) {
				System.out.println();
				i = lag.errenkada;
				j = 1;
			}
			while(j < lag.zutabea) {
				System.out.print("0  ");
				j++;
			}
			System.out.print(lag.balioa + "  ");
			j++;
			lag = lag.next;
		}
		System.out.println();
	}
	public Matrize batura(Matrize m1, Matrize m2) {
		Node lag1 = m1.first;
		Node lag2 = m2.first;
		Matrize ema = new Matrize();
		Node lag3 = ema.first;
		
		while(lag1 != null && lag2!=null) {
			Node berria = new Node();
			if(lag1.errenkada < lag2.errenkada) {
				berria.zutabea = lag1.zutabea;
				berria.errenkada = lag1.errenkada;
				berria.balioa = lag1.balioa;
				if(ema.first == null) {
					ema.first = berria;
					lag3 = berria;
				}
				else {
					lag3.next = berria;
					lag3 = lag3.next;
				}
				lag1 = lag1.next;
			}
			else if(lag1.errenkada > lag2.errenkada) {
				berria.zutabea = lag2.zutabea;
				berria.errenkada = lag2.errenkada;
				berria.balioa = lag2.balioa;
				if(ema.first == null) {
					ema.first = berria;
					lag3 = berria;
				}
				else {
					lag3.next = berria;
					lag3 = lag3.next;
				}
				lag2 = lag2.next;
				
			}
			else {
				if(lag1.zutabea == lag2.zutabea) {
					berria.zutabea = lag1.zutabea;
					berria.errenkada = lag1.errenkada;
					berria.balioa = lag1.balioa +lag2.balioa;
					if(ema.first == null) {
						ema.first = berria;
						lag3 = berria;
					}
					else {
						lag3.next = berria;
						lag3 = lag3.next;
					}
					lag1 = lag1.next;
					lag2 = lag2.next;
				}
				else if(lag1.zutabea < lag2.zutabea) {
					berria.zutabea = lag1.zutabea;
					berria.errenkada = lag1.errenkada;
					berria.balioa = lag1.balioa;
					if(ema.first == null) {
						ema.first = berria;
						lag3 = berria;
					}
					else {
						lag3.next = berria;
						lag3 = lag3.next;
					}
					lag1 = lag1.next;
				}
				else {
					berria.zutabea = lag2.zutabea;
					berria.errenkada = lag2.errenkada;
					berria.balioa = lag2.balioa;
					if(ema.first == null) {
						ema.first = berria;
					}
					else {
						lag3.next = berria;
						lag3 = lag3.next;
					}
					lag2 = lag2.next;
				}
			}
		}
		return ema;
	}
}
