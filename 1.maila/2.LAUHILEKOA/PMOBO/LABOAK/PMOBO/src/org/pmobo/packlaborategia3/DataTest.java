package org.pmobo.packlaborategia3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DataTest {

	Data d1;
	@Before
	public void setUp() throws Exception {
		d1 = new Data(2005,05,26);
	}

	@After
	public void tearDown() throws Exception {
		d1 = null;
	}

	@Test
	public void test() {
		d1.dataGehitu();
		assertEquals("2005/05/27",d1.toString());
		d1.dataKendu();
		assertEquals("2005/05/26",d1.toString());
		
		//urtearen azken eguna
		d1 = new Data(2005,12,31);
		d1.dataGehitu();
		assertEquals("2006/01/01",d1.toString());
		d1.dataKendu();
		assertEquals("2005/12/31",d1.toString());
		
		//urtearen lehenengo eguna
		d1 = new Data(2005,01,1);
		d1.dataKendu();
		assertEquals("2004/12/31",d1.toString());
		d1.dataGehitu();
		assertEquals("2005/01/01",d1.toString());
		
		//bisurtea
		d1 = new Data(2024,02,29);
		d1.dataKendu();
		assertEquals("2024/02/28",d1.toString());
		d1.dataGehitu();
		assertEquals("2024/02/29",d1.toString());
	}

}
