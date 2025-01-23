package Elecciones201206;

import java.util.HashMap;
import java.util.LinkedList;

public class ProbaEleccion {

	public static void main(String[] args) {
		Candidato c1, c2, c3,c4,c5,c6,c7,c8,c9,c10;
		c1 = new Candidato("pepe");
		c2 = new Candidato("jon");
		c3 = new Candidato("ana");
		c4 = new Candidato("alberto");
		c5 = new Candidato("julen");
		c6 = new Candidato("pedro");
		c7 = new Candidato("luis");
		c8 = new Candidato("eneko");
		c9 = new Candidato("amaia");
		c10 = new Candidato("rosa");
		LinkedList<Candidato>can1 = new LinkedList<>();
		LinkedList<Candidato>can2 = new LinkedList<>();
		LinkedList<Candidato>can3 = new LinkedList<>();
		LinkedList<Candidato>can4 = new LinkedList<>();
		LinkedList<Candidato>can5 = new LinkedList<>();
		can1.add(c1);
		can1.add(c2);
		can2.add(c3);
		can2.add(c4);
		can3.add(c5);
		can3.add(c6);
		can4.add(c10);
		can4.add(c9);
		can5.add(c8);
		can5.add(c7);
		
		Distrito d1,d2,d3,d4,d5;
		d1 = new Distrito("Toln", can1);
		d2 = new Distrito("Las", can2);
		d3 = new Distrito("Deb", can3);
		d4 = new Distrito("Debi", can4);
		d5 = new Distrito("fro", can5);
		LinkedList<Distrito> dis1 = new LinkedList<>();
		LinkedList<Distrito> dis2 = new LinkedList<>();
		LinkedList<Distrito> dis3 = new LinkedList<>();
		dis1.add(d1);
		dis1.add(d2);
		dis2.add(d3);
		dis3.add(d4);
		dis3.add(d5);
		
		Municipio m1,m2,m3;
		m1 = new Municipio("Tolosa", dis1);
		m2 = new Municipio("Lasarte", dis2);
		m3 = new Municipio("Deba", dis3);
		LinkedList<Municipio> muni = new LinkedList<>();
		muni.add(m1);
		muni.add(m2);
		muni.add(m3);
		
		Provincia p;
		p = new Provincia("Gipuzkoa", muni);
		LinkedList<Provincia>provincias;
		
		Eleccion e = new Eleccion();
		HashMap<Municipio, LinkedList<Candidato>> ema = e.calcularTablaHashMunicipios(p);
		for(Municipio mun : ema.keySet()) {
			System.out.println("Municipio: "+ mun.getNombre() + " Candidatos: ");
			for(Candidato can : ema.get(mun)) {
				System.out.print(" --> " + can.getApellido());
			}
			System.out.println();
		}
	}

}
