package org.pmobo.packlaborategia6;

public class Extra extends Zergaduna 
{
	private double zerga = 0.1;
	public Extra(double pGordina, int pOrduKop)
	{
		super(pGordina, pOrduKop);
	}
	
	public double getSoldata(int antzinakotazuna, String erantzunkizuna, int sukuId)
	{
		double soldata = 0;
		soldata = super.getSoldata(antzinakotazuna, erantzunkizuna, sukuId)*(1-zerga);
		return soldata;
	}
}
