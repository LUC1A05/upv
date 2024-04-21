package org.pmobo.packlaborategia6;

public abstract class Zergaduna extends Kontzeptua
{
	private double zerga = 0.05;
	
	public Zergaduna(double pGordina, int pOrduKop)
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
