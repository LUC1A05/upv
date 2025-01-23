package Herencia;

import java.util.ArrayList;
import java.util.LinkedList;

public class GraphAL<T> {
	protected final int DEFAULT_CAPACITY = 100;
	 protected int numVertices; // number of vertices in the graph
	 protected LinkedList<Integer>[] adjList; // adjacency list
	 protected T[] vertices; // values of vertices
	 public int index(T t) {
	 // pre: el elemento t se encuentra en el grafo
	 // post devuelve el índice del array “vertices” correspondiente a t 
		 for(int i = 0; i < vertices.length; i ++) {
			 if(vertices[i].equals(t)) {
				 return i;
			 }
		 }
		 return -1;
	 }
	 public void addVertex(T vertex) {
		    if (numVertices == vertices.length) {
		        expandCapacity(); // Método para expandir la capacidad si es necesario
		    }
		    vertices[numVertices] = vertex; // Añade el vértice al array
		    adjList[numVertices] = new LinkedList<>(); // Añade una nueva lista de adyacencia
		    numVertices++;
	}
	 private void expandCapacity() {
		    T[] newVertices = (T[]) new Object[vertices.length * 2];
		    System.arraycopy(vertices, 0, newVertices, 0, numVertices);
		    vertices = newVertices;

		    LinkedList<Integer>[] newAdjList = new LinkedList[adjList.length * 2];
		    System.arraycopy(adjList, 0, newAdjList, 0, numVertices);
		    adjList = newAdjList;
		    for (int i = numVertices; i < newAdjList.length; i++) {
		        adjList[i] = new LinkedList<>(); // Inicializa las nuevas listas de adyacencia
		    }
		}
	 public void addEdge(int from, int to) {
	        // Ensures the indices are within the array bounds
	        if (from < 0 || to < 0 || from >= numVertices || to >= numVertices) {
	            throw new IndexOutOfBoundsException("Vertex index out of bounds");
	        }
	        adjList[from].add(to); // Add to to the list of from's adjacent vertices
	    }
}
