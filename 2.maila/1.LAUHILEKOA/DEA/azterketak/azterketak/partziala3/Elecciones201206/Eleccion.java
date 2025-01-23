package Elecciones201206;

import java.util.HashMap;
import java.util.LinkedList;

public class Eleccion {
	LinkedList<Partido> partidos; // todos los partidos
	LinkedList<Candidato> candidatos; // todos los candidatos
	LinkedList<Distrito> distritos; // todos los distritos
	LinkedList<Provincia> provincias; // todas las provincias
	
	public HashMap<Municipio, LinkedList<Candidato>> calcularTablaHashMunicipios(Provincia p){
		// Pre: la provincia p existe
		// Post: el resultado es una tabla hash cuya clave es el nombre de los
		// municipios de esa provincia, y cuyo contenido es la lista de los
		// candidatos que se presentan a ese municipio 
		HashMap<Municipio, LinkedList<Candidato>>zerrenda = new HashMap<>();
		for(Municipio mun : p.getMunicipios()) {
			LinkedList<Candidato>candidatos = new LinkedList<>();
			for(Distrito dis : mun.getDistritos()) {
				for(Candidato can : dis.getCandidatos()) {
					candidatos.add(can);
				}
			}
			zerrenda.put(mun, candidatos);
		}
		return zerrenda;
	}
}
