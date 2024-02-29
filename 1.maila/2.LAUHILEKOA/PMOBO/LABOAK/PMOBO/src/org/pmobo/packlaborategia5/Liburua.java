package org.pmobo.packlaborategia5;

public class Liburua
{
	
	// atributuak
	private String titulua;
	private String idazlea;
	private int idLiburua;

	// eraikitzailea
	public Liburua(String pTitulua, String pIdazlea, int pIdLiburua)
	{
		this.titulua = pTitulua;
		this.idazlea = pIdazlea;
		this.idLiburua = pIdLiburua;
	} 
	
	// beste metodoak
	
	public boolean idHauDu(int pIdLiburua)
	{
		boolean badu = false;
		if (this.idLiburua == pIdLiburua)
			badu = true;
		return badu;
	}
	
	public boolean idBerdinaDute (Liburua pLiburua)
	{
		boolean badu = false;
		if (this.idLiburua == pLiburua.idLiburua)
			badu = true;
		return badu;
	}
	
	public void inprimatu() 
	{
		System.out.println("* "+this.titulua+", "+ this.idazlea + "-ek idatzia");
	}
}
