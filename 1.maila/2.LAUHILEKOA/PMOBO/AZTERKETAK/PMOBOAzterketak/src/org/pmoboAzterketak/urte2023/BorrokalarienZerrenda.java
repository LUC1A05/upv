package org.pmoboAzterketak.urte2023;

import java.util.ArrayList;
import java.util.Random;

public class BorrokalarienZerrenda {
	private ArrayList<Borrokalaria>lista;
	private static BorrokalarienZerrenda nireBorrokalarienZerrenda = null;
	private BorrokalarienZerrenda() {
		this.lista = new ArrayList<Borrokalaria>();
	}
	public static BorrokalarienZerrenda getBorrokalarienZerrenda() {
		if (nireBorrokalarienZerrenda == null)
			nireBorrokalarienZerrenda = new BorrokalarienZerrenda();
		return nireBorrokalarienZerrenda;
	}
	public void gehituBorrokalaria(String pIzena, int pAltuera, int pPisua) {
		Borrokalaria bk = new Borrokalaria(pIzena, pAltuera,pPisua);
		this.lista.add(bk);
	}
	public Borrokalaria getAusazBorrokalaria() {
		//ez da implementatu behar
		Random rand = new Random();
        int index = rand.nextInt(lista.size());
        return lista.get(index);
	}
}
