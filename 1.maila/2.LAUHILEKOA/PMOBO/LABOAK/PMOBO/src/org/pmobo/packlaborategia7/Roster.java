package org.pmobo.packlaborategia7;

import java.util.ArrayList;
import java.util.Iterator;

public class Roster
{
	// atributuak
	private ArrayList<ParteHartzailea> lista;
	private static Roster nireRoster = null;


	// eraikitzailea
	private Roster() 
	{
		this.lista = new ArrayList<ParteHartzailea>();
	}

	// beste metodoak
	
	/**
	 * @return Roster-ren instantzia bakarra
	 */
	public static Roster getRoster()
	{
		if (nireRoster == null)
		{
			nireRoster = new Roster();
		}
		return nireRoster;
	}

	/**
	 * 
	 * @return parte hartzaileen Roster-ren iteradorea
	 */
	private Iterator<ParteHartzailea> getIteradorea()
	{
		return this.lista.iterator();
	}
	
	/**
	 * 
	 * @param pIzena
	 * @return Roster-ren parte hartzailea, pIzena izena duena
	 *         Ez badago, null bueltatzen da
	 */
	private ParteHartzailea bilatuParteHartzaileaIzenaz(String pIzena)
	{
		Iterator<ParteHartzailea>itr = getIteradorea();
		boolean badago = false;
		while (itr.hasNext() && !badago)
		{
			ParteHartzailea pH = itr.next();
			if (pH.getIzena() == pIzena)
			{
				return pH;
			}
		}
		return null;
	}
	
	/**
	 * 
	 * @param pParteHartzaile
	 * 
	 *  
	 *   post: parte hartzailea gehitzen da Roster-rean, baldin eta ez badago pParteHartzaile-ren izena bera duen parte hartzailerik jadanik.
	 *   	   Horrela izanda, ez da gehituko, eta mezu bat pantailaratzen da.
	 *         
	 */
	public void gehituParteHartzailea(ParteHartzailea pParteHartzailea)
	{
		if (this.bilatuParteHartzaileaIzenaz(pParteHartzailea.getIzena()) != null)
		{
			System.out.println("Ezin da parte hartzailea gehitu, jadanik izen bereko parte hartzailea dagoelako.");
			return;
		}
		this.lista.add(pParteHartzailea);
	}
	/**
	 * 
	 * @return boolear balorea, esaten diguna Roster-ren parte hartzaile guztieen izendatuen zerrendak enuntziatuak emandako baldintzak betetzen duen ala ez.
	 *  
	 *        
	 */
	private boolean baldintzakBetetzenDira()
	{
		boolean bete = true;
		Iterator<ParteHartzailea>itr = getIteradorea();
		while (itr.hasNext())
		{
			ParteHartzailea pH = itr.next();
			if (!(pH.baldintzakBeteDitu()))
			{
				bete = false;
				return bete;
			}
		}
		return bete;
	}

	/**
	 * @return Kanporagarriak diren parte hartzaileen zerrendan (KaleratuenParteHartzaileenLista) sartzeko atalasea, hau da, 
	 * 			Tronularia motako parte hartzaile batek jasotako gehieneko izendapen kopurua.
	 * 
	 */
	private int atalaseaKalkulatu()
	{
		Iterator<ParteHartzailea>itr = getIteradorea();
		int max = 0;
		while(itr.hasNext())
		{
			ParteHartzailea ph = itr.next();
			if (ph instanceof Tronularia && ph.jasotakoIzendapenKopurua() > max)
			{
				max = ph.jasotakoIzendapenKopurua();
			}
		}
		return max;
	}

	/**
	 * @return Kanporagarriak diren parte hartzaileen zerrenda, enuntziatuan azaldutakoaren arabera.

	 */
	public ListaParteHartzaileak getKaleratuenParteHartzaileenLista()
	{
		Iterator<ParteHartzailea>itr = getIteradorea();
		ListaParteHartzaileak lp = new ListaParteHartzaileak();
		ParteHartzailea ph, ph2;
		
		//baldintzak bete diren konprobatzen da
		if (!(this.baldintzakBetetzenDira()))
		{
			System.out.println("Baldintzak ez dira betetzen.");
			return null;
		}
		
		//izendapenak aplikatu
		while (itr.hasNext())
		{
			ph = itr.next();
			Iterator<ParteHartzailea>itr2 = getIteradorea();
			while (itr2.hasNext())
			{
				ph2 = itr2.next();
				if (ph.getListaIzendatuak().baDago(ph2))
				{
					ph.izendapenaAplikatu(ph2);
				}
			}
		}
		
		int atalasea = this.atalaseaKalkulatu();
		
		//kaleratuen lista osatzen da.
		itr = getIteradorea();
		while (itr.hasNext())
		{
			ph = itr.next();
			if (ph.jasotakoIzendapenKopurua() >= atalasea)
			{
				lp.gehitu(ph);
			}
		}
		return lp;
	}
	
	/**
	 * parte hartzaileen Roster-ra hutsik uzten duena
	 */
	public void erreseteatu()
	{
		this.lista=new ArrayList<ParteHartzailea>();
	}
}
