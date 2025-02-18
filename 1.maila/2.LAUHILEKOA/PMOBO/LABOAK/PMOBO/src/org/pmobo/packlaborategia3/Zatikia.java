package org.pmobo.packlaborategia3;


public class Zatikia implements IZatikia
{       //atributuak
	private int zenbakitzailea;
	private int izendatzailea;
	
	public Zatikia(int pZenb, int pIzen)
	{
		if (pIzen != 0)
			{
				this.izendatzailea = pIzen;
				this.zenbakitzailea = pZenb;
			}
		else
		{
			System.out.println("Ezin daiteke izendatzailearen balioa 0 izan dezakeen zatikirik sortu ...");
			this.izendatzailea = 1;
			this.zenbakitzailea = pZenb;
		}
	}


	public int getZenbakitzailea()
	{
		return this.zenbakitzailea;
	}

	public int getIzendatzailea()
	{
		return this.izendatzailea;
	}
		
	// metodo hau ezkutatzea komeni da, pribatua egitea!
	private int zkh()
	{/**
         /* zatitzaile komunetako handiena topatu
         **/
		int lag,a,b;
		a = this.izendatzailea;
		b = this.zenbakitzailea;
		if (a < b)
		{
			lag = a;
			a = b;
			b = lag;
		}
		while (b != 0)
		{
			lag = b;
			b = a % b;
			a = lag;
		}
		return a;
	}
	
	public void sinplifikatu()
	{
		int lag = this.zkh();
		this.izendatzailea = this.izendatzailea/lag;
		this.zenbakitzailea = this.zenbakitzailea/lag;
		if (this.izendatzailea < 0)
		{
			this.izendatzailea *= -1;
			this.zenbakitzailea *= -1;
		}
	}
		
	public Zatikia gehitu(Zatikia pZatikia)
	{
		Zatikia emaitza;
		int izendatzaileBerria = 0;
		int zenbakitzaileBerria = 0;
		this.sinplifikatu();
		pZatikia.sinplifikatu();
		if(this.izendatzaileBerdinaDu(pZatikia))
		{
			zenbakitzaileBerria = this.zenbakitzailea + pZatikia.getZenbakitzailea();
		}
		else
		{
			zenbakitzaileBerria = (this.zenbakitzailea * pZatikia.getIzendatzailea()) + (pZatikia.getZenbakitzailea() * this.izendatzailea);
			izendatzaileBerria = this.izendatzailea * pZatikia.getIzendatzailea();
		}
		emaitza = new Zatikia(zenbakitzaileBerria,izendatzaileBerria);
		emaitza.sinplifikatu();
		return emaitza;
	}
	
	
	public Zatikia kendu(Zatikia pZatikia)
	{
		Zatikia emaitza;
		int izendatzaileBerria = 0;
		int zenbakitzaileBerria = 0;
		this.sinplifikatu();
		pZatikia.sinplifikatu();
		if(this.izendatzaileBerdinaDu(pZatikia))
		{
			zenbakitzaileBerria = this.zenbakitzailea - pZatikia.zenbakitzailea;
		}
		else
		{
			zenbakitzaileBerria = (this.zenbakitzailea * pZatikia.izendatzailea) - (pZatikia.zenbakitzailea * this.izendatzailea);
			izendatzaileBerria = this.izendatzailea * pZatikia.izendatzailea;
		}
		emaitza = new Zatikia(zenbakitzaileBerria,izendatzaileBerria);
		emaitza.sinplifikatu();
		return emaitza;
	}
	
	public Zatikia biderkatu(Zatikia pZatikia)
	{
		Zatikia emaitza;
		int izendatzaileBerria = 0;
		int zenbakitzaileBerria = 0;
		this.sinplifikatu();
		pZatikia.sinplifikatu();
		zenbakitzaileBerria = this.zenbakitzailea * pZatikia.zenbakitzailea;
		izendatzaileBerria = this.izendatzailea * pZatikia.izendatzailea;
		emaitza = new Zatikia(zenbakitzaileBerria,izendatzaileBerria);
		emaitza.sinplifikatu();
		return emaitza;
	}
	
	public Zatikia zatitu(Zatikia pZatikia)
	{
		Zatikia emaitza;
		int izendatzaileBerria = 0;
		int zenbakitzaileBerria = 0;
		this.sinplifikatu();
		pZatikia.sinplifikatu();
		zenbakitzaileBerria = this.zenbakitzailea * pZatikia.izendatzailea;
		izendatzaileBerria = this.izendatzailea * pZatikia.zenbakitzailea;
		emaitza = new Zatikia(zenbakitzaileBerria,izendatzaileBerria);
		emaitza.sinplifikatu();
		return emaitza;
	}
	
	public boolean berdinaDa(Zatikia pZatikia)
	{
		boolean berdina = false;
		this.sinplifikatu();
		pZatikia.sinplifikatu();
		if (this.izendatzaileBerdinaDu(pZatikia)&& this.zenbakitzaileBerdinaDu(pZatikia))
			berdina = true;
		return berdina;
	}
			
	public boolean handiagoaDa(Zatikia pZatikia)
	{
		boolean handi = false;
		if ((this.zenbakitzailea / this.izendatzailea) > (pZatikia.zenbakitzailea/pZatikia.izendatzailea))
			handi = true;
		return handi;
	}
	
	public boolean txikiagoaDa(Zatikia pZatikia)
	{
		boolean txiki = false;
		if ((this.zenbakitzailea / this.izendatzailea) < (pZatikia.zenbakitzailea/pZatikia.izendatzailea))
			txiki = true;
		return txiki;
	}
	
    public boolean izendatzaileBerdinaDu(Zatikia pZatikia){
		boolean berdina = false;
		
    	if (this.izendatzailea == pZatikia.izendatzailea)
		{
			berdina = true;
		}
    	return berdina;
	}
    
    public boolean zenbakitzaileBerdinaDu(Zatikia pZatikia)
    {
    	boolean berdina = false;
		
    	if (this.zenbakitzailea == pZatikia.zenbakitzailea)
		{
			berdina = true;
		}
    	return berdina;
	}	
}
