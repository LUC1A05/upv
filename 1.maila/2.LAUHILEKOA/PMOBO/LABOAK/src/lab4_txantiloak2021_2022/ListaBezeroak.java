package org.pmobo.packlaborategia4;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaBezeroak
{
	// atributuak

	private ArrayList<Bezeroa> lista;
	private static ListaBezeroak nireListaBezeroak = null;

	// eraikitzailea singleton patroia aplikatu
	{
		//TODO
	}

	// getters edo/eta setters
	{
	//TODO
	}

	private Iterator<Bezeroa> getIteradorea()
	{
		//TODO
	}

	public Bezeroa bilatuBezeroaIdz(int pBezId)
	{
		// jasotzen duen Id duen bezero bat bueltatuko du, baldin badago
		// horrelakorik, bestela null.
		boolean topatua = false;
		//TODO
	    return bezeroBat;
	}

	// gainontzeko metodoak
	public int bezeroKopurua()
	{
		//TODO
	}

	public void gehituBezero(int pIdBezero, String pIzenAbizena,
			String pPasahitza, double pSaldoa, boolean pBerezia)
	{
		// bezeroen zerrendan jasotzen duen bezero bat gehitzen du. Bezero hori
		// jadanik sartuta balego, mezu bat aterako du abisatzeko.
		boolean topatua = false;
		//TODO
	}

	public void erreseteatu() 
	{
		//TODO
	}

}
