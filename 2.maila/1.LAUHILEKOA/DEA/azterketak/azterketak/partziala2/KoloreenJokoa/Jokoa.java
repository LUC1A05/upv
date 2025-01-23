package KoloreenJokoa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Jokoa {
	Queue<Integer>[] jokalariak;
	 // Fitxen koloreak balio osokoen bidez adierazten dira: beltzak 0 eta
	 // beste jokalarien kolorea bere posizioarekin bat etorriko da (hau da,
	 // 1 jokalariak 1 kolorea, ...)
	Stack<Integer> mahaia;
	public int jokoa(int n, ArrayList<Jokaldi> jokaldiak) {
		mahaia = new Stack<Integer>();
		jokalariak = (Queue<Integer>[]) new Queue[6];
		for(int i = 0; i < 6; i++) {
			jokalariak[i] = new LinkedList<Integer>();
			for(int j = 0; j < n; j++) {
				jokalariak[i].add(i);
			}
		}
		for(Jokaldi jo: jokaldiak) {
			if(jo.dado1 % 2 == 0) {
				int kolorea = jokalariak[jo.dado2-1].poll();
				mahaia.push(kolorea);
			}
			else {
				int kolorea = mahaia.pop();
				jokalariak[jo.dado2 - 1].add(kolorea);
			}
		}
		int irabazlea = 0;
		int kont = 0;
		int max = 0;
		for(int i = 1; i < 6; i++) {
			while(!jokalariak[i].isEmpty()) {
				int kolorea = jokalariak[i].poll();
				if(kolorea == 0) {
					kont ++;
				}
			}
			if(kont > max) {
				max = kont;
				irabazlea = i;
			}
		}
		return irabazlea;
	}
	 // aurre: n jokalari bakoitzaren hasierako fitxa-kopurua da
	 // “jokaldiak” zerrendak partida bateko jokaldiak ditu
	 // post: emaitza irabazlearen zenbakia da

}
