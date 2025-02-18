package org.pmobo.packlaborategia4;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaEragiketak
{

	private ArrayList<Eragiketa> lista;
	private static ListaEragiketak nireListaEragiketak = null;


	// eraikitzailea singleton patroia aplikatuz
	private ListaEragiketak()
	{
		this.lista = new ArrayList<Eragiketa>();
	}

	// getters edo/eta setters
	public static ListaEragiketak getListaEragiketak()
	{
		return nireListaEragiketak;
	}


	// gainontzeko metodoak
	private Iterator<Eragiketa> getIteradorea()
	{
		return this.lista.iterator();
	}

	public int eragiketaKopurua()
	{
		int i = 0;
		Iterator<Eragiketa>itr=this.getIteradorea();
		while (itr.hasNext())
			i ++;
		return i;
	}

	public void gehituEragiketa(int pId, int pIdBezeroa, String pPasaHitza,
			double pDiruKop)
	{
		if (bilatuEragiketaIdz() != null)
		{
			System.out.println("Eragiketa jadanik dago");
			return;
		}
		Eragiketa er = new Eragiketa(pId, pIdBezeroa, pPasaHitza, pDiruKop);
		lista.add(er);
	}

	public void erreseteatu()
	{
		lista.clear();
		ListaEragiketak.getListaEragiketak().lista = new ArrayList<Eragiketa>();
	}

	public void eragiketaGuztiakBurutu()
	{
		//TODO
	}

	public Eragiketa bilatuEragiketaIdz(int pEragId)
	{
		// jasotzen duen Id duen bezero bat bueltatuko du, baldin badago
		// horrelakorik, bestela null.
		Eragiketa eran = null;
		boolean topatu = false;
		Iterator<Eragiketa>itr=this.getIteradorea();
		while (itr.hasNext() && topatu == false)
		{
			Eragiketa erag = itr.next();
			if (erag.getIdEragiketa() == pEragId)
			{
				topatu = true;	
				eran = erag;
			}
		}
		return eran;
	}
}