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
	
	private Iterator<Kontzeptua> getIteradorea()
	{
		return this.lista.iterator();
	}
	
	public double getSoldata()
	{
		double soldata = 0;
		Iterator<Kontzeptua>itr = this.getIteradorea();
		
		while(itr.hasNext())
		{
			Kontzeptua kon = itr.next();
			soldata += kon.getSoldata();
		}
		return soldata;
	}
}
