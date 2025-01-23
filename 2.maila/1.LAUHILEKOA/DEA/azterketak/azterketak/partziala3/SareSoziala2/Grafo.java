package SareSoziala2;

import java.util.LinkedList;

public class Grafo {
	final int DEFAULT_CAPACITY = 100;
	int numVertices;
	boolean[][] adjmatrix;
	LinkedList<Integer>[]adjList;
	
	public void zerrenda2Matrize() {
		this.adjmatrix = new boolean[adjList.length][adjList.length];
		for(int i = 0; i < adjList.length; i++) {
			for(Integer auzokoa : adjList[i]) {
				this.adjmatrix[i][auzokoa] = true;
			}
		}
	}
	
	public void matrize2Zerrenda() {
		this.adjList = new LinkedList[this.adjmatrix.length];
		for(int i = 0; i < adjmatrix.length; i++) {
			this.adjList[i] = new LinkedList<>();
			for(int j = 0; j < adjmatrix.length; j++) {
				if(adjmatrix[i][j]) {
					adjList[i].add(j);
				}
			}
		}
	}
}
