package org.pmobo.packlaborategia5;

public class Katalogoa
{
	// atributuak
	private ListaLiburuak lista;
	private static Katalogoa nireKatalogoa = null;
	
	// eraikitzailea
	
	private Katalogoa()
	{
		this.lista = new ListaLiburuak();
	}

 	// beste metodoak
 	
	public static Katalogoa getKatalogoa() 
	{
		if (nireKatalogoa == null)
			nireKatalogoa = new Katalogoa();
		return nireKatalogoa;
	}
	
 	public int liburuKopuru()
 	{
 		return this.lista.listarenTamaina();
 	}
 	 	
 	public Liburua bilatuLiburuaIdz(int pIdLiburua)
 	{
 	 	return this.lista.bilatuLiburuaIdz(pIdLiburua);
 	}
 	
// 	public void mailegatuLiburua(int pIdLiburua, int pIdErabiltzailea)
//	{
//		if(this.lista.bilatuLiburuaIdz(pIdLiburua) != null)
//		{
//			if (ListaErabiltzaileak.getListaErabiltzaileak().norkDaukaMaileguan(this.lista.bilatuLiburuaIdz(pIdLiburua)) == null)
//			{
//				if (!ListaErabiltzaileak.getListaErabiltzaileak().bilatuErabiltzaileaIdz(pIdErabiltzailea).mailegatzekoMaximoaGainditua())
//				{
//					ListaErabiltzaileak.getListaErabiltzaileak().bilatuErabiltzaileaIdz(pIdErabiltzailea).gehituLiburua(this.lista.bilatuLiburuaIdz(pIdLiburua));
//				}
//				else
//					System.out.println("Ezin da liburua mailegatu Erabiltzaileak mailegatzeko maximoa gainditzen baitu.");
//			}
//			else
//				System.out.println("Ezin da liburua mailegatu jadanik erabiltzaile batek mailegatuta duelako.");
//		}
//		else
//			System.out.println("Ezin da liburua mailegatu katalogoan ez dagoelako.");
//	}

 	
 	public void mailegatuLiburua(int pIdLiburua, int pIdErabiltzailea)
	{
 		//Guard clause
		Liburua liburua = this.lista.bilatuLiburuaIdz(pIdLiburua);
		Erabiltzailea erabiltzailea = ListaErabiltzaileak.getListaErabiltzaileak().bilatuErabiltzaileaIdz(pIdErabiltzailea);
		if(liburua == null) {
			System.out.println("Ezin da liburua mailegatu katalogoan ez dagoelako.");
			return;
		}
		if (ListaErabiltzaileak.getListaErabiltzaileak().norkDaukaMaileguan(liburua) != null)
		{
			System.out.println("Ezin da liburua mailegatu jadanik erabiltzaile batek mailegatuta duelako.");
			return;
		}
		if (erabiltzailea.mailegatzekoMaximoaGainditua())
		{
			System.out.println("Ezin da liburua mailegatu Erabiltzaileak mailegatzeko maximoa gainditzen baitu.");
			return;
		}
		erabiltzailea.gehituLiburua(liburua);
	}

 	public void itzuliLiburua(int pIdLiburua)
	{
 		Erabiltzailea er = null;
		er = ListaErabiltzaileak.getListaErabiltzaileak().norkDaukaMaileguan(this.lista.bilatuLiburuaIdz(pIdLiburua));
		er.kenduLiburua(this.lista.bilatuLiburuaIdz(pIdLiburua));
	}
 	
 	public void katalogatuLiburua(Liburua pLiburua)
 	{		
 		if (!this.lista.badago(pLiburua))
 		{
 			this.lista.gehituLiburua(pLiburua);
 		}
 		else
 			System.out.println("Liburua katalogoan dago.");
 		
 	}

 	public void deskatalogatuLiburua(int pIdLiburua)
 	{
 		if (this.lista.badago(this.lista.bilatuLiburuaIdz(pIdLiburua)))
 		{
 			this.lista.kenduLiburua(this.lista.bilatuLiburuaIdz(pIdLiburua));
 		}
 		else
 			System.out.println("Liburua ez dago katalogoan.");
 	}

 	public void inprimatu()
 	{
 		System.out.println("Katalogoak "+ this.liburuKopuru()+" titulu ditu guztira.");
 		this.lista.inprimatu();
 	}

 	public void erreseteatu()
 	{
 		nireKatalogoa = null;
 	}
 	
}	
