package org.pmoboAzterketak.urte2018;

public class Abestia {
	private String titulua;
	private String abeslaria;
	private int iraupena;
	
	public Abestia(String pTitulua, String pAbeslaria, int pIraupena)
	{
		this.titulua = pTitulua;
		this.abeslaria = pAbeslaria;
		this.iraupena = pIraupena;
	}
	public String getAbeslaria()
	{
		return this.abeslaria;
	}
	public int getIraupena()
	{
		return this.iraupena;
	}
	public String getTitulua()
	{
		return this.titulua;
	}
}
