package Herencia;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class GrafoPersonas extends GraphAL<Persona> {
	public int repartir(int cantidad, int n, Persona p) {
		Queue<Integer> aztGabe = new LinkedList<>();
		HashSet<Integer>aztertuak = new HashSet<>();
		HashMap<Integer, Integer>distancia = new HashMap<>();
		int ini = this.index(p);
		aztGabe.add(ini);
		aztertuak.add(ini);
		distancia.put(ini, 0);
		int kop = 0;
		while(!aztGabe.isEmpty()) {
			Integer unekoa = aztGabe.remove();
			for(int vecino : this.adjList[unekoa]) {
				if(!aztertuak.contains(vecino) && distancia.get(unekoa) + 1 <= n) {
					aztertuak.add(vecino);
					aztGabe.add(vecino);
					distancia.put(vecino, distancia.get(unekoa) + 1);
					kop++;
				}
			}
		}
		return cantidad/kop;
	}
}
