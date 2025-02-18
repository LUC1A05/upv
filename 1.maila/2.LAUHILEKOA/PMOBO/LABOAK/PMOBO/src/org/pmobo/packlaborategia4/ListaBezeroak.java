package org.pmobo.packlaborategia4;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaBezeroak
{
	// atributuak

	private ArrayList<Bezeroa> lista;
	private static ListaBezeroak nireListaBezeroak = null;

	// eraikitzailea singleton patroia aplikatu
	private ListaBezeroak()
	{
		this.lista = new ArrayList<Bezeroa>();
	}

	// getters edo/eta setters
	public static ListaBezeroak getListaBezeroak()
	{
		return nireListaBezeroak;
	}

	private Iterator<Bezeroa> getIteradorea()
	{
		return this.lista.iterator();
	}

	public Bezeroa bilatuBezeroaIdz(int pBezId)
	{
		// jasotzen duen Id duen bezero bat bueltatuko du, baldin badago
		// horrelakorik, bestela null.
		Iterator<Bezeroa>itr=this.getIteradorea();
		boolean topatua = false;
		Bezeroa bezeroBat = null;
		while (itr.hasNext() && topatua == false)
		{
			Bezeroa bz = itr.next();
			if (bz.idBerdinaDu(pBezId))
			{
				bezeroBat = bz;
				topatua = true;
			}
		}
	    return bezeroBat;
	}

	// gainontzeko metodoak
	public int bezeroKopurua()
	{
		Iterator<Bezeroa>itr=this.getIteradorea();
		int i = 0;
		while (itr.hasNext())
			i ++;
		return i;
	}

	public void gehituBezero(int pIdBezero, String pIzenAbizena,
			String pPasahitza, double pSaldoa, boolean pBerezia)
	{
		// bezeroen zerrendan jasotzen duen bezero bat gehitzen du. Bezero hori
		// jadanik sartuta balego, mezu bat aterako du abisatzeko.
		if (bilatuBezeroaIdz(pIdBezero) != null)
		{
			System.out.println("Bezeroa jadanik sartuta dago");
			return;
		}
		Bezeroa bz = new Bezeroa(pIdBezero, pIzenAbizena, pPasahitza, pSaldoa, pBerezia);
		lista.add(bz);		
	}

	public void erreseteatu() 
	{
		ListaBezeroak.getListaBezeroak().lista = new ArrayList<Bezeroa>();
	}

}
