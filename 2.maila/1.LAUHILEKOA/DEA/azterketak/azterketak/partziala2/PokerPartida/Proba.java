package PokerPartida;

import java.util.ArrayList;

import azkenaLortu.DoubleLinkedList;
import azkenaLortu.DoubleNode;

public class Proba {
	public static void main(String[]args) {
		int jokalariKop = 10;
		int hasierakoBilleteKop = 10;
		Ordainketa o1, o2, o3, o4;
		o1 = new Ordainketa(1,0,2);
		o2 = new Ordainketa(2,0,2);
		o3 = new Ordainketa(0,1,2);
		o4 = new Ordainketa(3,0,5);
		//0 = 7 billete on
		ArrayList<Ordainketa> ordainketak = new ArrayList<Ordainketa>();
		ordainketak.add(o1);
		ordainketak.add(o2);
		ordainketak.add(o3);
		ordainketak.add(o4);
		
		Joko j = new Joko();
		int ema = j.jokatu(jokalariKop, hasierakoBilleteKop, ordainketak);
		System.out.println("0.jokalariak " + ema + " billete on ditu.");
	}
}
