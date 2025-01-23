package BideaBilatu;

import java.util.ArrayList;
import java.util.Arrays;

public class ProbaGrafo {

	public static void main(String[] args) {
		Grafo grafo = new Grafo(20);  // Asumiendo que el grafo tiene 20 nodos

        // Configuración de conexiones directas en la matriz de adyacencia (ejemplo basado en tu imagen)
        grafo.agregarArco(12, 1);
        grafo.agregarArco(1, 4);
        grafo.agregarArco(4, 17);
        grafo.agregarArco(17, 18);
        grafo.agregarArco(18, 15);

        ArrayList<Integer> listaExitosa = new ArrayList<>(Arrays.asList(12, 1, 4, 17, 18, 15));
        System.out.println("Camino exitoso: " + grafo.bideaDago(listaExitosa));

        ArrayList<Integer> listaFallo = new ArrayList<>(Arrays.asList(12, 1, 20, 17, 18, 15));
        System.out.println("Camino fallido: " + grafo.bideaDago(listaFallo));

        ArrayList<Integer> listaVacia = new ArrayList<>();
        System.out.println("Lista vacía: " + grafo.bideaDago(listaVacia));

        ArrayList<Integer> unSoloElemento = new ArrayList<>(Arrays.asList(12));
        System.out.println("Un solo elemento: " + grafo.bideaDago(unSoloElemento));

	}

}
