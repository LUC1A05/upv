package BideaBilatu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Grafo {
	protected int numVertices; // number of vertices in the graph
	protected int[][] adjMatrix; // adjacency matrix

	public boolean bideaDago(ArrayList<Integer> lista) {
		boolean badago = true;
		int i = 0;
		
		while(i < lista.size()-1 && badago) {
			int unekoa = lista.get(i);
			int hurrengoa = lista.get(i+1);
			if(adjMatrix[unekoa-1][hurrengoa-1] == 0) {
				badago = false;
			}
			i++;
		}
		return badago;
	}
	public Grafo(int numVertices) {
        this.numVertices = numVertices;
        this.adjMatrix = new int[numVertices][numVertices];
    }

    public void agregarArco(int desde, int hasta) {
        // Agrega un arco al grafo (indexado desde 1)
        adjMatrix[desde - 1][hasta - 1] = 1;
    }

}
