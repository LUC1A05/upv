package ZuhaitzBitarra;

import java.util.ArrayList;

public class Proba {
	public static void main(String[] args) {
        ZuhaitzBitarra zuhaitz = new ZuhaitzBitarra();
        zuhaitz.root = new Nodo(10);
        zuhaitz.root.left = new Nodo(5);
        zuhaitz.root.right = new Nodo(15);
        zuhaitz.root.left.left = new Nodo(2);
        zuhaitz.root.left.right = new Nodo(7);
        zuhaitz.root.right.right = new Nodo(20);

        // Imprimir la lista ordenada descendente
        ArrayList<Integer> listaOrdenada = zuhaitz.lortuBeheranzkoZerrendaOrdenatua();
        System.out.println("Lista ordenada descendente: " + listaOrdenada);

        // Cerrar el árbol añadiendo nodos donde no hay hijos
        zuhaitz.zuhaitzaItxi();
        
        // Volver a imprimir la lista después de cerrar el árbol para ver los cambios
        ArrayList<Integer> listaOrdenadaDespuesDeCerrar = zuhaitz.lortuBeheranzkoZerrendaOrdenatua();
        System.out.println("Lista después de cerrar el árbol: " + listaOrdenadaDespuesDeCerrar);
    }
}
