package Jokoa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Proba {

	public static void main(String[] args) {
		GrafoJokoa gj = new GrafoJokoa();
		Laukia l1,l2,l3,l4,l5,l6,l7,l8,l9;
		gj.ondokoak = new HashMap<>();
		
		l1 = new Laukia("zur", 11);
		l2 = new Laukia("bel", 13);
		l3 = new Laukia("zur", 8);
		l4 = new Laukia("bel", 9);
		l5 = new Laukia("zur", 1);
		l6 = new Laukia("bel", 3);
		l7 = new Laukia("zur", 4);
		l8 = new Laukia("bel", 17);
		l9 = new Laukia("zur", 20);
		
		ArrayList<Laukia> a1,a2,a3,a4,a5,a6,a7,a8,a9;
		
		a1 = new ArrayList<>();
		a2 = new ArrayList<>();
		a3 = new ArrayList<>();
		a4 = new ArrayList<>();
		a5 = new ArrayList<>();
		a6 = new ArrayList<>();
		a7 = new ArrayList<>();
		a8 = new ArrayList<>();
		a9 = new ArrayList<>();
		
		a1.add(l2);
		a2.add(l3);
		a3.add(l4);
		a4.add(l5);
		a4.add(l6);
		a5.add(l6);
		a5.add(l7);
		a6.add(l7);
		a6.add(l8);
		a7.add(l8);
		a7.add(l9);
		a8.add(l9);
		
		gj.ondokoak.put(l1.balioa, a1);
		gj.ondokoak.put(l2.balioa, a2);
		gj.ondokoak.put(l3.balioa, a3);
		gj.ondokoak.put(l4.balioa, a4);
		gj.ondokoak.put(l5.balioa, a5);
		gj.ondokoak.put(l6.balioa, a6);
		gj.ondokoak.put(l7.balioa, a7);
		gj.ondokoak.put(l8.balioa, a8);
		gj.ondokoak.put(l9.balioa, a9);

		LinkedList<Laukia> ema = gj.bilatuBidea(l1, l9);
		
		for(Laukia lau : ema) {
			System.out.println(lau.kolorea + "  " + lau.balioa);
		}
	}

}
