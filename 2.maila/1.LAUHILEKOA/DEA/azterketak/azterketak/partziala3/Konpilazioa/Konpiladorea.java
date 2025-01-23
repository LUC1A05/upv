package Konpilazioa;

import java.util.ArrayList;
import java.util.HashMap;

public class Konpiladorea {
	 HashMap<String, ArrayList<String>> mendekotasunak;
	 public Konpiladorea(HashMap<String, ArrayList<String>> hash) {
		mendekotasunak = hash;
	}
	public boolean zuzenaDa(String prog) {
		 boolean zuzena = true;
		 
		 ArrayList<String>mendekoak = mendekotasunak.get(prog);
		 for(String mendeko : mendekoak) {
			 if(!mendekotasunak.containsKey(mendeko)) return false;
		 }
		 
		 return zuzena;
	 }
}
