package org.pmobo.packlaborategia5;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaErabiltzaileak
{
	// atributuak
	private ArrayList<Erabiltzailea>lista;
	private static ListaErabiltzaileak nireListaErabiltzaileak = null;
	
	// eraikitzailea
	
    private ListaErabiltzaileak()
    { 
    	this.lista = new ArrayList<Erabiltzailea>();
    }
   	
    // beste metodoak
    
   	public static ListaErabiltzaileak getListaErabiltzaileak()
   	{
   		if (nireListaErabiltzaileak == null)
   		{
   			nireListaErabiltzaileak = new ListaErabiltzaileak();
   		}
   		return nireListaErabiltzaileak;
   	}
   	
	public int erabiltzaileKopurua()
   	{
		return this.lista.size();
   	}
   	
   	private Iterator<Erabiltzailea> getIteradorea()
   	{
   		return this.lista.iterator();
   	}
    
   	public Erabiltzailea bilatuErabiltzaileaIdz(int pId)
   	{
   		Iterator<Erabiltzailea>itr=getIteradorea();
   		boolean badago = false;
   		Erabiltzailea erabiltzailea = null;
   		while (itr.hasNext() && !badago)
   		{
   			Erabiltzailea er = itr.next();
   			if (er.idHauDu(pId))
   			{
   				badago = true;
   				erabiltzailea = er;
   			}
   		}
   		return erabiltzailea;
   	}
   	
   	public boolean badagoIdBerdinekoErabiltzailerik(Erabiltzailea pErabiltzailea)
   	{
   		Iterator<Erabiltzailea>itr=getIteradorea();
   		boolean badago = false;
   		while(itr.hasNext()&&badago == false)
   		{
   			Erabiltzailea er = itr.next();
   			if(er.idBerdinaDute(pErabiltzailea))
   			{
   				badago = true;
   			}
   		}
   		return badago;
   	}
   	
   	public void erabiltzaileariAltaEman(Erabiltzailea pErabiltzailea)
   	{   		
   		if (!this.badagoIdBerdinekoErabiltzailerik(pErabiltzailea))
   		{
   			this.lista.add(pErabiltzailea);
   		}
   	}

	public void erabiltzaileaBajaEman(int pIdErabiltzailea)
	{
		Iterator<Erabiltzailea>itr=getIteradorea();
		boolean badago = false;
		int i=0;
		if (this.bilatuErabiltzaileaIdz(pIdErabiltzailea) != null)
		{
			while (itr.hasNext() && badago == false)
			{
				Erabiltzailea er = itr.next();
				if (er.idHauDu(pIdErabiltzailea))
				{
					badago = true;
				}
				i ++;
			}
			this.lista.remove(i-1);
		}
   	}

   	public Erabiltzailea norkDaukaMaileguan(Liburua pLiburu)
   	{
   		Erabiltzailea erabiltzailea = null;
   		Iterator<Erabiltzailea>itr=getIteradorea();
   		boolean badago = false;
   		while (itr.hasNext() && !badago)
   		{
   			Erabiltzailea er = itr.next();
   			if (er.maileguanDu(pLiburu))
   			{
   				badago = true;
   				erabiltzailea = er;
   			}
   		}
   		return erabiltzailea;
   	}

   	public void inprimatu()
   	{
   		Iterator<Erabiltzailea>itr = getIteradorea();
   		System.out.println(this.erabiltzaileKopurua()+ " erabiltzaile daude guztira.");
   		while (itr.hasNext())
   		{
   			Erabiltzailea er = itr.next();
   			er.inprimatu();
   		}
   	}
   
   	public void erreseteatu()
   	{
   		this.lista.clear();
   	}
}
