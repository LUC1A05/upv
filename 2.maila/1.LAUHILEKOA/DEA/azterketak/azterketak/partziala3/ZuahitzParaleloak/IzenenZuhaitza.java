package ZuahitzParaleloak;

import java.util.ArrayList;

public class IzenenZuhaitza {
	Nodo rootAbizenak;
	Nodo rootIzenak;
	
	public String lortuIzena(String abizena) {
		return this.lortuIzena(abizena, rootAbizenak, rootIzenak);
	}
	private String lortuIzena(String abizena, Nodo noAbiz, Nodo noIzen) {
		if(noAbiz.balioa.equals(abizena)) {
			return noIzen.balioa;
		}
		else if(noAbiz.balioa.compareTo(abizena) < 0){
			return this.lortuIzena(abizena, noAbiz.right, noIzen.right);
		}
		else {
			return this.lortuIzena(abizena, noAbiz.left, noIzen.left);
		}
	}
	
	public ArrayList<String> zerrendaOrdenatuaLortu(){
		ArrayList<String> ema = new ArrayList<String>();
		return this.zerrendaOrdenatuaLortu(rootAbizenak, ema);
	}
	private ArrayList<String> zerrendaOrdenatuaLortu(Nodo noAbiz, ArrayList<String> ema) {
		if(noAbiz != null) {
			this.zerrendaOrdenatuaLortu(noAbiz.left, ema);
			ema.add(this.lortuIzena(noAbiz.balioa) + " " + noAbiz.balioa);
			this.zerrendaOrdenatuaLortu(noAbiz.right, ema);
		}
		return ema;
	}
}
