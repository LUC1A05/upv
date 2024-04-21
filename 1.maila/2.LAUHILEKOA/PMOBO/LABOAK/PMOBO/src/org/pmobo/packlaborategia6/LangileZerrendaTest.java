package org.pmobo.packlaborategia6;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LangileZerrendaTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Librea k1, k2, k3, k4;
		k1 = new Librea(13.4, 8, "armak eginda");
		k2 = new Librea(9, 2, "poca cosa");
		k3 = new Librea(14, 10, "ya no se ni q poner");
		k4 = new Librea(12.55, 20, "catedral de la kuka");
		
		KontzeptuZerrenda z1, z2, z3;
		z1 = new KontzeptuZerrenda();
		z2 = new KontzeptuZerrenda();
		z3 = new KontzeptuZerrenda();
		
		z1.gehituKontzeptua(k1);
		z1.gehituKontzeptua(k4);
		z1.gehituKontzeptua(k4);
		z2.gehituKontzeptua(k2);
		z2.gehituKontzeptua(k3);
		z3.gehituKontzeptua(k2);
		z3.gehituKontzeptua(k1);
		
		
		
		Langilea l1, l2, l3;
		l1 = new Langilea(1, "juan", "peru", z1, 10, "God", 1111);
		l2 = new Langilea(2, "marta", "guru", z2, 2, "langile arrunta", 2222);
		l3 = new Langilea(3, "Pepe", "Paco", z3, 4, "Services", 3333);
		
		LangileZerrenda lz = LangileZerrenda.getLangileZerrenda();
		lz.gehituLangilea(l1);
		lz.gehituLangilea(l2);
		lz.gehituLangilea(l3);
		
		lz.diferentziaMaximoaLortu();
		
	}

}
