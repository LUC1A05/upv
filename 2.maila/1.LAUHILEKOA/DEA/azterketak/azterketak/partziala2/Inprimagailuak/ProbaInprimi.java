package Inprimagailuak;

import java.util.ArrayList;

public class ProbaInprimi {
	public static void main(String[] args) {
        // Crear instancia de Inprimagailuak
        Inprimagailuak inprimagailuak = new Inprimagailuak();

        // Crear lista de tareas (Eskaera)
        ArrayList<Eskaera> lista = new ArrayList<>();

        // Agregar tareas a diferentes impresoras
        lista.add(new Eskaera('P', 101, 1)); // Agregar tarea 101 a impresora 1
        lista.add(new Eskaera('P', 102, 2)); // Agregar tarea 102 a impresora 2
        lista.add(new Eskaera('P', 103, 3)); // Agregar tarea 103 a impresora 3

        // Imprimir tareas
        lista.add(new Eskaera('B', 0, 1)); // Eliminar tarea de impresora 1
        lista.add(new Eskaera('B', 0, 2)); // Eliminar tarea de impresora 2

        // Interrumpir y mover tareas a cola central
        lista.add(new Eskaera('I', 0, 0)); // Interrupción

        // Agregar nuevas tareas
        lista.add(new Eskaera('P', 201, 3)); // Agregar tarea 201 a impresora 3
        lista.add(new Eskaera('P', 202, 4)); // Agregar tarea 202 a impresora 4

        // Restaurar funcionamiento normal
        lista.add(new Eskaera('Z', 0, 0)); // Restaurar sin interrupciones
        lista.add(new Eskaera('P', 105, 5)); // Agregar tarea 103 a impresora 3
        lista.add(new Eskaera('P', 104, 4)); // Agregar tarea 103 a impresora 3
        lista.add(new Eskaera('P', 402, 2)); // Agregar tarea 103 a impresora 3

        // Procesar tareas
        inprimagailuak.lanakProzesatu(lista);
    }
}
