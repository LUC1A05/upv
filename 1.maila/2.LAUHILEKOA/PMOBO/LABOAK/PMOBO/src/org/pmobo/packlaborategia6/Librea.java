package org.pmobo.packlaborategia6;

public class Librea extends Kontzeptua 
{
	private String desk;
	
	public Librea(double pGordina, int pOrduKop, String pDesk)
	{
		super(pGordina, pOrduKop);
		this.desk = pDesk;
	}
	
	public double getSoldata(int antzinakotazuna, String erantzunkizuna, int sukuId)
	{
		return super.getSoldata(antzinakotazuna, erantzunkizuna, sukuId);
		
	}
}