package org.pmobo.packlaborategia6;

import java.util.ArrayList;
import java.util.Iterator;

public class LangileZerrenda 
{
	private ArrayList<Langilea>lista;
	private static LangileZerrenda nireLangileZerrenda = null;
	
	private LangileZerrenda()
	{
		this.lista = new ArrayList<Langilea>();
	}
	
	public static LangileZerrenda getLangileZerrenda()
	{
		if(nireLangileZerrenda == null)
		{
			nireLangileZerrenda = new LangileZerrenda();
		}
		return nireLangileZerrenda;
	}
	
	private Iterator<Langilea> getIteradorea()
	{
		return this.lista.iterator();
	}
	
	public void gehituLangilea(Langilea plan)
	{
		this.lista.add(plan);
	}
	public double diferentziaMaximoaLortu()
	{
		Langilea lMax = null, lMin = null;
		double soldata = 0;
		double soldataMax = 0;
		double soldataMin = 30000000;
		
		Iterator<Langilea>itr = this.getIteradorea();
		
		while(itr.hasNext())
		{
			Langilea lan = itr.next();
			soldata = lan.getSoldata();
			if(soldata < soldataMin)
			{
				soldataMin = soldata;
				lMin = lan;
			}
			if(soldata > soldataMax)
			{
				soldataMax = soldata;
				lMax = lan;
			}
		}
		
		System.out.println("soldata maximoa " + lMax.getIzena()+ " lortu du, eta bere soldata hurrengoa da: "+ soldataMax+ "€" + "\nsoldata minimoa "+ lMin.getIzena() + " lortu du, eta bere soldata hurrengoa da: " + soldataMin+ "€"+ "\nDiferentzia maximoa hau da: " + (soldataMax-soldataMin)+ "€");
		return (soldataMax - soldataMin);
	}

}
