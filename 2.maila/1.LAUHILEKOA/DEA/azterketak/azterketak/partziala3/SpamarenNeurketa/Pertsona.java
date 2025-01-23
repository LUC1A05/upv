package SpamarenNeurketa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Pertsona {
	String izena;
	int spamJasotakoak; // hasieran zero
	ArrayList<Pertsona> kontaktuak; 
	
	public Pertsona(String string) {
		this.izena = string;
		this.kontaktuak = new ArrayList<>();
	}

	public void spamBidali() {
		// aurre:
		// post: mezu bat bidali zaie pertsona honen kontaktu guztiei,
		// eta hauek bere kontaktuei, …
		// Une bakoitzean, spam hori jasotzen duen pertsonak
		// erabakiko du ea berriro bidaltzen duen ala ez
		// spam kontagailua eguneratu da
		Pertsona unekoa = this;
		boolean bidali = this.berBidali();
		if(bidali) {
			for(Pertsona per : unekoa.kontaktuak) {
				per.spamJasotakoak ++;
				per.spamBidali();
			}
		}
	}

	 public boolean berBidali() {
		 // post: true bueltatzen du mezua berbidaltzen bada eta false bestela
		 Random r = new Random();
		 return r.nextBoolean();
	 }
}
