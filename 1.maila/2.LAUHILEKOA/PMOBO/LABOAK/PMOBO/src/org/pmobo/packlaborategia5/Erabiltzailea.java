package org.pmobo.packlaborategia5;

public class Erabiltzailea
{
	//atributuak
	private int idErabiltzailea;
	private String izenOsoa;
	private int maxLiburuak;
	private ListaLiburuak liburuMailegatuak;
	
	//eraikitzailea
	
	public Erabiltzailea(String pIzenOsoa, int pIdErabiltzaile)
	{
		this.idErabiltzailea = pIdErabiltzaile;
		this.izenOsoa = pIzenOsoa;
		this.maxLiburuak = 3;
		this.liburuMailegatuak = new ListaLiburuak();
	}
	
	// beste metodoak
	
	public boolean idHauDu(int pId)
	{
		boolean badago = false;
		if (this.idErabiltzailea == pId)
			badago = true;
		return badago;
	}
	
	public boolean idBerdinaDute(Erabiltzailea pErabiltzailea)
	{
		boolean badago = false;
		if (this.idErabiltzailea == pErabiltzailea.idErabiltzailea)
			badago = true;
		return badago;
	}
	
	public boolean mailegatzekoMaximoaGainditua()
	{
		boolean max = false;
		if (this.liburuMailegatuak.listarenTamaina() >= this.maxLiburuak)
			max = true;
		return max;
		
	}
	
	public void gehituLiburua(Liburua pLiburua)
	{
		this.liburuMailegatuak.gehituLiburua(pLiburua);
	}
	
	public void kenduLiburua(Liburua pLiburua)
	{
		this.liburuMailegatuak.kenduLiburua(pLiburua);
	}
	
	public boolean maileguanDu(Liburua pLiburua)
	{
		boolean badago = false;
		if (this.liburuMailegatuak.badago(pLiburua))
			badago = true;
		return badago;
	}
	
	public void inprimatu()
	{
		System.out.println("ID: "+ this.idErabiltzailea+ ": "+this.izenOsoa);
		if (this.liburuMailegatuak.listarenTamaina()>0)
		{
			System.out.println("---> "+this.liburuMailegatuak.listarenTamaina()+" titulu hauek dauzka maileguan:");
			this.liburuMailegatuak.inprimatu();
		}
		else
			System.out.println("---> Ez dauka libururik maileguan.");
		
	}

}
