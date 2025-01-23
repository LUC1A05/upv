package Semaforoa;

public class Gertaera {
	char mota; // Aukerak:
	 // * ‘S’ kotxe bat sartuko da hirian
	 // * ‘B’ semaforoa berde jarri da
	 // * ‘I’ kotxe bat izorratu da
	 // * ‘K’ kotxe bat konpondu da
	String balioa;
	 // Gertaera ‘S’, ‘I’, edo ‘K’ bada, kotxe baten
	 // matrikula izango da.
	 // Gertaera ‘B’ bada, semaforoaren zenbakia izango da
	public Gertaera(char mo, String bal) {
		this.mota = mo;
		this.balioa = bal;
	}
}