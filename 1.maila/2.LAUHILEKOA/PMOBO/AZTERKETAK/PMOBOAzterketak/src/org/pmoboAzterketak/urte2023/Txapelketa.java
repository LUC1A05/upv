package org.pmoboAzterketak.urte2023;

import java.util.ArrayList;
import java.util.Iterator;

public class Txapelketa {
	private ArrayList<Borroka>lista;
	private static Txapelketa nireTxapelketa = null;
	private Txapelketa() {
		this.lista = new ArrayList<Borroka>();
	}
	public static Txapelketa getTxapelketa() {
		if (nireTxapelketa == null)
			nireTxapelketa = new Txapelketa();
		return nireTxapelketa;
	}
	public Iterator<Borroka>getIteradorea(){
		return this.lista.iterator();
	}
	public void gehituBorroka(Borroka pBk) {
		this.lista.add(pBk);
	}
	public void borrokaKudeatu() {
		int i = 1;
		while (i <= 5) {
			Borroka bk = new Borroka(i);			
			this.gehituBorroka(bk);
			i++;
		}
	}
	public void lehenengoBorrokaBistaratu(String pIzena) {
		Iterator<Borroka>itr=this.getIteradorea();
		boolean dago = false;
		while (itr.hasNext() && dago == false) {
			Borroka bk=itr.next();
			if (bk.getBorrokalari1().getIzena() == pIzena || bk.getBorrokalari2().getIzena()==pIzena) {
				System.out.println(bk.getId());
				System.out.println(bk.getBorrokalari1().getIzena());
				System.out.println(bk.getBorrokalari1().getAltuera());
				System.out.println(bk.getBorrokalari1().getPisua());
				System.out.println(bk.getBorrokalari2().getIzena());
				System.out.println(bk.getBorrokalari2().getAltuera());
				System.out.println(bk.getBorrokalari2().getPisua());
				dago = true;
			}
		}
		if (dago == false) {
			System.out.println(pIzena + " borrokalariak ez du parte hartuko");
		}
	}
}
