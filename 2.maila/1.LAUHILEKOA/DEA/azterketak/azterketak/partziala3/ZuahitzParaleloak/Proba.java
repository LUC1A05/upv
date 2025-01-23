package ZuahitzParaleloak;

import java.util.ArrayList;

public class Proba {
    public static void main(String[] args) {
        IzenenZuhaitza zuhaitza = new IzenenZuhaitza();

        // Crear nodos de nombres y apellidos
        Nodo rootAbizenak = new Nodo("Garcia");
        rootAbizenak.left = new Nodo("Fernandez");
        rootAbizenak.right = new Nodo("Lopez");

        Nodo rootIzenak = new Nodo("Maria");
        rootIzenak.left = new Nodo("Ana");
        rootIzenak.right = new Nodo("Jose");

        // Asignar raíces a la instancia de IzenenZuhaitza
        zuhaitza.rootAbizenak = rootAbizenak;
        zuhaitza.rootIzenak = rootIzenak;

        // Búsqueda de nombres basada en apellidos
        System.out.println("Nombre para 'Garcia': " + zuhaitza.lortuIzena("Garcia"));
        System.out.println("Nombre para 'Fernandez': " + zuhaitza.lortuIzena("Fernandez"));
        System.out.println("Nombre para 'Lopez': " + zuhaitza.lortuIzena("Lopez"));
        
        ArrayList<String> ema = zuhaitza.zerrendaOrdenatuaLortu();
        
        for(String iza : ema) {
        	System.out.println(iza);
        }
    }
}
