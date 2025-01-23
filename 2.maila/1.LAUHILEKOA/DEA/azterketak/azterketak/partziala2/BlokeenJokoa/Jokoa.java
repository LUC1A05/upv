package BlokeenJokoa;

import java.util.Random;
import java.util.Stack;

public class Jokoa {
	Stack<Bloke>[] taula; // pilen array-a
	public static int ZUTABEKOP = 7;
	
	public Jokoa() { // eraikitzailea
		Random r = new Random();
		String[] nora = {"l","r"};
		taula = (Stack<Bloke>[]) new Stack[ZUTABEKOP];
		for (int i = 0; i <= ZUTABEKOP - 1; i++) {
			taula[i] = new Stack<Bloke>();
			for (int j = 0; j < 3; j++) {
				taula[i].push(new Bloke(r.nextInt(3),nora[r.nextInt(nora.length)]));
			}
		}
	}
	public int jokatu() {
		boolean amaitu = false;
		int pos = 3;
		int ema = 0;
		while(!amaitu) {
			if(pos < 0 || pos > 6) {
				amaitu = true;
				ema = -1;
			}
			else if(taula[pos].isEmpty()) {
				amaitu = true;
			}
			else {
				Bloke bl = taula[pos].pop();
				ema += bl.puntuak;
				if(bl.norabidea.equals("l")) {
					pos -= bl.jauzia;
				}
				else {
					pos += bl.jauzia;
				}
			}
		}
		return ema;
	}
	public void printeatu() {
		for(int i = 0; i < 7; i++) {
			Bloke b1 = taula[i].pop();
			System.out.print(b1.puntuak + "p  "+ b1.norabidea + b1.jauzia + "       --->");
			Bloke b2 = taula[i].pop();
			System.out.print(b2.puntuak + "p  "+ b2.norabidea + b2.jauzia + "       --->");
			Bloke b3 = taula[i].pop();
			System.out.print(b3.puntuak + "p  "+ b3.norabidea + b3.jauzia + "       --->");
			taula[i].push(b3);
			taula[i].push(b2);
			taula[i].push(b1);
			System.out.println();
		}
	}
}
