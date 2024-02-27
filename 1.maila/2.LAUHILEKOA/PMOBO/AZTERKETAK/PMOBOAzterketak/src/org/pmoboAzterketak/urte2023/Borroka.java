package org.pmoboAzterketak.urte2023;

public class Borroka {
	private int id;
	private Borrokalaria b1,b2;
	
	public Borroka(int pId) {
		this.id = pId;
		this.b1 = BorrokalarienZerrenda.getBorrokalarienZerrenda().getAusazBorrokalaria();
		this.b2 = BorrokalarienZerrenda.getBorrokalarienZerrenda().getAusazBorrokalaria();
		while (this.b2 == this.b1) {
			this.b2 = BorrokalarienZerrenda.getBorrokalarienZerrenda().getAusazBorrokalaria();
		}
	}
	public Borrokalaria getBorrokalari1() {
		return this.b1;
	}
	public Borrokalaria getBorrokalari2() {
		return this.b2;
	}
	public int getId() {
		return this.id;
	}
}
