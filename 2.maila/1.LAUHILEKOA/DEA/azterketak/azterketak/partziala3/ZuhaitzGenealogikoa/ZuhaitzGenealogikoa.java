package ZuhaitzGenealogikoa;

import java.util.HashMap;

public class ZuhaitzGenealogikoa {
	BinaryTreeNode<Pertsona> root;
	
	public boolean bizkaitarPetoPetoaDa(String izena, HashMap<String, String> herriak) {
		return this.bizkaitarPetoPetoaDa(izena, herriak, root, false);
	}
	private boolean bizkaitarPetoPetoaDa(String izena, HashMap<String, String> herriak, BinaryTreeNode<Pertsona> nod, boolean aurk) {
		if(nod == null) {
			return true;
		}
		else {
			if(nod.data.izena.equals(izena)) {
				aurk = true;
				if(!herriak.get(nod.data.jaioterria).equals("Bizkaia")) {
					return false;
				}
				else {
					return this.bizkaitarPetoPetoaDa(izena, herriak, nod.left, aurk) && this.bizkaitarPetoPetoaDa(izena, herriak, nod.right, aurk);
				}
			}
			else if(aurk) {
				if(!herriak.get(nod.data.jaioterria).equals("Bizkaia")) {
					return false;
				}
				else {
					return this.bizkaitarPetoPetoaDa(izena, herriak, nod.left, aurk) && this.bizkaitarPetoPetoaDa(izena, herriak, nod.right, aurk);
				}
			}
			else {
				return this.bizkaitarPetoPetoaDa(izena, herriak, nod.left, aurk) && this.bizkaitarPetoPetoaDa(izena, herriak, nod.right, aurk);
			}
			
		}
	}
}
