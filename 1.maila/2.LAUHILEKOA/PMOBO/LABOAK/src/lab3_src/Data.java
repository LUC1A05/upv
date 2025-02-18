package org.pmobo.packlaborategia3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Data implements IData
{	
	//atributuak
	private int urtea;
	private int hilabetea;
	private int eguna;
	
	
	//eraikitzailea
	public Data(int pUrtea, int pHilabetea, int pEguna)
	{
		this.urtea = pUrtea;
		this.hilabetea = pHilabetea;
		this.eguna = pEguna;
	
		if (!this.dataZuzenaDa())
		{
			Calendar c = new GregorianCalendar();
			this.eguna = c.get(Calendar.DATE);	  // egunak 1-etik hasten dira
			this.hilabetea = c.get(Calendar.MONTH)+1; // hileak, aldiz, 0-tik hasten dira 
			this.urtea = c.get(Calendar.YEAR);			
		}
		
	}
		
	//beste metodoak

	@Override
	public String toString()
	{
		String strUrtea = String.format("%04d", this.urtea); 
		String strHilabetea = String.format("%02d", this.hilabetea);
		String strEguna = String.format("%02d", this.eguna);
		
		return strUrtea + "/" + strHilabetea + "/" + strEguna;
	}
	
	
	private boolean dataZuzenaDa()
	{
		
		//objektuaren data egokia den ala ez itzultzen du.
		
		boolean egokia=true;
		//TODO
		return egokia;
	}

	private boolean bisustua ()
	{
		boolean bisustua=false;
		//TODO
		return bisustua;
	}

	@Override
	public void dataGehitu() 
	{
	    //TODO
	}
	
	@Override
	public void dataKendu() 
	{
	    //TODO
	}
	
	private int hilabeterarenEgunKopurua()
	{
		//metodo laguntzaile honek hilabete bakoitzaren azken egun posiblea bueltatzen du, horrela lana murrizteko bestelako metodoetan.
		
		int azkenEguna;
		//TODO
		return azkenEguna;
	}
}
