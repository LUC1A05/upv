package org.pmobo.packlaborategia7;

public class Pretendentea extends ParteHartzailea
{
	// eraikitzailea
	public Pretendentea(String pIzena, int pPuntuazioa)
	{
		super(pIzena, pPuntuazioa);
	}

	/**
	 *  @return Booleano bat, pretendentearen izendatuen zerrendak enuntziatuan zehaztutako arauak 
	 *  		betetzen dituen adierazten duena. Hau da, pretendentearen p puntuazioak zero edo handiagoa izan behar du, 
	 *  		eta bere izendatuen zerrendan ezin da egon p pretendente baino gehiago, ezta tronero bat baino gehiago ere.
	 */
	@Override
	public boolean baldintzakBeteDitu()
	{
		boolean bete = true;
		int puntuazioa = this.getPuntuazioa();
		if (puntuazioa < 0)
		{
			return !bete;
		}
		if (this.izendatutakoPretendenteenKopurua() > puntuazioa)
		{
			return !bete;
		}
		if (this.izendatutakoTronularienKopurua() > 1)
		{
			return !bete;
		}
		return bete;
	
	}

	/**
	 *  @param pParteHartzaileIzendatua
	 *   post: pParteHartzaileIzendatua izendapenen kopurua 1 edo 5 igoko da, egoeraren arabera:
	 *   	   pParteHartzaileIzendatua egungo parte hartzailea izendatu ez duen pretendentea edo tronularia bada, 1 (izendapen normala) gehituko da, 
	 *         baina pParteHartzaileIzendatua tronularia bada eta, aldi berean, egungo pretendentea izendatu badu, orduan, pParteHartzaileIzendatuak jasotako
	 *         izendapen kopurua bider 5 (izendapen boskoitza) biderkatuko da.
	 */
	@Override
	protected void izendapenaAplikatu(ParteHartzailea pParteHartzaileIzendatua)
	{
		if (pParteHartzaileIzendatua instanceof Pretendentea)
		{
			pParteHartzaileIzendatua.gehituJasotakoIzendapenak(1);
			return;
		}
		else if (pParteHartzaileIzendatua instanceof Tronularia && !((Tronularia) pParteHartzaileIzendatua).badagoBereIzendatuenArtean(this))
		{
			pParteHartzaileIzendatua.gehituJasotakoIzendapenak(1);
			return;
		}
		else
			pParteHartzaileIzendatua.gehituJasotakoIzendapenak(5);
	}
}
