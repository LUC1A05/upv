package org.pmobo.packlaborategia7;


public class Tronularia extends ParteHartzailea
{
	// eraikitzailea
	public Tronularia (String pIzena, int pPuntuazioa)
	{
		super(pIzena, pPuntuazioa);
	}

	// beste metodoak
		
	/**
	 *  @return Tronulariaren izendatuen zerrendak enuntziatuan zehaztutako arauak betetzen dituen adierazten duen boolear.
	 *  		Hau da: tronulariaren p puntuazioak zero edo handiagoa izan behar du, bere izendatuen zerrendan ezin dira p lehiakide baino gehiago egon, 
	 *  		eta horiek guztiek tronulariak edo pretendenteak izan behar dute (hau da, ezin dira nahastu).      
	 *    
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
		if (this.izendatutakoPretendenteenKopurua() > puntuazioa || this.izendatutakoTronularienKopurua() > puntuazioa)
		{
			return !bete;
		}
		if (this.izendatutakoPretendenteenKopurua() >= 1 && this.izendatutakoTronularienKopurua() >= 1)
		{
			return !bete;
		}
		return bete;
		
	}

	
	/**
	 *  @param pParteHartzaileIzendatua
	 *  post: pParteHartzaileIzendatua-ren izendapenen kopurua 2 gehitzen da, Tronulari baten izendapenek beti zigortzen baitute bikoitza.
	 */
	@Override
	protected void izendapenaAplikatu(ParteHartzailea pParteHartzaileIzendatua) 
	{
		pParteHartzaileIzendatua.gehituJasotakoIzendapenak(2);
	}

	
	/**
	 *  @param pPretendentea
	 *  @return  Pretendentea egungo tronulariaren izendatuen zerrendan dagoen ala ez adierazten duen boolearra.
	 */
	public boolean badagoBereIzendatuenArtean(Pretendentea pPretendentea)
	{
		return super.getListaIzendatuak().baDago(pPretendentea);
	}

}
