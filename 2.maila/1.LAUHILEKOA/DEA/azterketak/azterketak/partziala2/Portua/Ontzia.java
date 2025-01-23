package Portua;

import java.util.LinkedList;
import java.util.Queue;

public class Ontzia {
	int mota; //0 (deskarga), 1 (karga)
	String izena;
	Queue<Eskaera> eskaerak;
	
	public Ontzia(String iz, int mo) {
		this.mota = mo;
		this.izena = iz;
		this.eskaerak = new LinkedList<Eskaera>();
	}
}
