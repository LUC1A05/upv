package Jokoa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class GrafoJokoa {
	HashMap<Integer, ArrayList<Laukia>> ondokoak;//private baina frogatzeko errezago
	//gakoa balioa, balioa konektatuta dauden laukiak
	public LinkedList<Laukia> bilatuBidea(Laukia has, Laukia buk){
		LinkedList<Laukia> ema = new LinkedList<>();
		HashMap<Laukia, Laukia> trace = new HashMap<>();
		Queue<Laukia>azterGabe = new LinkedList<>();
		azterGabe.add(has);
		trace.put(has, null);
		boolean eginda = false;
		while(!azterGabe.isEmpty() && !eginda) {
			Laukia unekoa = azterGabe.remove();
			for(Laukia lau : ondokoak.get(unekoa.balioa)) {
				if(!lau.kolorea.equals(unekoa.kolorea) && !trace.containsKey(lau)) {
					if(lau.equals(buk)) {
						eginda = true;
						trace.put(lau, unekoa);
					}
					else {
						trace.put(lau, unekoa);
						azterGabe.add(lau);	
					}
				}
			}
		}
		Laukia unekoa = buk;
		while(trace.get(unekoa) != null) {
			ema.addFirst(unekoa);
			unekoa = trace.get(unekoa);
		}
		ema.addFirst(unekoa);
		return ema;
	}
	
}
