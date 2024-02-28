package org.pmobo.packlaborategia4;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaEragiketak
{

	private ArrayList<Eragiketa> lista;
	private static ListaEragiketak nireListaEragiketak = null;


	// eraikitzailea singleton patroia aplikatuz
	{
		//TODO
	}


	// getters edo/eta setters
	{
		//TODO
	}


	// gainontzeko metodoak
	private Iterator<Eragiketa> getIteradorea()
	{
		//TODO
	}

	public int eragiketaKopurua()
	{
		//TODO
	}

	public void gehituEragiketa(int pId, int pIdBezeroa, String pPasaHitza,
			double pDiruKop)
	{
		//TODO
	}

	public void erreseteatu()
	{
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
		
		//TODO
	}
}