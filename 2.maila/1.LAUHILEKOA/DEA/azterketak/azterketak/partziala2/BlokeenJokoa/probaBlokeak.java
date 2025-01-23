package BlokeenJokoa;

public class probaBlokeak {
	public static void main(String[]args) {
		boolean ama = false;
		int kont = 0;
		while(!ama) {
			Jokoa j = new Jokoa();
			j.printeatu();
			int i = j.jokatu();
			kont ++;
			System.out.println(kont + ". Emaitza: " + i);
			if(i != -1) {
				ama = true;
			}
		}
	}
}
