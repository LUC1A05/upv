package CalculoDeEficiencia201206;

import java.util.LinkedList;

public class MiArbol extends BinarySearchTree<String>{
	 public double numMedioDeElementos(LinkedList<String> l) {
		 // Pre: los elementos de la lista l están en el árbol
		 // Post: el resultado es el número medio de elementos del árbol examinados
		 // en las búsquedas de los elementos de la lista l 
		 double ema = 0.00;
		 if(l.isEmpty())return ema;
		 for(String nodo : l) {
			 ema += this.numDeElemento(this.root, nodo);
			 System.out.println(ema);
		 }
		 return ema/l.size();
	 }
	 private double numDeElemento(BinaryTreeNode<String>z, String nodoa) {
		 if(z == null)return 0.00;
		 if(z.content.equals(nodoa))return 1.00;
		 else if(z.content.compareTo(nodoa) < 0) {
			 return 1 + this.numDeElemento(z.right, nodoa);
		 }
		 else {
			 return 1+ this.numDeElemento(z.left, nodoa);
		 }
	 }
	 public void insert(String value) {
		 if(this.root == null) {
			 BinaryTreeNode<String> berria= new BinaryTreeNode<>(); 
			 berria.content = value;
			 root = berria;
		 }
		 else {
			 this.insertRecursive(root, value);
		 }
	 }

	 private BinaryTreeNode<String> insertRecursive(BinaryTreeNode<String> node, String value) {
		 	if(node == null) {
		 		BinaryTreeNode<String> berria= new BinaryTreeNode<>();
		 		berria.content = value;
		 		node = berria;
		 	}
	        if (value.compareTo(node.content) < 0) {
	            node.left = insertRecursive(node.left, value);  // Insertar en el lado izquierdo
	        } else if (value.compareTo(node.content) > 0) {
	            node.right = insertRecursive(node.right, value);  // Insertar en el lado derecho
	        }
	        // Si el valor es igual al contenido del nodo, no se inserta para evitar duplicados

	        return node;  // Devolver el nodo actual sin cambios
	  }
	 public void print() {
		 System.out.println("Root: " + root.content);
		 System.out.println("Left: ");
		 
		 printRL(root.left);
		 System.out.println("Right: ");
		 
		 printRL(root.right);
	 }
	 private void printRL(BinaryTreeNode<String> nodo) {
		 if(nodo == null)return;
		 System.out.println("--> "+ nodo.content);
		 System.out.println("left " + nodo.content);		 
		 this.printRL(nodo.left);
		 System.out.println("right " + nodo.content);		 
		 this.printRL(nodo.right);
	 }
}
