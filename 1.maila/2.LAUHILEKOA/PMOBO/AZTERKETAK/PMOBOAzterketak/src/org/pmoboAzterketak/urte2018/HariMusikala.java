package org.pmoboAzterketak.urte2018;

public class HariMusikala {
	private ListaAbestiak errepoLista;
	private static HariMusikala nireHariMusikala = null;
	
	private HariMusikala()
	{
		this.errepoLista = new ListaAbestiak();
	}
	public static HariMusikala getHariMusikala()
	{
		if (nireHariMusikala == null)
			nireHariMusikala = new HariMusikala();
		return nireHariMusikala;
	}
	public int abeslarienAbestiKopurua(String pAbeslaria)
	{
		return this.errepoLista.abeslarienAbestiKopurua(pAbeslaria);
	}
	public Abestia jotzenEgongoDenAbestia(int pSegKop)
	{
		return this.errepoLista.jotzenEgongoDenAbestia(pSegKop);
	}
	public ListaAbestiak getErrepoLista()
	{
		return this.errepoLista;
	}
}
