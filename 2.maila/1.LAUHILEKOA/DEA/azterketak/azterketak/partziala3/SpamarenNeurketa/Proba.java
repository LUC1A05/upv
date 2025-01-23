package SpamarenNeurketa;

import java.util.ArrayList;

public class Proba {
	public static void main(String[] args) {
		Pertsona a = new Pertsona("A");
        Pertsona b = new Pertsona("B");
        Pertsona c = new Pertsona("C");
        Pertsona d = new Pertsona("D");
        Pertsona e = new Pertsona("E");
        Pertsona f = new Pertsona("F");
        Pertsona g = new Pertsona("G");

        // Configurando las relaciones de contacto
        a.kontaktuak.add(b);
        a.kontaktuak.add(c);
        b.kontaktuak.add(c);
        b.kontaktuak.add(d);
        c.kontaktuak.add(e);
        d.kontaktuak.add(f);
        e.kontaktuak.add(f);
        f.kontaktuak.add(g);
        g.kontaktuak.add(a); // Ciclo desde G a A
        g.kontaktuak.add(c); // Ciclo desde G a C

        // A envía un mensaje de spam inicialmente
        a.spamBidali();

        // Verificar la recepción del spam en cada persona
        System.out.println("Spam recibido por A: " + a.spamJasotakoak);
        System.out.println("Spam recibido por B: " + b.spamJasotakoak);
        System.out.println("Spam recibido por C: " + c.spamJasotakoak);
        System.out.println("Spam recibido por D: " + d.spamJasotakoak);
        System.out.println("Spam recibido por E: " + e.spamJasotakoak);
        System.out.println("Spam recibido por F: " + f.spamJasotakoak);
        System.out.println("Spam recibido por G: " + g.spamJasotakoak);
    }
}
