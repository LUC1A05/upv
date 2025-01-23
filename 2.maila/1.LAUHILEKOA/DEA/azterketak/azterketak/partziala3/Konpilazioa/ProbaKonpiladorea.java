package Konpilazioa;

import java.util.ArrayList;
import java.util.HashMap;

public class ProbaKonpiladorea {

	public static void main(String[] args) {
		HashMap<String, ArrayList<String>> hash = new HashMap<>();
		ArrayList<String>pr1 = new ArrayList<String>();
		pr1.add("PR2");
		pr1.add("PR3");
		hash.put("PR1", pr1);
		ArrayList<String>pr2 = new ArrayList<String>();
		pr2.add("PR5");
		pr2.add("PR3");
		hash.put("PR2", pr2);
		ArrayList<String>pr15 = new ArrayList<String>();
		pr15.add("PR5");
		pr15.add("PR14");
		hash.put("PR15", pr15);
		ArrayList<String>pr3 = new ArrayList<String>();
		pr3.add("PR5");
		hash.put("PR3", pr3);
		ArrayList<String>pr5 = new ArrayList<String>();
		pr5.add("PR2");
		hash.put("PR5", pr5);
		ArrayList<String>pr14 = new ArrayList<String>();
		pr14.add("PR25");
		hash.put("PR14", pr14);
		Konpiladorea kon = new Konpiladorea(hash);
		boolean ema = kon.zuzenaDa("PR14");
		System.out.println("PR14 zuzena da: " + ema);
		ema = kon.zuzenaDa("PR1");
		System.out.println("PR1 zuzena da: " + ema);

	}

}
