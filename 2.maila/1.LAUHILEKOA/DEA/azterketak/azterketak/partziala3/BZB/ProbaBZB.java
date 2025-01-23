package BZB;

public class ProbaBZB {
	public static void main(String[] args) {
        BZB arbol = new BZB();
        int[] valores = {5, 3, 8, 1, 4, 7, 9, 6};
        for (int valor : valores) {
            arbol.add(valor);
        }

        System.out.println("Imprimir el árbol en orden:");
        // Suponiendo que tienes un método para imprimir en orden que no está definido
        arbol.printNodes();

        System.out.println("Imprimir intervalo [4, 8]:");
        arbol.printTartea(4, 8);

        System.out.println("Imprimir intervalo [10, 15]: (debería estar vacío)");
        arbol.printTartea(10, 15);

        System.out.println("Imprimir intervalo [5, 5]:");
        arbol.printTartea(5, 5);
    }
}
