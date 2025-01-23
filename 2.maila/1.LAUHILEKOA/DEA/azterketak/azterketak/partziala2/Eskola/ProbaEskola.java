package Eskola;

import java.util.LinkedList;
import java.util.Queue;

public class ProbaEskola {
	public static void main(String[]args) {
		Eskola es = new Eskola();
		Queue<String> opariak = new LinkedList<String>();
		opariak.add("r1");
		opariak.add("r2");
		opariak.add("r3");
		opariak.add("r4");
		opariak.add("r5");
		opariak.add("r6");
		opariak.add("r7");
		opariak.add("r8");
		es.opariakBanatu(opariak);
	}
}
