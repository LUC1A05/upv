package org.pmobo.packlaborategia8;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RosterTest {

	private Roster ros;
	@Before
	public void setUp() throws Exception {
		ros = Roster.getRoster();
	}

	@After
	public void tearDown() throws Exception {
		ros.getRoster().reset();
	}

	@Test
	public void testParteHartzaileKopurua() {
		assertEquals(0, ros.parteHartzaileKopurua());
		ros.addParteHartzailea("Lucia", 1234, 18);
		assertEquals(1, ros.parteHartzaileKopurua());
		ros.addParteHartzailea("jaimito", 0330, 10);
		assertEquals(1, ros.parteHartzaileKopurua());
		ros.addParteHartzailea("paco", 0341, 20);
		assertEquals(2, ros.parteHartzaileKopurua());
	}

	@Test
	public void testAddParteHartzailea() {
		ros.addParteHartzailea("Lucia", 1, 18);
		assertNotNull(ros.parteHartzaileaIdzBilatu(1));
		ros.addParteHartzailea("Pepa", 1, 20);
		assertNotNull(ros.parteHartzaileaIdzBilatu(2));
		ros.addParteHartzailea("jaimito", 3, 5);
		assertNull(ros.parteHartzaileaIdzBilatu(3));
	}

	@Test
	public void testParteHartzaileaIdzBilatu() {
		assertNull(ros.parteHartzaileaIdzBilatu(1));
		ros.addParteHartzailea("Lucia", 1, 18);
		assertNotNull(ros.parteHartzaileaIdzBilatu(1));
	}

}
