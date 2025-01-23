package AdierazpenAritmetikoa;

import java.util.Stack;

public class AdierazpenAritmetikoa {
	public double ebaluatu(String esp) {
		// Aurrebaldintza: Espresio aritmetikoa zuzena da.
		// Adierazpena GUZTIZ parentizatuta dago, hau da,
		// Eragile bakoitzeko, parentesiak daude
		// Eragile guztiak bitarrak dira (“X ERAGILE Y” motakoak)
		// Postbaldintza: emaitza adierazpenaren balioa da
		Stack<Character> eragileak = new Stack<Character>();
		Stack<Double> eragigaiak = new Stack<Double>();
		int luzera = esp.length();
		Double ema = 0.0;
		int i = 0;
		while(i < luzera) {
			if(esp.charAt(i) >= '0' && esp.charAt(i) <= '9') {
				int dec = 1;
				Double z = Double.parseDouble(esp.charAt(i) + "");
				i++;
				while(esp.charAt(i) >= '0' && esp.charAt(i) <= '9') {
					z = z * Math.pow(10, dec) + Double.parseDouble(esp.charAt(i) + "");
					dec ++;
					i ++;
				}
				eragigaiak.push(z);	
			}
			else if(esp.charAt(i) == '+' || esp.charAt(i) == '-'|| esp.charAt(i) == '*' || esp.charAt(i) == '/') {
				eragileak.push(esp.charAt(i));
				i++;
			}
			else if(esp.charAt(i) == ')') {
				if(!eragigaiak.isEmpty() && !eragileak.isEmpty()) {
					Double z1 = eragigaiak.pop();
					Double z2 = eragigaiak.pop();
					Character sim = eragileak.pop();
					if(sim == '+') {
						Double z = z1 + z2;
						eragigaiak.push(z);
					}
					else if(sim == '-') {
						Double z = z2 - z1;
						eragigaiak.push(z);
					}
					else if(sim == '*') {
						Double z = z2 * z1;
						eragigaiak.push(z);
					}
					else if(sim == '/') {
						Double z = z2 / z1;
						eragigaiak.push(z);
					}
				}
				i++;
			}
			else {
				i++;
			}
		}
		ema = eragigaiak.pop();
		return ema;
	}

}
