package org.pmoboAzterketak.urte2022;

import java.util.ArrayList;

public class HirukiakLista {
	private ArrayList<Hirukia>lista;
	private static HirukiakLista nireHirukiakLista = null;
	
	private HirukiakLista()
	{
		this.lista = new ArrayList<Hirukia>();
	}
	public static HirukiakLista getHirukiakLista()
	{
		if (nireHirukiakLista == null)
			nireHirukiakLista = new HirukiakLista();
		return nireHirukiakLista;
	}
	private Iterator<Hirukiak> getIteradorea()
	{
		return this.lista.iterator();
	}
	
}
