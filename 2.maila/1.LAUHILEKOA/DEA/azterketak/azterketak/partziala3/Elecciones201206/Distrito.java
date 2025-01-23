package Elecciones201206;

import java.util.LinkedList;

public class Distrito {
	private String idDistrito;
	private LinkedList<Candidato> losCandidatos;
	public LinkedList<Candidato> getCandidatos(){
		return this.losCandidatos;
	}
	public Distrito(String dis, LinkedList<Candidato> can) {
		this.idDistrito = dis;
		this.losCandidatos = can;
	}
}
