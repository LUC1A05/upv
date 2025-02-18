package org.pmobo.packlaborategia3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ZatikiaTest {

	Zatikia z1,z2,z4;
	@Before
	public void setUp() throws Exception {
		z1 = new Zatikia(2,-4);
		z2 = new Zatikia(-1,2);
		z4 = new Zatikia(4,2);
	}

	@After
	public void tearDown() throws Exception {
		z1 = null;
		z2 = null;
	}

	@Test
	public void testZatikia() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetZenbakitzailea() {
		assertEquals(2,z1.getZenbakitzailea());
		assertEquals(-1,z2.getZenbakitzailea());
	}

	@Test
	public void testGetIzendatzailea() {
		assertEquals(-4,z1.getIzendatzailea());
		assertEquals(2,z2.getIzendatzailea());
	}

	@Test
	public void testSinplifikatu() 
	{
		z1.sinplifikatu();
		assertEquals(-1,z1.getZenbakitzailea());
		assertEquals(2,z1.getIzendatzailea());
	}

	@Test
	public void testGehitu() {
		Zatikia z3;
		z3 = z1.gehitu(z4);
		assertEquals(3,z3.getZenbakitzailea());
		assertEquals(2,z3.getIzendatzailea());
	}

	@Test
	public void testKendu() {
		Zatikia z3;
		z3 = z1.kendu(z4);
		assertEquals(-5,z3.getZenbakitzailea());
		assertEquals(2,z3.getIzendatzailea());
	}

	@Test
	public void testBiderkatu() {
		Zatikia z3;
		z3 = z1.biderkatu(z4);
		assertEquals(-1,z3.getZenbakitzailea());
		assertEquals(1,z3.getIzendatzailea());
	}

	@Test
	public void testZatitu() {
		Zatikia z3;
		z3 = z1.zatitu(z4);
		assertEquals(-1,z3.getZenbakitzailea());
		assertEquals(4,z3.getIzendatzailea());
	}

	@Test
	public void testBerdinaDa() {
		assertTrue(z1.berdinaDa(z2));
	}
	
	@Test
	public void testHandiagoaDa() {
		assertTrue(z4.handiagoaDa(z1));
		assertFalse(z1.handiagoaDa(z4));
	}
	
	@Test
	public void testTxikiagoaDa() {
		assertTrue(z1.txikiagoaDa(z4));
		assertFalse(z4.txikiagoaDa(z1));
	}
	
	@Test
	public void testIzendatzaileBerdinaDu() {
		z2.sinplifikatu();
		assertFalse(z4.izendatzaileBerdinaDu(z1));
		z1.sinplifikatu();
		assertTrue(z1.izendatzaileBerdinaDu(z2));
	}
	
	@Test
	public void testZenbakitzaileBerdinaDu() {
		z2.sinplifikatu();
		assertFalse(z4.zenbakitzaileBerdinaDu(z1));
		z1.sinplifikatu();
		assertTrue(z1.zenbakitzaileBerdinaDu(z2));
	}
}
