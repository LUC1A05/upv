package org.pmobo.packlaborategia4;

public class Eragiketa
{
	// atributuak
	private int id;
	private int idBezeroa;
	private String pasahitza;
	private double diruKop;
	private static double komisioa = 0.1;

	// eraikitzailea
	public Eragiketa(int pId, int pIdBezeroa, String pPasaHitza, double pDiruKop)
	{
		// atributuak hasieratzeko bezainbeste parametro jasoko ditu.
		this.id = pId;
		this.idBezeroa = pIdBezeroa;
		this.pasahitza = pPasaHitza;
		this.diruKop = pDiruKop;
	}

	// getters && setters

	public int getIdEragiketa()
	{
		return this.id;
	}

	private int getIdBezeroa()
	{
		return this.idBezeroa;
	}

	private double getKopurua()
	{
		return this.diruKop;
	}

	private static double getKomisioa()
	{
		return komisioa;
	}

	private String getPasahitza()
	{
		return this.pasahitza;
	}

	// gainotzeko metodoak
	public boolean idBerdinaDu(int pId)
	{
		boolean emaitza = false;
		if (this.id == pId)
			emaitza = true;
		return emaitza;
	}

	public void eragiketaBurutu()
	{
		double dirua;
		//TODO
		
	}
}
