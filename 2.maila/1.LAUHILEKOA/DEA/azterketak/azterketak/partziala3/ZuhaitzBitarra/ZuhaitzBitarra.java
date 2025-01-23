package ZuhaitzBitarra;

import java.util.ArrayList;

public class ZuhaitzBitarra {
	Nodo root;
	
	public ArrayList<Integer> lortuBeheranzkoZerrendaOrdenatua(){
		ArrayList<Integer> ema = new ArrayList<>();
		return this.lortuBeheranzkoZerrendaOrdenatua(ema, root);
	}
	private ArrayList<Integer> lortuBeheranzkoZerrendaOrdenatua(ArrayList<Integer>ema, Nodo nod){
		if(nod != null) {
			this.lortuBeheranzkoZerrendaOrdenatua(ema, nod.right);
			ema.add(nod.balioa);
			this.lortuBeheranzkoZerrendaOrdenatua(ema, nod.left);
		}
		return ema;
	}
	
	public void zuhaitzaItxi() {
		this.zuhaitzaItxi(root);
	}
	private void zuhaitzaItxi(Nodo nod) {
		if(nod != null) {
			if(nod.left == null) {
				Nodo berria = new Nodo(-1);
				berria.zuriaAlaGorria = false;
				nod.left = berria;
			}
			else {
				this.zuhaitzaItxi(nod.left);
			}
			if(nod.right == null) {
				Nodo berria = new Nodo(-1);
				berria.zuriaAlaGorria = false;
				nod.right = berria;
			}
			else {
				this.zuhaitzaItxi(nod.right);
			}
		}
	}
}
