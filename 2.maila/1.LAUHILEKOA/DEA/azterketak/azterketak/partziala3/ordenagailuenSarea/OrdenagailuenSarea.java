package ordenagailuenSarea;

import java.util.LinkedList;
import java.util.Queue;

public class OrdenagailuenSarea {
	protected Boolean[][] adjMatrix; // adjacency matrix
	private int[]kostuak;
	public OrdenagailuenSarea(Boolean[][] adjMatrix2) {
		adjMatrix = adjMatrix2;
	}
	public int[] kostuakLortu() {
		int[]ema = new int[adjMatrix.length];
		boolean[]aztertuak = new boolean[ema.length];
		Queue<Integer>aztGabeak = new LinkedList<Integer>();
		ema[0] = 0;
		aztertuak[0] = true;
		aztGabeak.add(0);
		while(!aztGabeak.isEmpty()) {
			int unekoa = aztGabeak.remove();
			for(int i = 0; i < adjMatrix[unekoa].length; i++) {
				if(adjMatrix[unekoa][i] && !aztertuak[i]) {
					aztGabeak.add(i);
					aztertuak[i] = true;
					ema[i] = ema[unekoa] + 1;
				}
			}
		}
		kostuak = ema;
		return ema;
	}
	public void inprimagailua() {
		for(int i = 0; i < kostuak.length; i++) {
			System.out.println("--> " + i + "-ren kostua hurrengoa da: " + kostuak[i]);
		}
	}
}
