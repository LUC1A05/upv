package SareSoziala;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Grafo {
	final int DEFAULT_CAPACITY = 100;
	int numVertices;
	boolean[][] adjmatrix;
	Pertsona[] vertices;
	
	public int index(String t) {
		//t elementiua grafoan dago
		//t elementua vertices arrayan duen posizioa itzuli
		int i = 0;
		for(Pertsona iz : vertices) {
			if(iz.izena.equals(t)) {
				return i;
			}
			i++;
		}
		return -1;
	}
	
	public ArrayList<Pertsona> hurbilak(String p, int adina, int dist){
		//dist distantzia max da, adina baino gehiago izan behar dute
		//adin hori edo handiagoko eta p-tik dist distantziara dauden Pertsonak bueltatu.
		int has = this.index(p);
		Queue<Integer> aztGabe = new LinkedList<>();
		HashMap<Integer, Integer> aztertuak = new HashMap<>();
		ArrayList<Pertsona> ema = new ArrayList<>();
		aztertuak.put(has, 0);
		aztGabe.add(has);
		ema.add(vertices[has]);
		while(!aztGabe.isEmpty()) {
			int unekoa = aztGabe.remove();
			for(int i = 0; i < adjmatrix.length; i++) {
				if(adjmatrix[unekoa][i] == true && !aztertuak.containsKey(i) && aztertuak.get(unekoa) <= dist) {
					aztertuak.put(i, aztertuak.get(unekoa));
					aztGabe.add(i);
					if(vertices[i].adina >= adina) {
						ema.add(vertices[i]);
					}
				}
			}
		}
		return ema;
	}
}
