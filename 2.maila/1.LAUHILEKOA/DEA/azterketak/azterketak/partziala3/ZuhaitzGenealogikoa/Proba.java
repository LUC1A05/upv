package ZuhaitzGenealogikoa;

import java.util.HashMap;

public class Proba {
	public static void main(String[] args) {
        ZuhaitzGenealogikoa arbol = new ZuhaitzGenealogikoa();

        // Construcción del árbol genealógico
        arbol.root = new BinaryTreeNode<>(new Pertsona("Aitor", "Bilbao"));
        arbol.root.left = new BinaryTreeNode<>(new Pertsona("Jon", "Bilbao"));
        arbol.root.right = new BinaryTreeNode<>(new Pertsona("Nerea", "Bilbao"));
        arbol.root.left.left = new BinaryTreeNode<>(new Pertsona("Iker", "Gernika"));
        arbol.root.left.right = new BinaryTreeNode<>(new Pertsona("Ane", "Durango"));

        // HashMap para las localidades
        HashMap<String, String> herriak = new HashMap<>();
        herriak.put("Bilbao", "Bizkaia");
        herriak.put("Gernika", "Bizkaia");
        herriak.put("Durango", "Bizkaia");
        herriak.put("Donostia", "Gipuzkoa");

        // Pruebas
        boolean esBizkaitarPetoPetoa = arbol.bizkaitarPetoPetoaDa("Aitor", herriak);
        System.out.println("¿Aitor y sus descendientes son todos de Bizkaia? " + esBizkaitarPetoPetoa);
        esBizkaitarPetoPetoa = arbol.bizkaitarPetoPetoaDa("Nerea", herriak);
        System.out.println("¿Nerea y sus descendientes son todos de Bizkaia? " + esBizkaitarPetoPetoa);

        // Agregamos un descendiente no bizkaitar para probar
        arbol.root.right.right = new BinaryTreeNode<>(new Pertsona("Miren", "Donostia"));
        esBizkaitarPetoPetoa = arbol.bizkaitarPetoPetoaDa("Aitor", herriak);
        System.out.println("¿Aitor y sus descendientes son todos de Bizkaia después de añadir a Miren? " + esBizkaitarPetoPetoa);
    }
}
