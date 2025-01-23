package CalculoDeEficiencia201206;

import java.util.LinkedList;

public class ProbaMiArbol {
	public static void main(String[] args) {
        // Crear una instancia del árbol
        MiArbol arbol = new MiArbol();

        // Insertar elementos en el árbol
        arbol.insert("M");
        arbol.insert("B");
        arbol.insert("A");
        arbol.insert("Z");
        arbol.insert("T");
        arbol.insert("L");
        arbol.insert("O");

        // Crear una lista de elementos a buscar en el árbol
        LinkedList<String> listaBusqueda = new LinkedList<>();
        listaBusqueda.add("A");
        listaBusqueda.add("Z");
        listaBusqueda.add("M");
        listaBusqueda.add("O");
        listaBusqueda.add("L");

        arbol.print();
        // Llamar al método numMedioDeElementos y mostrar el resultado
        double numMedio = arbol.numMedioDeElementos(listaBusqueda);
        System.out.println("Número medio de elementos examinados: " + numMedio);
    }
}
