package org.pmobo.packlaborategia6;

public abstract class Kontzeptua 
{
	private double gordina;
	private int orduKop;
	
	protected Kontzeptua(double pGordina, int pOrduKop)
	{
		this.gordina = pGordina;
		this.orduKop = pOrduKop;
	}
	
	public double getSoldata(int antzinakotazuna, String erantzunkizuna, int sukuId)
	{
		double soldata = 0;
		
		soldata = this.gordina * this.orduKop;
		
		return soldata;
	}
}
