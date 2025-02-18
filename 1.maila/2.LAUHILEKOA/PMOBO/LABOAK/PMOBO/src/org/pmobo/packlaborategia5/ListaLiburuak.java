package org.pmobo.packlaborategia5;


import java.util.ArrayList;
import java.util.Iterator;

public class ListaLiburuak
{
   // atributuak
	private ArrayList<Liburua>lista;

	// eraikitzailea
	
	public ListaLiburuak()
	{
		this.lista = new ArrayList<Liburua>();
	}

	// beste metodoak
	
	public int listarenTamaina()
	{  
		return this.lista.size();
	}
	 
	private Iterator<Liburua> getIteradorea()
	{
		return this.lista.iterator();
	}
  
	public Liburua bilatuLiburuaIdz(int pIdLiburua)
	{
		boolean badago = false;
		Liburua liburua = null;
		Iterator<Liburua>itr=getIteradorea();
		while (itr.hasNext() && badago == false)
		{
			Liburua lb = itr.next();
			if (lb.idHauDu(pIdLiburua))
			{
				badago = true;
				liburua = lb;
			}	
		}
		return liburua;
	}
  
	public boolean badago(Liburua pLiburua)
	{
		return this.lista.contains(pLiburua);
	}
	
	public boolean idBerdinekoLibururikBaAlDa(Liburua pLiburua)
	{
		boolean badago = false;
		Iterator<Liburua>itr = getIteradorea();
		while (itr.hasNext() && badago == false) 
		{
			Liburua lb=itr.next();
			if (lb.idBerdinaDute(pLiburua))
			{
				badago = true;
			}
		}
		return badago;
	}
	
	public void gehituLiburua(Liburua pLiburua)
   {
	  if (!this.badago(pLiburua))
	  {
		  this.lista.add(pLiburua);
	  }
   }
	
	public void kenduLiburua(Liburua pLiburua)
    {
		boolean badago = false;
		int i = 0;
		Iterator<Liburua>itr=getIteradorea();
		while (itr.hasNext() && badago == false)
		{
			Liburua lb = itr.next();
			if (lb.idBerdinaDute(pLiburua))
				badago = true;
			i++;
		}
		this.lista.remove(i-1);
	}
	
	public void inprimatu()
	{
		Iterator<Liburua>itr = getIteradorea();
		while (itr.hasNext())
		{
			Liburua lb = itr.next();
			lb.inprimatu();
		}
	}
 }
