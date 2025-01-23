package Eskola;

import java.util.LinkedList;
import java.util.Queue;

public class Eskola {
	Queue<Queue<String>>ikaslea;
	public Eskola() {
		ikaslea = new LinkedList<Queue<String>>();
		for(int i = 0; i < 6; i++) {
			LinkedList<String> ikasleak = new LinkedList<String>();
			for(int j = 0; j < 4; j++) {
				ikasleak.add(i + 1 + "" + j + "");
			}
			ikaslea.add(ikasleak);
		}
	}
	public void opariakBanatu(Queue<String> opariak) {
		while(!opariak.isEmpty()) {
			String oparia = opariak.poll();
			Queue<String> ikasleak = ikaslea.poll();
			System.out.print(oparia + " oparia ");
			for(String ikasle : ikasleak) {
				System.out.print(ikasle + " ");
			}
			System.out.println();
			ikaslea.add(ikasleak);
		}
	}

}
