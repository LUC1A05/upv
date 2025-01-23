package PokerPartida;

import java.util.ArrayList;
import java.util.Stack;

public class Joko {
	public int jokatu(int jokalariKop, int hasierakoBilleteKop, ArrayList<Ordainketa> ordainketak) {
		
		Stack<Boolean>[]jokalariak = new Stack[jokalariKop];
		for(int i = 0; i < jokalariKop; i ++) {
			jokalariak[i] = new Stack<Boolean>();
			for(int j = 0; j < hasierakoBilleteKop; j++) {
				boolean billetea = (i!= 0);
				jokalariak[i].push(billetea);
			}
		}
		for(Ordainketa or : ordainketak) {
			for(int kop = 0; kop < or.kopurua; kop ++) {
				boolean billetea = jokalariak[or.ordaintzailea].pop();
				jokalariak[or.kobratzailea].push(billetea);
			}
		}
		int kont = 0;
		while(!jokalariak[0].isEmpty()) {
			boolean billetea = jokalariak[0].pop();
			if(billetea) {
				kont ++;
			}
		}
		return kont;
	}

}
