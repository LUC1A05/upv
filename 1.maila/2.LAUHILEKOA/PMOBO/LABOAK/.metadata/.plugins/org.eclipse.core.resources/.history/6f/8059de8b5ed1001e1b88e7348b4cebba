package org.pmobo.packlaborategia4;

import java.text.DecimalFormat;

public class Bezeroa
{
	// atributuak
	private int idBezeroa;
	private String izenAbizena;
	private String pasaHitza;
	private double saldoa;
	private boolean berezia;

	// eraikitzailea
	public Bezeroa(int pId, String pIzenAbizena, String pPasaHitza,
			double pSaldoa, boolean pBerezia)
	{
		this.idBezeroa = pId;
		this.izenAbizena = pIzenAbizena;
		this.pasaHitza = pPasaHitza;
		this.saldoa = pSaldoa;
		this.berezia = pBerezia;
		
	}

	// getters eta setters

	private int getIdBezeroa()
	{
		return this.idBezeroa;
	}

	private String getIzenAbizena()
	{
		return this.izenAbizena;
	}

	private String getPasahitza()
	{
		return this.pasaHitza;
	}

	private double getSaldoa() 
	{
		return this.saldoa;
	}

	public boolean getBerezia()
	{
		return this.berezia;
	}

	private void setSaldoa(double pSaldoa)
	{
		this.saldoa = pSaldoa;
	}

	// gainontzeko metodoak
	private boolean pasaHitzaBaieztatu(String pPasaHitza)
	{
		// gorago komentatu denez boolear bat bueltatuko du, jasotzen duen
		// pasahitza eta bezeroarena kointzidentzien dutenean.
		boolean emaitza = false;
		if (this.pasaHitza == pPasaHitza)
			emaitza = true;
		return emaitza;
	}

	public boolean idBerdinaDu(int pIdBezeroa)
	{
		boolean emaitza = false;
		if (this.idBezeroa == pIdBezeroa)
			emaitza = true;
		return emaitza;
	}

	public boolean bereziaDa()
	{
		boolean emaitza = false;
		if (this.berezia == true)
			emaitza = true;
		return emaitza;
	}

	public void saldoaEguneratu(String pPasaHitza, double pDiruKop)
	{
		// Alde batetik, bezeroaren pasahitza eta jasotakoa berdinak diren
		// konprobatzen du. Gero, parametro bezala duen diru kopurua bezeroaren
		// saldoa baino handiagoa ez izatea baieztatzen du, eta horrela ez
		// balitz, saldoa ez luke ukituko. Edozein kasutan, pantailatik mezu bat
		// bueltatuko du burutu den eragiketa ondo ala txartu bukatu den
		// adierazteko. Ondo burutu bada, “zure saldo berria XXX da”
		// pantailaratuz, eta gaizki burutu bada, “saldoa ezin izan da aldatu”
		// inprimatuko luke.
		//double dirua = pDiruKop;
		
		
		if (this.pasaHitzaBaieztatu(pPasaHitza))
		{
			if (this.saldoa < pDiruKop)
				//TODO
		}

	}

	public double saldoaLortu(String pPasaHitza)
	{
		// Alde batetik, bezeroaren pasahitza eta jasotakoa berdinak diren
		// konprobatzen du. PasaHitza okerra bada 0 bueltatuko du
		
		double emaitza = 0.0;
		if (this.pasaHitza == pPasaHitza)
			emaitza = this.saldoa;
		return emaitza;
	}
}
