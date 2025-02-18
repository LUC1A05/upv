package org.pmobo.packlaborategia1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PertsonaTest {
	
	Pertsona p1,p2,p3;
	@Before
	public void setUp() throws Exception 
	{
		p1 = new Pertsona(13, "Paco Gomez", "australia", "A+", 17);
		p2 = new Pertsona(13, "Maria Fernanda Koko", "etiopia", "A+", 14);
		p3 = new Pertsona(5, "Nano Ruiz", "espaina", "AB+", 14);
	}

	@After
	public void tearDown() throws Exception 
	{
		p1 = null;
		p2 = null;
		p3 = null;
	}

	@Test
	public void testPertsonaEtaGetIdPertsona() 
	{
		assertNotNull(p1);
		assertEquals(p1.getIdPertsona(), 13);
	}

	@Test
	public void testIdBerdinaDu() 
	{
		assertTrue(p1.idBerdinaDu(p2));
		assertTrue(p2.idBerdinaDu(p1));
		
		assertFalse(p1.idBerdinaDu(p3));
	}

	@Test
	public void testGidatuDezake() {
		p1 = new Pertsona(13, "Paco Gomez", "australia", "A+", 16);
		assertTrue(p1.gidatuDezake());
		p1 = new Pertsona(13, "Paco Gomez", "australia", "A+", 15);
		assertFalse(p1.gidatuDezake());
		
		p1 = new Pertsona(13, "Paco Gomez", "estatu batuak", "A+", 16);
		assertTrue(p1.gidatuDezake());
		p1 = new Pertsona(13, "Paco Gomez", "estatu batuak", "A+", 15);
		assertFalse(p1.gidatuDezake());
		
		p1 = new Pertsona(13, "Paco Gomez", "etiopia", "A+", 14);
		assertTrue(p1.gidatuDezake());
		p1 = new Pertsona(13, "Paco Gomez", "etiopia", "A+", 13);
		assertFalse(p1.gidatuDezake());
		
		p1 = new Pertsona(13, "Paco Gomez", "erresuma batuak", "A+", 17);
		assertTrue(p1.gidatuDezake());
		p1 = new Pertsona(13, "Paco Gomez", "erresuma batuak", "A+", 16);
		assertFalse(p1.gidatuDezake());
		
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "A+", 18);
		assertTrue(p1.gidatuDezake());
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "A+", 17);
		assertFalse(p1.gidatuDezake());
		
		p1 = new Pertsona(13, "Paco Gomez", "italia", "A+", 18);
		assertTrue(p1.gidatuDezake());
		p1 = new Pertsona(13, "Paco Gomez", "italia", "A+", 17);
		assertFalse(p1.gidatuDezake());
	}

	@Test
	public void testDonatuDiezaioke() {
		//O-
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "O-", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "AB+", 17);
		assertTrue(p1.donatuDiezaioke(p2));
		assertFalse(p2.donatuDiezaioke(p1));
		
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "O-", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "AB-", 17);
		assertTrue(p1.donatuDiezaioke(p2));
		assertFalse(p2.donatuDiezaioke(p1));
		
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "O-", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "A+", 17);
		assertTrue(p1.donatuDiezaioke(p2));
		assertFalse(p2.donatuDiezaioke(p1));
		
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "O-", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "A-", 17);
		assertTrue(p1.donatuDiezaioke(p2));
		assertFalse(p2.donatuDiezaioke(p1));
		
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "O-", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "B+", 17);
		assertTrue(p1.donatuDiezaioke(p2));
		assertFalse(p2.donatuDiezaioke(p1));
		
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "O-", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "B-", 17);
		assertTrue(p1.donatuDiezaioke(p2));
		assertFalse(p2.donatuDiezaioke(p1));
		
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "O-", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "O+", 17);
		assertTrue(p1.donatuDiezaioke(p2));
		assertFalse(p2.donatuDiezaioke(p1));
		
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "O-", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "O-", 17);
		assertTrue(p1.donatuDiezaioke(p2));
		
		//O+
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "O+", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "AB+", 17);
		assertTrue(p1.donatuDiezaioke(p2));
		assertFalse(p2.donatuDiezaioke(p1));
		
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "O+", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "A+", 17);
		assertTrue(p1.donatuDiezaioke(p2));
		assertFalse(p2.donatuDiezaioke(p1));
		
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "O+", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "B+", 17);
		assertTrue(p1.donatuDiezaioke(p2));
		assertFalse(p2.donatuDiezaioke(p1));
		
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "O+", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "O+", 17);
		assertTrue(p1.donatuDiezaioke(p2));
		
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "O+", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "AB-", 17);
		assertFalse(p1.donatuDiezaioke(p2));
		assertFalse(p2.donatuDiezaioke(p1));
		
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "O+", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "A-", 17);
		assertFalse(p1.donatuDiezaioke(p2));
		assertFalse(p2.donatuDiezaioke(p1));
		
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "O+", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "B-", 17);
		assertFalse(p1.donatuDiezaioke(p2));
		assertFalse(p2.donatuDiezaioke(p1));
		
		//B-
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "B-", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "AB+", 17);
		assertTrue(p1.donatuDiezaioke(p2));
		assertFalse(p2.donatuDiezaioke(p1));
		
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "B-", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "AB-", 17);
		assertTrue(p1.donatuDiezaioke(p2));
		assertFalse(p2.donatuDiezaioke(p1));
		
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "B-", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "B+", 17);
		assertTrue(p1.donatuDiezaioke(p2));
		assertFalse(p2.donatuDiezaioke(p1));
		
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "B-", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "B-", 17);
		assertTrue(p1.donatuDiezaioke(p2));
		
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "B-", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "A+", 17);
		assertFalse(p1.donatuDiezaioke(p2));
		assertFalse(p2.donatuDiezaioke(p1));
		
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "B-", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "A-", 17);
		assertFalse(p1.donatuDiezaioke(p2));
		assertFalse(p2.donatuDiezaioke(p1));
		
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "B-", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "O-", 17);
		assertFalse(p1.donatuDiezaioke(p2));
		
		
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "B-", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "O+", 17);
		assertFalse(p1.donatuDiezaioke(p2));
		
		//A-
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "A-", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "AB+", 17);
		assertTrue(p1.donatuDiezaioke(p2));
		assertFalse(p2.donatuDiezaioke(p1));
		
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "A-", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "AB-", 17);
		assertTrue(p1.donatuDiezaioke(p2));
		assertFalse(p2.donatuDiezaioke(p1));
		
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "A-", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "A+", 17);
		assertTrue(p1.donatuDiezaioke(p2));
		assertFalse(p2.donatuDiezaioke(p1));
		
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "A-", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "A-", 17);
		assertTrue(p1.donatuDiezaioke(p2));
		
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "A-", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "B+", 17);
		assertFalse(p1.donatuDiezaioke(p2));
		assertFalse(p2.donatuDiezaioke(p1));
		
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "A-", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "O-", 17);
		assertFalse(p1.donatuDiezaioke(p2));
		
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "A-", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "O+", 17);
		assertFalse(p1.donatuDiezaioke(p2));
		
		//B+
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "B+", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "AB+", 17);
		assertTrue(p1.donatuDiezaioke(p2));
		assertFalse(p2.donatuDiezaioke(p1));
		
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "B+", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "B+", 17);
		assertTrue(p1.donatuDiezaioke(p2));
		
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "B+", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "AB-", 17);
		assertFalse(p1.donatuDiezaioke(p2));
		assertFalse(p2.donatuDiezaioke(p1));
		
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "B+", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "A+", 17);
		assertFalse(p1.donatuDiezaioke(p2));
		assertFalse(p2.donatuDiezaioke(p1));
		
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "B+", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "B-", 17);
		assertFalse(p1.donatuDiezaioke(p2));
		
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "B+", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "O-", 17);
		assertFalse(p1.donatuDiezaioke(p2));
		
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "B+", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "O+", 17);
		assertFalse(p1.donatuDiezaioke(p2));
		
		//A+
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "A+", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "AB+", 17);
		assertTrue(p1.donatuDiezaioke(p2));
		assertFalse(p2.donatuDiezaioke(p1));
		
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "A+", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "A+", 17);
		assertTrue(p1.donatuDiezaioke(p2));
		
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "A+", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "AB-", 17);
		assertFalse(p1.donatuDiezaioke(p2));
		assertFalse(p2.donatuDiezaioke(p1));
		
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "A+", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "A-", 17);
		assertFalse(p1.donatuDiezaioke(p2));
		
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "A+", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "O-", 17);
		assertFalse(p1.donatuDiezaioke(p2));
		
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "A+", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "O+", 17);
		assertFalse(p1.donatuDiezaioke(p2));
		
		//AB-
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "AB-", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "AB+", 17);
		assertTrue(p1.donatuDiezaioke(p2));
		assertFalse(p2.donatuDiezaioke(p1));
		
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "AB+", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "AB+", 17);
		assertTrue(p1.donatuDiezaioke(p2));
		
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "AB-", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "O-", 17);
		assertFalse(p1.donatuDiezaioke(p2));
		
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "AB-", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "O+", 17);
		assertFalse(p1.donatuDiezaioke(p2));
		
		//AB+
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "AB-", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "AB-", 17);
		assertTrue(p1.donatuDiezaioke(p2));
		
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "AB+", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "O-", 17);
		assertFalse(p1.donatuDiezaioke(p2));
		
		p1 = new Pertsona(13, "Paco Gomez", "espaina", "AB+", 17);
		p2 = new Pertsona(13, "Diana Lopez", "espaina", "O+", 17);
		assertFalse(p1.donatuDiezaioke(p2));
	}

	@Test
	public void testGetIzenarenIniziala() {
		assertEquals(p1.getIzenarenIniziala(), "P");
		assertEquals(p2.getIzenarenIniziala(), "M.F");
		
		assertNotEquals(p1.getIzenarenIniziala(), "M");
	}

	@Test
	public void testGetAbizenarenIniziala() {
		assertEquals(p1.getAbizenarenIniziala(), 'G');
		assertEquals(p2.getAbizenarenIniziala(), 'K');
		
		assertNotEquals(p2.getAbizenarenIniziala(), 'J');
		
	}

}
