package AdierazpenarenEbaluazioa;

import java.util.HashMap;

public class Proba {
	public static void main(String[] args) {
        // Crear un árbol de expresión: (x * y) + 5
        // Representación del árbol:
        //       "+"
        //      /   \
        //    "*"    "5"
        //   /   \
        // "x"   "y"

        BinaryTreeNode<InfoElemEspresioa> root = new BinaryTreeNode<>(new InfoElemEspresioa("+", true));
        root.left = new BinaryTreeNode<>(new InfoElemEspresioa("*", true));
        root.right = new BinaryTreeNode<>(new InfoElemEspresioa("5", false));
        root.left.left = new BinaryTreeNode<>(new InfoElemEspresioa("x", false));
        root.left.right = new BinaryTreeNode<>(new InfoElemEspresioa("y", false));

        Zuhaitza tree = new Zuhaitza();
        tree.root = root;

        // Crear HashMap con valores para las variables
        HashMap<String, Integer> tHash = new HashMap<>();
        tHash.put("x", 3);
        tHash.put("y", 4);
        tHash.put("5", 5); // Asumimos que los literales también se manejan así

        // Evaluar la expresión almacenada en el árbol
        Integer result = tree.ebaluatu(tHash);
        System.out.println("El resultado de la expresión es: " + result);
    }
}
