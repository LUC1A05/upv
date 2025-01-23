package AdierazpenarenEbaluazioa;

import java.util.HashMap;

public class Zuhaitza {
	BinaryTreeNode<InfoElemEspresioa> root;
	public Integer ebaluatu(HashMap<String, Integer> tHash) {
		return this.ebaluatu(tHash, root);
	}
	private Integer ebaluatu(HashMap<String, Integer>tHash, BinaryTreeNode<InfoElemEspresioa> nod) {
		if(!nod.element.eragigaia) {
			return tHash.get(nod.element.elem);
		}
		else {
			int ezk = this.ebaluatu(tHash, nod.left);
			int esk = this.ebaluatu(tHash, nod.right);
			if(nod.element.elem.equals("*")) {
				return ezk * esk;
			}
			else {
				return ezk + esk;
			}
		}
	}
}
