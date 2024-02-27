package org.pmoboAzterketak.urte2023;

public class Borrokalaria {
	
	private String izena;
	private int altuera;
	private int pisua;
	
	public Borrokalaria(String pIzena, int pAltuera, int pPisua) {
		this.izena = pIzena;
		this.altuera = pAltuera;
		this.pisua = pPisua;
	}
	public String getIzena() {
		return this.izena;
	}
	public int getAltuera() {
		return this.altuera;
	}
	public int getPisua() {
		return this.pisua;
	}
}
