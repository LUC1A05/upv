package Semaforoa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class TrafikoarenKudeaketa {
	int SEMAFOROKOP = 20;
	int N = 5; // semaforo bat berde jartzen denean, pasako den
	 // kotxe-kopuru maximoa
	int IRTEERA = 99999; // balio berezia hiritik irtetzeko
	public Integer nora(String matrikula) {
		// Post: emaitza kotxe hori joango den semaforoaren zenbakia
		// izango da (IRTEERA izan daiteke)
		Random ran = new Random();
		return ran.nextInt(SEMAFOROKOP + 1);
	}
	public void trafikoaSimulatu(ArrayList<Gertaera> gertaerak) {
		// Post: “gertaerak” zerrendako mugimenduak egin dira
		// Mugimenduak irteeran idatzi dira
		// Jakiteko kotxe bat zein semaforotan dagoen:
		HashMap<String, Integer> kotxeaSemaforoan = new HashMap<String, Integer>();
		Queue<String>[] semaforoak;
		semaforoak = new LinkedList[SEMAFOROKOP];
		// Hasieratu “semaforoak” eta kotxeaSemaforoan
		for(int i = 0; i < SEMAFOROKOP; i++) {
			semaforoak[i] = new LinkedList<String>();
		}
		for(Gertaera gert : gertaerak) {
			if(gert.mota == 'S') {
				kotxeaSemaforoan.put(gert.balioa, 0);
				semaforoak[0].add(gert.balioa);
				System.out.println(gert.balioa + " kotxea 0 semaforora iritsi da.");
			}
			else if(gert.mota == 'B') {
				int i = 0;
				int sem = Integer.parseInt(gert.balioa);
				while(!semaforoak[sem].isEmpty() && i < N) {
					String matrikula = semaforoak[sem].poll();
					int semaforoa = this.nora(matrikula);
					semaforoak[semaforoa].add(matrikula);
					kotxeaSemaforoan.put(matrikula, semaforoa);
					System.out.println(matrikula + " kotxea " + semaforoa + " semaforora iritsi da");
					i++;
				}
			}
			else if(gert.mota == 'I') {
				String matrikula = gert.balioa;
				int sema = kotxeaSemaforoan.get(matrikula);
				System.out.println(matrikula + " kotxea " + sema + " semaforoan izorratu da");
				semaforoak[sema].remove(matrikula);
			}
			else {
				String matrikula = gert.balioa;
				int sema = kotxeaSemaforoan.get(matrikula);
				System.out.println(matrikula + " kotxea konpondu da eta " + sema + " semaforoan jarri da");
				semaforoak[sema].add(matrikula);
			}
		}
		
	}

}
