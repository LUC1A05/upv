package KoloreenJokoa;

import java.util.ArrayList;

public class ProbaKolorintzi {
	public static void main(String[]args) {
		ArrayList<Jokaldi> jokaldiak = new ArrayList<Jokaldi>();
		Jokaldi j1,j2,j3,j4,j5,j6,j7;
		j1 = new Jokaldi(2,2);
		j2 = new Jokaldi(2,2);
		j3 = new Jokaldi(2,2);
		j4 = new Jokaldi(2,1);
		j5 = new Jokaldi(1,4);
		j6 = new Jokaldi(1,2);
		j7 = new Jokaldi(1,3);
		
		jokaldiak.add(j1);
		jokaldiak.add(j2);
		jokaldiak.add(j3);
		jokaldiak.add(j4);
		jokaldiak.add(j5);
		jokaldiak.add(j6);
		jokaldiak.add(j7);
		
		Jokoa jo = new Jokoa();
		int ema = jo.jokoa(3, jokaldiak);
		System.out.println("irabazlea " + ema + " kolorea da.");
		
	}
}
