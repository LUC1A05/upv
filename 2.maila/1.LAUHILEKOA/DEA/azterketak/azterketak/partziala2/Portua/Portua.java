package Portua;

import java.util.Queue;
import java.util.Stack;

public class Portua {
	Stack<String> nasak[];
	public void portuaSimulatu(Queue<Ontzia> ontziak, int maxEskaera, int nasaKop){
	//Aurre: maxEskaera deskargako ontzi batek txanda batean kudeatu ditzakeen
	//eskaera kopurua da (>=1)
	//Aurre: nasaKop portuaren nasa kopurua da (>=2). 0. nasa berezia da.
	//Post: portuaren jarduera simulatu da, ontzien eskaerak betez.
	//Nasak sortu
		nasak = (Stack<String>[]) new Stack[nasaKop];
		for(int i = 0; i < nasaKop; i ++) {
			nasak[i] = new Stack<String>();
		}
		//Portuaren jarduera simulatu
		while(!ontziak.isEmpty()) {
			Ontzia ontzi = ontziak.poll();
			if(ontzi.mota == 0) {
				for(int i = 0; i < maxEskaera && !ontzi.eskaerak.isEmpty(); i++) {
					Eskaera esk = ontzi.eskaerak.poll();
					nasak[esk.nasa].push(esk.kontainerKode);
					System.out.println(ontzi.izena + " ontzia " + esk.nasa + " nasan " + esk.kontainerKode + " deskargatu du.");
				}
				if(!ontzi.eskaerak.isEmpty()) {
					ontziak.add(ontzi);
					System.out.println(ontzi.izena + " ontzia " + "filan jarri da.");
				}
			}
			else {
				while(!ontzi.eskaerak.isEmpty()) {
					Eskaera esk = ontzi.eskaerak.poll();
					boolean aurkitua = false;
					int kont = 0;
					while(!aurkitua) {
						String kodea = nasak[esk.nasa].pop();
						if(kodea.equals(esk.kontainerKode)) {
							aurkitua = true;
						}
						else {
							nasak[0].push(kodea);
							kont ++;
						}
					}
					if(kont != 0) {
						while(kont > 0) {
							String kodea = nasak[0].pop();
							nasak[esk.nasa].push(kodea);
						}
					}
					System.out.println(ontzi.izena + " ontzia " + esk.nasa + " nasatik " + esk.kontainerKode + " kargatu du.");
				}
			}
		}
	}

}
