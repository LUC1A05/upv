package org.pmobo.packlaborategia6;

import java.util.ArrayList;
import java.util.Iterator;

public class KontzeptuZerrenda 
{
	private ArrayList<Kontzeptua>lista;
	private double zenbatekoGordina;
	
	public KontzeptuZerrenda()
	{
		this.lista = new ArrayList<Kontzeptua>();
	}
	
	public void gehituKontzeptua(Kontzeptua kon)
	{
		this.lista.add(kon);
	}
	
	private Iterator<Kontzeptua> getIteradorea()
	{
		return this.lista.iterator();
	}
	
	public double getSoldata(int antzinakotazuna, String erantzunkizuna, int sukuId)
	{
		double soldata = 0;
		Iterator<Kontzeptua>itr = this.getIteradorea();
		
		while(itr.hasNext())
		{
			Kontzeptua kon = itr.next();
			soldata += kon.getSoldata(antzinakotazuna, erantzunkizuna, sukuId);
		}
		return soldata;
	}
}
