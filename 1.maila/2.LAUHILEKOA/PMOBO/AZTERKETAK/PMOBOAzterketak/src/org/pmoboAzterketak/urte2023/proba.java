package org.pmoboAzterketak.urte2023;

import java.util.Random;

public class proba {
    public static void main(String[] args) {
        BorrokalarienZerrenda borrokalarienZerrenda = BorrokalarienZerrenda.getBorrokalarienZerrenda();
        borrokalarienZerrenda.gehituBorrokalaria("    JonZ    ", 177, 87);
        borrokalarienZerrenda.gehituBorrokalaria("    Unai comepijas  ", 175, 30 );
        borrokalarienZerrenda.gehituBorrokalaria("    Urko no se ducha", 170, 30);
        borrokalarienZerrenda.gehituBorrokalaria("    Surya comunista", 180, 200);
        

        Txapelketa txapelketa = Txapelketa.getTxapelketa();
        txapelketa.borrokaKudeatu();

        txapelketa.lehenengoBorrokaBistaratu("    JonZ    ");
        txapelketa.lehenengoBorrokaBistaratu("    Unai comepijas  ");
        txapelketa.lehenengoBorrokaBistaratu("    Urko no se ducha");
        txapelketa.lehenengoBorrokaBistaratu("    Surya comunista");
    }
}
