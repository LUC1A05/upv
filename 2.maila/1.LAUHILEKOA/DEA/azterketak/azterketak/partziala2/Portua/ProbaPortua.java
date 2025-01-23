package Portua;

import java.util.LinkedList;
import java.util.Queue;

public class ProbaPortua {
	public static void main(String[] args) {
        // Crear instancia del puerto
		Portua portua = new Portua();

        // Crear cola de ontziak (barcos)
        Queue<Ontzia> ontziak = new LinkedList<>();

        // Crear Ontzia 1 (desembarque)
        Ontzia ontzi1 = new Ontzia("Ontzi1", 0);
        ontzi1.eskaerak.add(new Eskaera(1, "KNT001"));
        ontzi1.eskaerak.add(new Eskaera(1, "KNT002"));
        ontzi1.eskaerak.add(new Eskaera(2, "KNT003"));

        // Crear Ontzia 2 (embarque) con contenedores apilados
        Ontzia ontzi2 = new Ontzia("Ontzi2", 1);
        ontzi2.eskaerak.add(new Eskaera(1, "KNT002")); // Contenedor en el medio de la pila
        ontzi2.eskaerak.add(new Eskaera(1, "KNT001"));
        // Agregar los barcos a la cola
        ontziak.add(ontzi1); // Desembarque primero
        ontziak.add(ontzi2); // Luego embarque

        // Configuración del puerto
        int maxEskaera = 2;  // Máximo de operaciones por turno
        int nasaKop = 3;     // Número total de muelles

        // Simular la actividad del puerto
        portua.portuaSimulatu(ontziak, maxEskaera, nasaKop);

    }
}
