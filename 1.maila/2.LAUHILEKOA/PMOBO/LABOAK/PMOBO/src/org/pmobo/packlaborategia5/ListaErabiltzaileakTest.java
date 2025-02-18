package org.pmobo.packlaborategia5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class ListaErabiltzaileakTest extends TestCase
{

	private Erabiltzailea e1;
	private Erabiltzailea e2;
	private Erabiltzailea e3;
	
	private Liburua l1;
	private Liburua l2;
	private Liburua l3;
	
	@Before
	public void setUp()
	{
		e1 = new Erabiltzailea("Armando Guerra", 1);
		e2 = new Erabiltzailea("Kepa Sarasola", 2); 
		e3 = new Erabiltzailea("Lola Mento", 3);

		l1=new Liburua("Cumbres borrascosas","Emily Bronte",1);
		l2=new Liburua("Sentido y sensibilidad","Jane Austen",2);
		l3=new Liburua("El hobbit", "JRR Tolkien",3);
	}

	@After
	public void tearDown()
	{
		e1 = null;
		e2 = null;
		e3 = null;
		ListaErabiltzaileak.getListaErabiltzaileak().erreseteatu();
	}

	@Test
	public void testGetListaErabiltzaileak()
	{
		ListaErabiltzaileak le = ListaErabiltzaileak.getListaErabiltzaileak();
	}

	@Test
	public void testBilatuErabiltzaileaIdz()
	{
		ListaErabiltzaileak le = ListaErabiltzaileak.getListaErabiltzaileak();
		assertEquals(le.bilatuErabiltzaileaIdz(1), null);
		le.erabiltzaileariAltaEman(e1);
		assertEquals(le.bilatuErabiltzaileaIdz(1), e1);
	}

	@Test
	public void testBadagoIdBerdinekoErabiltzailerik()
	{
		ListaErabiltzaileak le = ListaErabiltzaileak.getListaErabiltzaileak();
		assertFalse(le.badagoIdBerdinekoErabiltzailerik(e1));
		le.erabiltzaileariAltaEman(e1);
		e2=new Erabiltzailea("Kepa Sarasola", 1);
		assertTrue(le.badagoIdBerdinekoErabiltzailerik(e2));
		
		//fail("Proba-kasuak falta dira. Ezabatu edo komentatu fail hau behin eginda");
	}

	@Test
	public void testErabiltzaileariAltaEmanEtaBajaEmanEtaErreseteatu()
	{
		ListaErabiltzaileak le = ListaErabiltzaileak.getListaErabiltzaileak();
		le.erabiltzaileariAltaEman(e1);
		assertTrue(le.badagoIdBerdinekoErabiltzailerik(e1));
		le.erabiltzaileaBajaEman(1);
		assertFalse(le.badagoIdBerdinekoErabiltzailerik(e1));
		le.erreseteatu();
		//fail("Proba-kasuak falta dira. Ezabatu edo komentatu fail hau behin eginda");
	}

	@Test
	public void testErabiltzaileariAltaEmanEtaBajaEmanEtaBadagoIdBerdinekoErabiltzailerik()
	{
		ListaErabiltzaileak le = ListaErabiltzaileak.getListaErabiltzaileak();
		le.erabiltzaileariAltaEman(e1);
		assertTrue(le.badagoIdBerdinekoErabiltzailerik(e1));
		e2=new Erabiltzailea("Kepa Sarasola", 1);
		assertTrue(le.badagoIdBerdinekoErabiltzailerik(e2));
		le.erabiltzaileaBajaEman(1);
		assertFalse(le.badagoIdBerdinekoErabiltzailerik(e1));
		
		//fail("Proba-kasuak falta dira. Ezabatu edo komentatu fail hau behin eginda");
	}

	@Test
	public void testNorkDaukaMaileguan()
	{
		//fail("Proba-kasuak falta dira. Ezabatu edo komentatu fail hau behin eginda");
		e1.gehituLiburua(l1);
		ListaErabiltzaileak.getListaErabiltzaileak().erabiltzaileariAltaEman(e1);
		assertEquals(ListaErabiltzaileak.getListaErabiltzaileak().norkDaukaMaileguan(l1), e1);
	}

	@Test		
	public void testInprimatu()
	{

		assertNotNull(ListaErabiltzaileak.getListaErabiltzaileak());		

		e1.gehituLiburua(l1);
		e3.gehituLiburua(l2);
		e3.gehituLiburua(l3);

		ListaErabiltzaileak.getListaErabiltzaileak().erabiltzaileariAltaEman(e1);
		ListaErabiltzaileak.getListaErabiltzaileak().erabiltzaileariAltaEman(e2);
		ListaErabiltzaileak.getListaErabiltzaileak().erabiltzaileariAltaEman(e3);

		System.out.println("\n===============================================================");
		System.out.println("\nListaErabiltzaileak klasearen inprimatu metodoaren proba kasua");
		System.out.println("\nErabiltzaile-zerrendaren informazioa honela pantailaratu beharko zen::\n");

		System.out.println("3 erabiltzaile daude guztira.");
		System.out.println("ID: 1: Armando Guerra");
		System.out.println("---> Titulu honako hau dauka maileguan:");
		System.out.println("* Cumbres borrascosas, Emily Bronte-ek idatzia.");
		System.out.println("ID: 2: Kepa Sarasola");
		System.out.println("---> Ez dauka libururik maileguan.");
		System.out.println("ID: 3: Lola Mento");
		System.out.println("---> 2 titulu hauek dauzka maileguan:");
		System.out.println("* Sentido y sensibilidad, Jane Austen-ek idatzia.");
		System.out.println("* El hobbit, JRR Tolkien-ek idatzia.");

		System.out.println("\nEta zure programak honela pantailaratzen du:");
		ListaErabiltzaileak.getListaErabiltzaileak().inprimatu();
		System.out.println("\n===============================================================");

		ListaErabiltzaileak.getListaErabiltzaileak().erabiltzaileaBajaEman(1);
		ListaErabiltzaileak.getListaErabiltzaileak().erabiltzaileaBajaEman(2);
		ListaErabiltzaileak.getListaErabiltzaileak().erabiltzaileaBajaEman(3);
		assertEquals(0,ListaErabiltzaileak.getListaErabiltzaileak().erabiltzaileKopurua());	

	}

}

