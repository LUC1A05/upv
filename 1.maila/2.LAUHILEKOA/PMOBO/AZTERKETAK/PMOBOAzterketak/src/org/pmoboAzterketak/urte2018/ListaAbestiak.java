package org.pmoboAzterketak.urte2018;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaAbestiak {
	private ArrayList<Abestia>lista;
	
	public ListaAbestiak()
	{
		this.lista = new ArrayList<Abestia>();
	}
	private Iterator<Abestia> getIteradorea()
	{
		return this.lista.iterator();
	}
	public int abeslarienAbestiKopurua(String pAbeslaria)
	{
		Iterator<Abestia>itr=getIteradorea();
		int i = 0;
		while (itr.hasNext())
		{
			Abestia ab = itr.next();
			if (ab.getAbeslaria().equals(pAbeslaria))
			{
				i++;
			}
		}
		return i;
	}
	public Abestia jotzenEgongoDenAbestia(int pSegKop)
	{
		int segunduak=0;
		Abestia abestia = null;
		Iterator<Abestia>itr =getIteradorea();
		while (itr.hasNext() && segunduak<pSegKop)
		{
			Abestia ab = itr.next();
			segunduak += ab.getIraupena();
			abestia = ab;
		}
		return abestia;
	}
	public void gehituAbestia(Abestia pAbestia)
	{
		this.lista.add(pAbestia);
	}
}
