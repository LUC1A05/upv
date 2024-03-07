package org.pmoboAzterketak.urte2018;

public class proba {
	public static void main(String[] args)
	{
		HariMusikala hm = HariMusikala.getHariMusikala();
		Abestia a1,a2,a3,a4, a5;
		a1 = new Abestia("Days I will remember", "Tyrone Wells", 214);
		a2 = new Abestia("Solo", "Myles Smith", 199);
		a3 = new Abestia("Beautiful Things", "Benson Boone", 180);
		a4 = new Abestia("My Home", "Myles Smith", 206);
		a5 = new Abestia("Pero a tu lado", "Los secretos", 193);
		
		hm.getErrepoLista().gehituAbestia(a1);
		hm.getErrepoLista().gehituAbestia(a2);
		hm.getErrepoLista().gehituAbestia(a3);
		hm.getErrepoLista().gehituAbestia(a4);
		hm.getErrepoLista().gehituAbestia(a5);
		
		
		System.out.println("Abeslariaren abesti kopuruak hurrengoak dira: "+ hm.abeslarienAbestiKopurua("Myles Smith"));
		System.out.println("Abeslariaren abesti kopuruak hurrengoak dira: "+ hm.abeslarienAbestiKopurua("Tyrone Wells"));
		System.out.println("Abeslariaren abesti kopuruak hurrengoak dira: "+ hm.abeslarienAbestiKopurua("Benson Boone"));
		System.out.println("Abeslariaren abesti kopuruak hurrengoak dira: "+ hm.abeslarienAbestiKopurua("Los secretos"));
		System.out.println("Denbora hori pasata, hurrengo abestia egongo da: "+ hm.jotzenEgongoDenAbestia(414).getTitulua());
		System.out.println("Denbora hori pasata, hurrengo abestia egongo da: "+ hm.jotzenEgongoDenAbestia(1).getTitulua());
		System.out.println("Denbora hori pasata, hurrengo abestia egongo da: "+ hm.jotzenEgongoDenAbestia(220).getTitulua());
		System.out.println("Denbora hori pasata, hurrengo abestia egongo da: "+ hm.jotzenEgongoDenAbestia(600).getTitulua());
		
	}

}
