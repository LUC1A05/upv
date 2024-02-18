package org.pmobo.packlaborategia1;

public class Kotxea {
	private String matrikula;
	private String markaModeloa;
	private Pertsona jabea;
	
	public Kotxea(String pMatrikula, String pMarkaModeloa, Pertsona pJabea)
	{
		this.matrikula = pMatrikula;
		this.markaModeloa = pMarkaModeloa;
		this.jabea = pJabea;
	}
	public Boolean jabeaAlDa(Pertsona pJavePosible)
	{
		Boolean da = false;
		
		if (this.jabea.getIdPertsona() == pJavePosible.getIdPertsona())
		{
			da = true;
		}
		return da;
	}
	public void aldatuJabea(Pertsona pJabea)
	{
		this.jabea = pJabea;
	}
}
