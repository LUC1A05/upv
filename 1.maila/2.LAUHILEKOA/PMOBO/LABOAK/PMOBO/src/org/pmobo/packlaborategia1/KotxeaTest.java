package org.pmobo.packlaborategia1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class KotxeaTest {

	Pertsona p1, p2;
	Kotxea k1;
	@Before
	public void setUp() throws Exception {
		p1 = new Pertsona(13, "Paco Gomez", "australia", "A+", 17);
		p2 = new Pertsona(14, "Maria Fernanda Koko", "etiopia", "A+", 14);
		k1 = new Kotxea("12345", "audi", p1);
	}

	@After
	public void tearDown() throws Exception {
		p1 = null;
		p2 = null;
		k1 = null;
	}

	@Test
	public void test() {
		assertTrue(k1.jabeaAlDa(p1));
		assertFalse(k1.jabeaAlDa(p2));
		
		k1.aldatuJabea(p2);
		assertTrue(k1.jabeaAlDa(p2));
		assertFalse(k1.jabeaAlDa(p1));
		
	}

}
