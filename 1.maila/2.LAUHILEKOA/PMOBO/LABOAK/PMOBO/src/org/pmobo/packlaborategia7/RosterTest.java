package org.pmobo.packlaborategia7;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RosterTest {

	@Before
	public void setUp() throws Exception 
	{
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() 
	{
		Roster ros = Roster.getRoster();
		
		ListaParteHartzaileak listaKanporatuak = null;
		Pretendentea p1, p2, p3, p4, p5;
		Tronularia t1;
		p1 = new Pretendentea("Lucia", 5);
		p2 = new Pretendentea("Federico", 4);
		p3 = new Pretendentea("Pepa", 1);
		p4 = new Pretendentea("Lola", 2);
		p5 = new Pretendentea("Nano", 3);
		
		t1 = new Tronularia("Paco", 2);
		
		p1.getListaIzendatuak().gehitu(t1);
		p1.getListaIzendatuak().gehitu(p3);
		p1.getListaIzendatuak().gehitu(p2);
		
		p2.getListaIzendatuak().gehitu(p1);
		p2.getListaIzendatuak().gehitu(p4);
		p2.getListaIzendatuak().gehitu(t1);
		
		p3.getListaIzendatuak().gehitu(t1);
		p3.getListaIzendatuak().gehitu(p1);
		
		p4.getListaIzendatuak().gehitu(p1);
		p4.getListaIzendatuak().gehitu(p2);
		
		p5.getListaIzendatuak().gehitu(p1);
		p5.getListaIzendatuak().gehitu(p2);
		p5.getListaIzendatuak().gehitu(p3);
		
		t1.getListaIzendatuak().gehitu(p5);
		t1.getListaIzendatuak().gehitu(p4);
		
		ros.gehituParteHartzailea(p1);
		ros.gehituParteHartzailea(p5);
		ros.gehituParteHartzailea(p4);
		ros.gehituParteHartzailea(p3);
		ros.gehituParteHartzailea(p2);
		ros.gehituParteHartzailea(t1);
		
		//frogaren hasiera
		
		listaKanporatuak = ros.getKaleratuenParteHartzaileenLista();
		listaKanporatuak.inprimatuZerrenda();
		
	}

}
