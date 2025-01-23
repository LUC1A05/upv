package SareSoziala;

import java.util.ArrayList;

public class ProbaGrafo {
	public static void main(String[] args) {
		Grafo gr = new Grafo();
		gr.vertices = new Pertsona[gr.DEFAULT_CAPACITY];
		gr.adjmatrix = new boolean[gr.DEFAULT_CAPACITY][gr.DEFAULT_CAPACITY];
		
		Pertsona p1,p2,p3,p4,p5,p6,p7,p8,p9;
		p1 = new Pertsona(20, "Pedro");
		p2 = new Pertsona(30, "Jon");
		p3 = new Pertsona(44, "Xabi");
		p4 = new Pertsona(77, "Iker");
		p5 = new Pertsona(43, "Markel");
		p6 = new Pertsona(31, "Jorge");
		p7 = new Pertsona(37, "Kepa");
		p8 = new Pertsona(68, "Bego");
		p9 = new Pertsona(7, "Amaia");
		
		gr.vertices[0] = p1;
		gr.vertices[1] = p2;
		gr.vertices[2] = p3;
		gr.vertices[3] = p4;
		gr.vertices[4] = p5;
		gr.vertices[5] = p6;
		gr.vertices[6] = p7;
		gr.vertices[7] = p8;
		gr.vertices[8] = p9;
		
		gr.adjmatrix[0][1] = true;
		gr.adjmatrix[0][2] = true;
		gr.adjmatrix[0][3] = true;
		gr.adjmatrix[0][8] = true;
		
		gr.adjmatrix[8][4] = true;
		
		gr.adjmatrix[3][6] = true;
		gr.adjmatrix[3][7] = true;
		
		gr.adjmatrix[2][5] = true;
		
		ArrayList<Pertsona> ema = gr.hurbilak("Pedro", 18, 2);
		for(Pertsona p : ema) {
			System.out.println(p.izena + " " + p.adina);
		}
	}
}
