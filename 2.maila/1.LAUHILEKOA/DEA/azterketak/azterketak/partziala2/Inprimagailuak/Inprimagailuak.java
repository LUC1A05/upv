package Inprimagailuak;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Inprimagailuak {
	Queue<Integer>[] inprimagailuak = new LinkedList[6];

	public Inprimagailuak() {
		for(int i = 0; i <= 5; i ++) {
			inprimagailuak[i] = new LinkedList<Integer>();
		}
	}
	public void lanakProzesatu(ArrayList<Eskaera> lista) {
		boolean itz = false;
		for(Eskaera esk : lista) {
			if(esk.gertaeraMota == 'I') {
				itz = true;
				for(int i = 1; i <=5; i++) {
					while(!inprimagailuak[i].isEmpty()) {
						int lana = inprimagailuak[i].poll();
						inprimagailuak[0].add(lana);
					}
				}
			}
			else if(esk.gertaeraMota == 'P') {
				int lana = esk.lana;
				int inp = esk.inprimagailua;
				if(itz) {
					inprimagailuak[0].add(lana);
				}
				else {
					inprimagailuak[inp].add(lana);
				}
			}
			else if(esk.gertaeraMota == 'B') {
				int inp = esk.inprimagailua;
				inprimagailuak[inp].remove();
			}
			else {
				itz = false;
			}
		}
		for(int i = 0; i <= 5; i++) {
			System.out.print("Imp " + i + ": ");
			while(!inprimagailuak[i].isEmpty()) {
				int lana = inprimagailuak[i].poll();
				System.out.print(" " + lana);
			}
			System.out.println();
		}
	}
}
