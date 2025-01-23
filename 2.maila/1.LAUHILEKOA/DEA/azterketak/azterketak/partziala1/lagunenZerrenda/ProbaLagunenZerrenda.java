package lagunenZerrenda;

public class ProbaLagunenZerrenda {
	public static void main(String[]args) {
		Pertsona p1,p2,p3,p4;
		p1 = new Pertsona("111");
		p2 = new Pertsona("222");
		p3 = new Pertsona("888");
		p4 = new Pertsona("lucia");
		
		p1.addLaguna(p2);
		p2.addLaguna(p1);
		p2.addLaguna(p3);
		p3.addLaguna(p2);
		
		Lista l = new Lista();
		l.addPertsona(p1);
		l.addPertsona(p2);
		l.addPertsona(p3);
		l.addPertsona(p4);
		
		l.inprimatu();
		l.ezabatu("222");
		System.out.println("\nlaguna ezabatu ondoren");
		l.inprimatu();
	}

}
