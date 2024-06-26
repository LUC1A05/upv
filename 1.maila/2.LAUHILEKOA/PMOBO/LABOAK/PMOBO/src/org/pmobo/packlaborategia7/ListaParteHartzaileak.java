package org.pmobo.packlaborategia7;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaParteHartzaileak
{
	// atributuak
	private ArrayList<ParteHartzailea>lista;
	
	// eraikitzailea
	
	/**
	 * post: hasieratzen du parte hartzaileen zerrenda (huts zerrenda bat bezala)
	 */
	public ListaParteHartzaileak()
	{
		this.lista = new ArrayList<ParteHartzailea>();
	}
	
	// beste metodoak
	
	/**
	 * @return zerrendako pPos posizioan dagoen parte hartzailea
	 *   post:  pPos parametroa balioduna ez bada,  mezu bat pantailaratzen da kontsolatik eta null bueltatzen da
	 *          Zerrendako posizioak 0-tik hasten dira eta (n-1)ean bukatzen dira, n baldin badira zerrendan
	 *          dauden parte hartzaileak 
	 *         
	 */
	public ParteHartzailea getParteHartzaileaPosizioan(int pPos)
	{
		int posMax = this.lista.size();
		if (pPos > posMax)
		{
			return null;
		}
		return this.lista.get(pPos);
	}
	
	/**
	 * @return zerrendan dagoen parte hartzaileen kopurua
	 */
	public int parteHartzaileenKopurua()
	{
		int kont = 0;
		Iterator<ParteHartzailea>itr = this.lista.iterator();
		while (itr.hasNext())
		{
			kont ++;
		}
		return kont;
	}

		
	/**
	 * @return zerrendan dagoen Tronularien parte hartzaileen kopurua
	 */
	public int tronularienKopurua()
	{
		int kont = 0;
		ParteHartzailea ph;
		Iterator<ParteHartzailea>itr = this.lista.iterator();
		while (itr.hasNext())
		{
			ph = itr.next();
			if(ph instanceof Tronularia)
			{
				kont ++;
			}
		}
		return kont;
	}
	
	/**
	 * @return zerrendan dagoen Pretendenteen parte hartzaileen kopurua
	 */
	public int pretendenteenKopurua()
	{
		int kont = 0;
		ParteHartzailea ph;
		Iterator<ParteHartzailea>itr = this.lista.iterator();
		while (itr.hasNext())
		{
			ph = itr.next();
			if(ph instanceof Pretendentea)
			{
				kont ++;
			}
		}
		return kont;
	}
	
	/**
	 * @param pParteHartzailea
	 *            post: pParteHartzailea gehitzen du zerrendan
	 */
	public void gehitu(ParteHartzailea pParteHartzailea)
	{
		this.lista.add(pParteHartzailea);
	}

	/**
	 * @param pParteHartzailea
	 * @return pParteHartzailea zerrendan dagoen ala ez esaten digun boolearra 
	 */
	public boolean baDago(ParteHartzailea pParteHartzailea)
	{
		Iterator<ParteHartzailea>itr = this.lista.iterator();
		boolean badago = false;
		while(itr.hasNext() && !badago)
		{
			ParteHartzailea ph = itr.next();
			if (ph == pParteHartzailea)
			{
				badago = true;
			}
		}
		return badago;
	}
	
	public void inprimatuZerrenda()
	{
		Iterator<ParteHartzailea>itr = this.lista.iterator();
		System.out.println("Lista hurrengoa da: \n__________________________");
		int i = 1;
		while (itr.hasNext())
		{
			ParteHartzailea ph = itr.next();
			System.out.println("-> " + i + ". Izena: " + ph.getIzena());
			System.out.println("      Puntuazioa: " + ph.getPuntuazioa());
			System.out.println("__________________________");
			i++;
		}
	}
}
