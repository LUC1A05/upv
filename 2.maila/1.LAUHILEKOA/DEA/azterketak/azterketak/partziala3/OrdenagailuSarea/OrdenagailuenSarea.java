package OrdenagailuSarea;

import java.util.LinkedList;
import java.util.Queue;

public class OrdenagailuenSarea {
	protected Boolean[][] adjMatrix;
	
	public int[] kostuakLortu() {
		Queue<Integer> aztGabe = new LinkedList<>();
		boolean[] aztertuak = new boolean[adjMatrix.length];
		int[]kostuak = new int[adjMatrix.length];
		aztGabe.add(0);
		aztertuak[0] = true;
		while(!aztGabe.isEmpty()) {
			int unekoa = aztGabe.remove();
			for(int i = 0; i < adjMatrix.length; i++) {
				if(adjMatrix[unekoa][i] && !aztertuak[i]) {
					kostuak[i] = kostuak[unekoa] + 1;
					aztGabe.add(i);
					aztertuak[i] = true;
				}
			}
		}
		return kostuak;
	}
}
