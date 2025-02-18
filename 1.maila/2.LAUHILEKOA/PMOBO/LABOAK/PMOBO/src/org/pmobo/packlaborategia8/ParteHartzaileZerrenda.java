package org.pmobo.packlaborategia8;

import java.util.ArrayList;
import java.util.Iterator;

public class ParteHartzaileZerrenda
{
	// atributuak

	private ArrayList<ParteHartzailea>zerrenda;

	// eraikitzailea
	
	/**
	 * ArrayLista Hasieratu
	 */
	public ParteHartzaileZerrenda() {
		this.zerrenda = new ArrayList<ParteHartzailea>();
	}

	
	
	/**
	 * 
	 * @return iteratzailea
	 */
	private Iterator<ParteHartzailea> getIterator(){
		return this.zerrenda.iterator();
	}

	
	
	/**
	 * 
	 * @return zerrendako parteHartzaile kopurua
	 */
	public int parteHartzaileKopurua() {
		return this.zerrenda.size();
	}

	
	/**
	 * 
	 * @param pId
	 * @return pId duen ParteHartzailea bueltatauko du
	 */
	private boolean idaDuenParteHartzaileaDago(int pId) {
		Iterator<ParteHartzailea>itr = this.getIterator();
		boolean badago = false;
		
		while(itr.hasNext() && !badago) {
			ParteHartzailea ph = itr.next();
			if(ph.idaDu(pId))
			{
				badago = true;
			}
		}
		return badago;
	}

	

	/**
	 * 
	 * @param pIzena
	 * @param pId
	 * @param pAdina
	 * @exception IdaExistitzenDaException jaurtiko du pId iada baldin badago 
	 *            Ez du AdinTxikikoaException tratatuko
	 *            Dena ondo badoa pIzena, pId, eta pAdina duen ParteHartzailea gehituko da
	 * @throws AdinTxikikoaException 
	 *                    
	 */
	public void addParteHartzailea(String pIzena, int pId, int pAdina) throws IdaExistitzenDaException, AdinTxikikoaException{
		if(this.idaDuenParteHartzaileaDago(pId))
		{
			throw new IdaExistitzenDaException();
		}
		ParteHartzailea ph = new ParteHartzailea(pIzena, pId, pAdina);	
		this.zerrenda.add(ph);
	}
	
	

	/**
	 * 
	 * @param pId
	 * @return id-a duen ParteHartzailea bueltatuko du
	 * @exception EzAurkituaException jaurtiko du ez badago
	 */
	public ParteHartzailea parteHartzaileaIdzBilatu(int pId) throws EzAurkituaException{
		Iterator<ParteHartzailea>itr = this.getIterator();
		ParteHartzailea ph = null;
		Boolean aurkitua = false;
		
		while(itr.hasNext() && !aurkitua)
		{
			ParteHartzailea ph2 = itr.next();
			if(ph2.idaDu(pId))
			{
				ph = ph2;
				aurkitua = true;
			}
		}
		if(ph == null)
		{
			throw new EzAurkituaException();
		}
		return ph;
	}
		
	
}

