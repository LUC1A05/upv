package KontakturikLagungarriena;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class KontaktuSarea {
	boolean[][] adjmatrix;
	
	private boolean bateragarriakDira(int p1, int p2) {
		HashSet<Integer>azter = new HashSet<>();
		Queue<Integer>aztGabe = new LinkedList<>();
		azter.add(p1);
		aztGabe.add(p1);
		while(!aztGabe.isEmpty()) {
			int unekoa = aztGabe.remove();
			for(int i = 0; i < adjmatrix.length; i++) {
				if(adjmatrix[unekoa][i] && i == p2) {
					return true;
				}
				if(!azter.contains(i)) {
					aztGabe.add(i);
					azter.add(i);
				}
			}
		}
		return false;
	}

	public int lagungarriena(ArrayList<Integer>pertsonak) {
		int[]lagun = new int[adjmatrix.length];
		for(Integer p : pertsonak) {
			Queue<Integer> aztGabe = new LinkedList<>();
			boolean[]azt = new boolean[adjmatrix.length];
			azt[p] = true;
			aztGabe.add(p);
			while(!aztGabe.isEmpty()) {
				int unekoa = aztGabe.remove();
				for(int i = 0; i < adjmatrix.length; i++) {
					if(!azt[i] && adjmatrix[unekoa][i]) {
						azt[i] = true;
						aztGabe.add(i);
						if(this.bateragarriakDira(p, i)) {
							lagun[i]++;							
						}
					}
				}
			}
		}
		int max = -1;
		int posMax = -1;
		int i = 0;
		for(int lag : lagun) {
			if(lag > max) {
				max = lag;
				posMax = i;
			}
			i++;
		}
		return posMax;
	}
}
