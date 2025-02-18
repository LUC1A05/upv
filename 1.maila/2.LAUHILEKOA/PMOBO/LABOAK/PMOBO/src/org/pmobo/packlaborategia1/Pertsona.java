package org.pmobo.packlaborategia1;

public class Pertsona 
{
	//atributuak lowerCamelCase
	private int idPertsona;
	private String izenOsoa;
	private String nazionalitatea;
	private String odolMota;
	private int adina;
	
	//parametroak p-z hasi behar dira
	public Pertsona(int pIdPertsona, String pIzenOsoa, String pNazionalitatea, String pOdolMota, int pAdina) {
		this.idPertsona = pIdPertsona;
		this.izenOsoa = pIzenOsoa;
		this.nazionalitatea = pNazionalitatea;
		this.odolMota = pOdolMota;
		this.adina = pAdina;
	}


	public int getIdPertsona() {
		return this.idPertsona;
	}
	public String getOdolMota() {
		return this.odolMota;
	}
	
	public boolean idBerdinaDu(Pertsona pPertsona) {
		boolean berdin;
		
		if (this.idPertsona == pPertsona.getIdPertsona()) {
			berdin = true;
		}
		else {
			berdin = false;
		}
		return berdin;
	}
	
	public boolean gidatuDezake() {
		boolean dago;
		
		dago = false;
		if (this.nazionalitatea == "etiopia" && this.adina >= 14) {
			dago = true;
		}
		else if ((this.nazionalitatea == "australia" || this.nazionalitatea == "estatu batuak") && this.adina >= 16) {
			dago = true;
		}
		if (this.nazionalitatea == "erresuma batuak" && this.adina >= 17) {
			dago = true;
		}
		else if (this.adina >= 18) {
			dago = true;
		}
		return dago;
	}
	
	public boolean donatuDiezaioke(Pertsona pPertsona) {
		boolean eman;
		
		String pOdolMota = pPertsona.getOdolMota();
		eman = false;
		if (this.odolMota == "O-") {
			eman = true;
		}
		else if (this.odolMota == "O+" && (pOdolMota == "AB+" || pOdolMota == "A+" || pOdolMota == "B+" || pOdolMota == "O+")) {
			eman = true;
		}
		else if (this.odolMota == "B-" && (pOdolMota == "AB+" || pOdolMota == "AB-" || pOdolMota == "B+" || pOdolMota == "B-")) {
			eman = true;
		}
		else if (this.odolMota == "A-" && (pOdolMota == "AB+" || pOdolMota == "AB-" || pOdolMota == "A+" || pOdolMota == "A-")) {
			eman = true;
		}
		else if (this.odolMota == "B+" && (pOdolMota == "AB+" || pOdolMota == "B+")) {
			eman = true;
		}
		else if (this.odolMota == "A+" && (pOdolMota == "AB+" || pOdolMota == "A+")) {
			eman = true;
		}
		else if (this.odolMota == "AB-" && (pOdolMota == "AB+" || pOdolMota == "AB-")) {
			eman = true;
		}
		else if (this.odolMota == "AB+" && (pOdolMota == "AB+")) {
			eman = true;
		}
		return eman;
	}
	public String getIzenarenIniziala() {
		int len;
		int i;
		int words;
		String ini;
		
		len = this.izenOsoa.length();
		i = 0;
		words = 1;
		while (i <= (len - 1)) {
			if (this.izenOsoa.charAt(i) == ' ') {
				words ++; 
			}
			i ++;
		}
		i = 0;
		if (words == 2) {
			ini = String.valueOf(this.izenOsoa.charAt(0));
		}
		else {
			ini = String.valueOf(this.izenOsoa.charAt(0));
			while (i <= (len-1) && (this.izenOsoa.charAt(i) != ' ')) {
				i ++;
			}
			ini += ".";
			ini += String.valueOf(this.izenOsoa.charAt(i+1));
		}
		return ini;
	}
	public char getAbizenarenIniziala() {
		int len;
		
		len = this.izenOsoa.length()-1;
		while(this.izenOsoa.charAt(len) != ' ')
			len -= 1;
		return this.izenOsoa.charAt(len+1);
	}
}