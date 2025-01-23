package KostuarenKalkulua;

public class ZereginenZuhaitza {
	BinaryTreeNode root;
	public int kostua(String idZeregin) {
		return this.kostua(idZeregin, root, false);
	}
	private int kostua(String idZeregin, BinaryTreeNode nod, boolean gehitu) {
		if(nod == null) {
			return 0;
		}
		int ema = 0;
		if(nod.element.id.equals(idZeregin)) {
			gehitu = true;
			ema += nod.element.kostua;
			ema += this.kostua(idZeregin, nod.left, gehitu);
			ema += this.kostua(idZeregin, nod.right, gehitu);
		}
		else if(gehitu) {
			ema += nod.element.kostua;
			ema += this.kostua(idZeregin, nod.left, gehitu);
			ema += this.kostua(idZeregin, nod.right, gehitu);
		}
		else {
			ema += this.kostua(idZeregin, nod.left, gehitu);
			ema += this.kostua(idZeregin, nod.right, gehitu);
		}
		return ema;
	}
}
