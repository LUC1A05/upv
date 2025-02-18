package org.pmobo.packlaborategia8;

public class Roster
{
	// atributu eta Singleton patroia

	private ParteHartzaileZerrenda zerrenda;
	private static Roster nireRoster = null;

	// eraikitzailea
	
	/**
	 * zerrenda hasieratu
	 */
	private Roster() {
		zerrenda = new ParteHartzaileZerrenda();
	}
	
	

	/**
	 * @return instantzia bakarra lortu
	 */
	public static Roster getRoster() {
		if(nireRoster == null)
		{
			nireRoster = new Roster();
		}
		return nireRoster;
	}
	

	
	/**
	 * 
	 * @return parte hartzaile kopurua bueltatu
	 */
	public int parteHartzaileKopurua() {
		return this.zerrenda.parteHartzaileKopurua();
	}
	
	
	
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
	public void addParteHartzailea(String pIzena, int pId, int pAdina) {
		try {
			this.zerrenda.addParteHartzailea(pIzena, pId, pAdina);
		}catch(AdinTxikikoaException e){
			System.out.println("Error! Partehartzailea adin txikikoa da");
		}catch(IdaExistitzenDaException e)
		{
			System.out.println("Error! Partehartzailearen id-a hartuta dago, id berria "+(pId+1)+" da.");
			pId ++;
			addParteHartzailea(pIzena, pId, pAdina);
		}
	}
	
	
		
	/**
	 * 
	 * @param pId
	 * @return rosterreko ParteHartzailea pId duena
	 *         ez badago null
	 */
	public ParteHartzailea parteHartzaileaIdzBilatu(int pId) {
		try {	
			return this.zerrenda.parteHartzaileaIdzBilatu(pId);
		}catch(EzAurkituaException e){
			return null;
		}
		}
	
	
	
	/**
	 * zerrenda ustuko duen metodoa, jUnitak egiteko bideratu nahi da metodo hau.
	 */
	public void reset() {
		this.zerrenda = new ParteHartzaileZerrenda();
	}
}

