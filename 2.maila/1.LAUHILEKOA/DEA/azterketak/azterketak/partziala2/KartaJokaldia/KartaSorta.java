package KartaJokaldia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class KartaSorta {
	private Stack<Karta> kartak;
	
	public KartaSorta() {
		String[] paloak = {"urrea", "kopa", "ezpata", "bastoia"};
		kartak = new Stack<Karta>();
		ArrayList<Karta> aux = new ArrayList<Karta>();
		for(String palo : paloak) {
			for(int i = 1; i <= 10; i++) {
				aux.add(new Karta(palo, i));
			}
		}
		Collections.shuffle(aux);
		for(Karta karta : aux) {
			kartak.push(karta);
		}
	}
}
