package org.pmobo.packlaborategia7;

public abstract class ParteHartzailea
{
	// atributuak
	private String izena;
	private int puntuazioa;
	private int izendapenak;
	private ListaParteHartzaileak izendatuenZerrenda;


	// eraikitzailea

	/**
	 * 
	 * @param pIzena
	 * @param pPuntuazioa
	 * @param pIzendapenak
	 *            post: ParteHartzailea klaseko objektu berri bat abiarazten da: izena pIzena, puntuazioa pPuntuazioa, 
	 *            		zero izendapen, eta izendapenen zerrenda hutsik dago
	 */
	protected ParteHartzailea (String pIzena, int pPuntuazioa)
	{
		this.izena = pIzena;
		this.puntuazioa = pPuntuazioa;
		this.izendapenak = 0;
		this.izendatuenZerrenda = new ListaParteHartzaileak();
	}


	// beste metodoak

	/** 
	 * 
	 * @return parte hartzaileren izena
	 */
	public String getIzena()
	{
		return this.izena;
	}

	/** 
	 * 
	 * @return parte hartzailearen puntuazioa
	 */
	protected int getPuntuazioa()
	{
		return this.puntuazioa;
	}

	/** 
	 * 
	 * @return parte hartzailearen izendatuen zerrenda
	 */
	protected ListaParteHartzaileak getListaIzendatuak()
	{
		return this.izendatuenZerrenda;
	}

	/** 
	 * 
	 * post: parte hartzailearen izendapenak atributua zerora eraman
	 */
	public void zeroanJarriBereIzendapenak()
	{
		this.izendapenak = 0;
	}

	/**
	 * 
	 * @return parte hartzailearen jasotako izendapenak
	 */
	public int jasotakoIzendapenKopurua()
	{
		return this.izendapenak;
	}

	/** 
	 * 
	 * @param pKantitatea
	 * post: parte hartzailearen jasotako izendapenei pKantitatea gehitzen zaie.
	 */
	public void gehituJasotakoIzendapenak (int pKantitatea)
	{
		this.izendapenak += pKantitatea;
	}

	/**
	 *  @return Egungo parte hartzailearen izendatuen zerrendan dauden tronularien kopurua.    
	 */
	public int  izendatutakoTronularienKopurua()
	{
		return this.izendatuenZerrenda.tronularienKopurua();
	}
	
	/**
	 *  @return Egungo parte hartzailearen izendatuen zerrendan dauden pretendenteen kopurua.    
	 */
	public int izendatutakoPretendenteenKopurua()
	{
		return this.izendatuenZerrenda.pretendenteenKopurua();
	}
	
	
	/**
	 * @param pIzendatua
	 *   post:  Egungo parte hartzailearen izendatuen zerrendan pIzendatua gehitzen da, salbu eta izendatua dagoeneko zerrendan badago
	 *   		 edo egungo parte hartzailea bada (hau da, bere burua izendatu duela).
	 *   		 Bi egoera horietakoren bat gertatzen bada, pantailatik mezu bat agertuko da, eta ez da gehituko egungo parte hartzailearen izendatuen zerrendan.

	 */
	public  void izendatu(ParteHartzailea pIzendatua)
	{
		if (this.izendatuenZerrenda.baDago(pIzendatua) || this.izena == pIzendatua.izena)
		{
			System.out.println("Ezin da partehartzailea gehitu, zerrendan dagoelako edo zu zarelako");
			return;
		}
		this.izendatuenZerrenda.gehitu(pIzendatua);
	}


	/**
	 *   post: parte hartzailearen izendatuen zerrenda errekorritzen da eta bakoitzari dagokion izendapena aplikatzen da.
	 *         
	 */
	public void izendapenakAplikatu()
	{
		int i = 0;
		this.izendatuenZerrenda.getParteHartzaileaPosizioan(i);
	}
		
	/**
	 *  @return  Parte Hartzailearen izendatuen zerrendak enuntziatuan zehaztutako arauak betetzen dituen adierazten duen boolearra.
	 *  			Metodo abstraktu bat da, ParteHartzailea klasearen azpiklase bakoitzak modu ezberdinean inplemetatzen duelako.
	 */
	protected abstract boolean baldintzakBeteDitu();

	/**
	 *  @param pParteHartzaileIzendatua
	 *   post:  Egoeraren arabera, pParteHartzaileIzendatuaren izendapenen kopurua 1, 2 edo 5 handituko da.
	 *   		Metodo abstraktu bat da, ParteHartzailea klasearen azpiklase bakoitzak modu ezberdinean inplemetatzen duelako.
	 */
	protected abstract void izendapenaAplikatu (ParteHartzailea pParteHartzaileIzendatua);

}
