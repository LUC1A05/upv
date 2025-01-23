package Elecciones201206;

import java.util.LinkedList;

public class Provincia {
	private String nomProvincia;
	private LinkedList<Municipio>losMunicipios;
	public Provincia(String nom, LinkedList<Municipio>mun) {
		this.nomProvincia = nom;
		this.losMunicipios = mun;
	}
	public LinkedList<Municipio> getMunicipios() {
		return this.losMunicipios;
	}
	public LinkedList<Distrito> losDistritos(String apellidoCand){
		LinkedList<Distrito>distritos = new LinkedList<>();
		for(Municipio mun : this.losMunicipios) {
			for(Distrito dis : mun.getDistritos()) {
				for(Candidato can : dis.getCandidatos()) {
					if(can.getApellido().equals(apellidoCand)) {
						distritos.add(dis);
					}
				}
			}
		}
		return distritos;
	}
}
