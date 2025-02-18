package org.pmobo.packlaborategia8;

public class Roster
{
	// atributu eta Singleton patroia

	private ParteHartzaileZerrenda zerrenda;

	// eraikitzailea
	
	/**
	 * zerrenda hasieratu
	 */
	... Roster() ...
	
	

	/**
	 * @return instantzia bakarra lortu
	 */
	... Roster getRoster() ...
	

	
	/**
	 * 
	 * @return parte hartzaile kopurua bueltatu
	 */
	public int parteHartzaileKopurua() ...
	
	
	
	/**
	 * 
	 * @param pIzena
	 * @param pId
	 * @param pAdina
	 * 
	 * Rosterrean parteHartzailea gehituko du, parametroetatik jasotako informazioaz. AdinTxikikoaException
	 * jasotzen badu, ez du ezer egingo, hau da, ez da parteHartzailea gehituko.
	 * IdaExistitzenDaException jasotzen badu, berriz saiatuko da parteHartzaile hori
	 * sartzen baina pId+1 eginez, ezin badu pId+2 eginez etab… id libre bat bilatu arte.  	                     
  	 */
	public void addParteHartzailea(String pIzena, int pId, int pAdina) ...
	
	
		
	/**
	 * 
	 * @param pId
	 * @return rosterreko ParteHartzailea pId duena
	 *         ez badago null
	 */
	public ParteHartzailea parteHartzaileaIdzBilatu(int pId) ...
	
	
	
	/**
	 * zerrenda ustuko duen metodoa, jUnitak egiteko bideratu nahi da metodo hau.
	 */
	public void reset() ...
	
	
	
}

