package Elecciones201206;

import java.util.LinkedList;

public class Municipio {
	private String nombreMunicipio;
	private LinkedList<Distrito>losDistritos;
	public Municipio(String nom, LinkedList<Distrito>dis) {
		this.losDistritos = dis;
		this.nombreMunicipio = nom;
	}
	public LinkedList<Distrito> getDistritos(){
		return this.losDistritos;
	}
	public String getNombre() {
		return this.nombreMunicipio;
	}
}
