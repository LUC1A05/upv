package org.pmoboAzterketak.urte2023;

import java.util.Random;

public class proba {
    public static void main(String[] args) {
        BorrokalarienZerrenda borrokalarienZerrenda = BorrokalarienZerrenda.getBorrokalarienZerrenda();
        borrokalarienZerrenda.gehituBorrokalaria("Borrokalari1", 180, 75);
        borrokalarienZerrenda.gehituBorrokalaria("Borrokalari2", 175, 70);
        borrokalarienZerrenda.gehituBorrokalaria("Borrokalari3", 185, 80);

        Txapelketa txapelketa = Txapelketa.getTxapelketa();
        txapelketa.borrokaKudeatu();

        txapelketa.lehenengoBorrokaBistaratu("Borrokalari1");
        txapelketa.lehenengoBorrokaBistaratu("Borrokalari2");
        txapelketa.lehenengoBorrokaBistaratu("Borrokalari4");
    }
}