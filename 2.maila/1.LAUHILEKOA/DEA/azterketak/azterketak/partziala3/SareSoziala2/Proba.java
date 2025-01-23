package SareSoziala2;

import java.util.LinkedList;

public class Proba {
	public static void main(String[] args) {
        Grafo grafo = new Grafo();

        // Inicializar lista de adyacencia
        grafo.adjList = new LinkedList[5]; // Asumimos un grafo pequeño de 5 vértices
        for (int i = 0; i < grafo.adjList.length; i++) {
            grafo.adjList[i] = new LinkedList<>();
        }
        
        // Añadir algunas conexiones
        grafo.adjList[0].add(1);
        grafo.adjList[0].add(2);
        grafo.adjList[1].add(2);
        grafo.adjList[2].add(0);
        grafo.adjList[3].add(4);

        for (int i = 0; i < grafo.adjList.length; i++) {
        	System.out.print(i + ": ");
        	for (Integer auzokoa : grafo.adjList[i]) {
        		System.out.print(auzokoa + " ");
        	}
        	System.out.println();
        }
        // Convertir de lista de adyacencia a matriz de adyacencia
        grafo.zerrenda2Matrize();
        
        // Imprimir la matriz de adyacencia
        System.out.println("Matriz de Adyacencia:");
        for (int i = 0; i < grafo.adjmatrix.length; i++) {
            for (int j = 0; j < grafo.adjmatrix.length; j++) {
                System.out.print(grafo.adjmatrix[i][j] ? "1 " : "0 ");
            }
            System.out.println();
        }

        // Convertir de matriz de adyacencia de vuelta a lista de adyacencia
        grafo.matrize2Zerrenda();
        
        // Imprimir la lista de adyacencia reconvertida
        System.out.println("Lista de Adyacencia Reconstruida:");
        for (int i = 0; i < grafo.adjList.length; i++) {
            System.out.print(i + ": ");
            for (Integer auzokoa : grafo.adjList[i]) {
                System.out.print(auzokoa + " ");
            }
            System.out.println();
        }
    }
}
