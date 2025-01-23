package Herencia;

public class ProbaGrafoPersona {
	public static void main(String[] args) {
        // Crear una instancia del grafo de personas
        GrafoPersonas grafo = new GrafoPersonas();

        // Añadir algunas personas al grafo
        Persona p1 = new Persona("Alice");
        Persona p2 = new Persona("Bob");
        Persona p3 = new Persona("Charlie");
        Persona p4 = new Persona("David");

        grafo.addVertex(p1);
        grafo.addVertex(p2);
        grafo.addVertex(p3);
        grafo.addVertex(p4);

        // Definir algunas conexiones (aristas)
        grafo.addEdge(0, 1); // Alice -> Bob
        grafo.addEdge(1, 2); // Bob -> Charlie
        grafo.addEdge(2, 3); // Charlie -> David
        grafo.addEdge(0, 2); // Alice -> Charlie (direct)

        // Usar el método repartir
        int cantidad = 100; // Cantidad total a repartir
        int n = 2; // Distancia máxima
        int distribuido = grafo.repartir(cantidad, n, p1); // Comenzando desde Alice

        System.out.println("Cantidad distribuida a cada persona: " + distribuido);
    }
}
