package org.pmobo.packlaborategia5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class LiburuaTest extends TestCase
{
	Liburua l1;

	@Before
	public void setUp()
	{
		l1=new Liburua("El amor dura tres años", "Frederic Beigbeder",4);
	}

	@After
	public void tearDown()
	{
		l1=null;
	}

	@Test
	public void testIdHauDu()
	{
		fail("Proba-kasuak falta dira. Ezabatu edo komentatu fail hau behin eginda");
	}

	@Test
	public void testIdBerdinaDute()
	{
		fail("Proba-kasuak falta dira. Ezabatu edo komentatu fail hau behin eginda");
	}

	@Test
	public void testInprimatu()
	{
		assertNotNull(l1);

		System.out.println("\n===============================================================");
		System.out.println("\nLiburua klasearen inprimatu metodoaren proba kasua");
		System.out.println("\nLiburua-ren informazioa honela pantailaratu beharko zen:\n");
		System.out.println("* El amor dura tres años, Frederic Beigbeder-ek idatzia.");
		System.out.println("\nEta zure programak honela pantailaratzen du:\n");
		l1.inprimatu();
		System.out.println("\n===============================================================");

		fail("Begiratu sistemako kontsolan agertzen diren mezuak, eta dena ondo joan bada, ezabatu edo komentatu fail hau.");
	}

}
