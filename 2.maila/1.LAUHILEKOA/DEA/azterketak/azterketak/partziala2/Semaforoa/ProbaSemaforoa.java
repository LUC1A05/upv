package Semaforoa;

import java.util.ArrayList;

public class ProbaSemaforoa {
	public static void main(String[] args) {
        TrafikoarenKudeaketa kudeaketa = new TrafikoarenKudeaketa();

        ArrayList<Gertaera> gertaerak = new ArrayList<>();
        gertaerak.add(new Gertaera('S', "M11111"));
        gertaerak.add(new Gertaera('S', "M22222"));
        gertaerak.add(new Gertaera('S', "M33333"));
        gertaerak.add(new Gertaera('B', "0"));
        gertaerak.add(new Gertaera('I', "M33333"));
        gertaerak.add(new Gertaera('K', "M33333"));
        gertaerak.add(new Gertaera('B', "1"));

        kudeaketa.trafikoaSimulatu(gertaerak);
    }
}
