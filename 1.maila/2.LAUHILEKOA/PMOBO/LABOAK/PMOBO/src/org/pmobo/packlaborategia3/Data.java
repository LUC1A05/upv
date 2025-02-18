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
		
		boolean egokia=false;
		if (this.urtea >= 0)
		{
			if (this.hilabetea <= 12 && this.hilabetea >=1)
			{
				if (this.hilabeterarenEgunKopurua() >= this.eguna)
					egokia = true;
			}
		}
		return egokia;
	}

	private boolean bisustua()
	{
		boolean bisustua=false;
		if (this.urtea % 4 == 0)
		{
			if (this.urtea % 100 != 0)
			{
				bisustua = true;
			}
			else if (this.urtea % 400 == 0)
			{
				bisustua = true;
			}
		}
		return bisustua;
	}

	@Override
	public void dataGehitu() 
	{
	   	if (this.hilabeterarenEgunKopurua() == this.eguna)
	   	{
	   		if (this.hilabetea == 12)
	   		{
	   			this.hilabetea = 1;
	   			this.urtea ++;
	   		}
	   		else
	   		{
	   			this.hilabetea ++;
	   		}
	   		this.eguna = 1;
	   	}
	   	else
	   		this.eguna ++;
	}
	
	@Override
	public void dataKendu() 
	{
		if (this.eguna == 1)
	   	{
	   		if (this.hilabetea == 1)
	   		{
	   			this.hilabetea = 12;
	   			this.urtea --;
	   		}
	   		else
	   		{
	   			this.hilabetea --;
	   		}
	   		this.eguna = this.hilabeterarenEgunKopurua();
	   	}
		else
			this.eguna --;
	}
	
	private int hilabeterarenEgunKopurua()
	{
		//metodo laguntzaile honek hilabete bakoitzaren azken egun posiblea bueltatzen du, horrela lana murrizteko bestelako metodoetan.
		
		int azkenEguna;
		if (this.hilabetea == 1 || this.hilabetea == 3 || this.hilabetea == 5 || this.hilabetea == 7 || this.hilabetea == 8 || this.hilabetea ==10 || this.hilabetea == 12)
		{
			azkenEguna = 31;
		}
		else if (this.hilabetea == 4 || this.hilabetea == 6 || this.hilabetea == 9 || this.hilabetea == 11)
		{
			azkenEguna = 30;
		}
		else if (this.bisustua())
		{
			azkenEguna = 29;
		}
		else
		{
			azkenEguna = 28;
		}
		return azkenEguna;
	}
}
