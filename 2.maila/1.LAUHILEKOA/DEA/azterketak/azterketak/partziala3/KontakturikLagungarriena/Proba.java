package KontakturikLagungarriena;

import java.util.ArrayList;

public class Proba {

	public static void main(String[] args) {
		KontaktuSarea ks = new KontaktuSarea();
		ks.adjmatrix = new boolean[5][5];
		
		ks.adjmatrix[0][1] = true;
        ks.adjmatrix[0][2] = true;
        ks.adjmatrix[1][2] = true;
        ks.adjmatrix[2][3] = true;
        ks.adjmatrix[3][4] = true;
        
        
        // Lista de personas para verificar quién es el más 'lagungarri'
        ArrayList<Integer> pertsonak = new ArrayList<>();
        pertsonak.add(0); // Añadir IDs de personas
        pertsonak.add(1);
        pertsonak.add(2);
        pertsonak.add(3);

        // Encuentra el más 'lagungarri'
        int lagungarriena = ks.lagungarriena(pertsonak);
        System.out.println("La persona más útil es: " + lagungarriena);

	}

}
