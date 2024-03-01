package org.pmoboAzterketak.urte2018;

public class proba {
	public static void main(String[] args)
	{
		HariMusikala hm = HariMusikala.getHariMusikala();
		Abestia a1,a2,a3,a4;
		a1 = new Abestia("Days I will remember", "Tyrone Wells", 214);
		a2 = new Abestia("Solo", "Myles Smith", 199);
		a3 = new Abestia("Beautiful Things", "Benson Boone", 180);
		a4 = new Abestia("My Home", "Myles Smith", 206);
		
		hm.getErrepoLista().gehituAbestia(a1);
		hm.getErrepoLista().gehituAbestia(a2);
		hm.getErrepoLista().gehituAbestia(a3);
		hm.getErrepoLista().gehituAbestia(a4);
		
		hm.abeslarienAbestiKopurua("Myles Smith");
		System.out.println(hm.abeslarienAbestiKopurua("Myles Smith"));
		hm.jotzenEgongoDenAbestia(400);
		System.out.println(hm.jotzenEgongoDenAbestia(414).getAbeslaria());
	}

}
