package org.pmobo.packlaborategia5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class ListaLiburuakTest extends TestCase
{

	private ListaLiburuak lista1;
	private Liburua l1,l2,l3;

	@Before
	public void setUp()
	{
		lista1=new ListaLiburuak();	
		l1=new Liburua("Construcción de software orientado a objetos", "Bertrand Meyer",1);
		l2=new Liburua("Cien años de soledad", "Gabriel García Márquez",2);
		l3=new Liburua("El hobbit", "JRR Tolkien",3);
	}

	@After
	public void tearDown()
	{
		lista1=null;
		l1=null;
		l2=null;
		l3=null;
	}

	@Test
	public void testListaLiburuak()
	{
		assertNotNull(lista1);
		assertEquals(0, lista1.listarenTamaina());
	}

	@Test
	public void testGehituEtaKenduLiburua()
	{
		lista1.gehituLiburua(l1);
		assertTrue(lista1.badago(l1));
		lista1.kenduLiburua(l1);
		assertFalse(lista1.badago(l2));
	}

	@Test
	public void testIdBerdinekoLibururikBaAlDa()
	{
		l3=new Liburua("El hobbit", "JRR Tolkien",1);
		assertFalse(lista1.idBerdinekoLibururikBaAlDa(l3));
		lista1.gehituLiburua(l1);
		assertTrue(lista1.idBerdinekoLibururikBaAlDa(l3));
	}


	@Test
	public void testBadago()
	{
		assertFalse(lista1.badago(l1));
		lista1.gehituLiburua(l1);
		assertTrue(lista1.badago(l1));
	}

	@Test
	public void testInprimatu()
	{
		assertEquals(0,lista1.listarenTamaina());

		lista1.gehituLiburua(l1);
		lista1.gehituLiburua(l2);
		lista1.gehituLiburua(l3);

		System.out.println("\n===============================================================");
		System.out.println("\nListaLiburuak klasearen inprimatu metodoaren proba kasua");
		System.out.println("\nLiburu-zerrendaren informazioa honela pantailaratu beharko zen:\n");
		System.out.println("* Construcción de software orientado a objetos, Bertrand Meyer-ek idatzia.");
		System.out.println("* Cien años de soledad, Gabriel García Márquez-ek idatzia.");
		System.out.println("* El hobbit, JRR Tolkien-ek idatzia.");

		System.out.println("\nEta zure programak honela pantailaratzen du:\n");
		lista1.inprimatu();
		System.out.println("\n===============================================================");

	}
	
}
