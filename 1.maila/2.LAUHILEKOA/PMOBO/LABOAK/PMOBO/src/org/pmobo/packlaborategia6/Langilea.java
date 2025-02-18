package org.pmobo.packlaborategia6;

public class Langilea 
{
	private int id;
	private String izena;
	private String abizena;
	private KontzeptuZerrenda zerrenda;
	private int antzinakotasuna;
	private String erantzunkizuna;
	private int sukuId;
	
	
	public Langilea(int pId, String pIzena, String pAbizena, KontzeptuZerrenda pZerrenda, int pAntzinakotasuna, String pErantzunkizuna, int pSukuId)
	{
		this.id = pId;
		this.izena = pIzena;
		this.abizena = pAbizena;
		this.zerrenda = pZerrenda;
		this.antzinakotasuna = pAntzinakotasuna;
		this.erantzunkizuna = pErantzunkizuna;
		this.sukuId = pSukuId;
	}
	
	public double getSoldata()
	{
		return this.zerrenda.getSoldata(this.antzinakotasuna, this.erantzunkizuna, this.sukuId);
	}
	public String getIzena()
	{
		return this.izena;
	}
}
