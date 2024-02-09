with Datuak, txertatu_nposizioan, txertatu_hasieran, luzera, ezabatu_lehenengo_agerpena, ada.Text_IO;
use Datuak, ada.Text_IO;

procedure n_aurrera (L: in out Lista; Pos: in Integer) is
   i, kont: Integer := 1;
   lag, berria, tmp: Lista;
begin
   lag := L;
   while i < Pos loop
      tmp := lag.Hurrengoa;
      txertatu_nposizioan(berria, lag.Info, i);
      ezabatu_lehenengo_agerpena(lag, lag.Info);
      lag := tmp;
      i := i + 1;
   end loop;

   while lag /= null loop
      tmp := lag.Hurrengoa;
      txertatu_nposizioan(berria, lag.Info, kont);
      ezabatu_lehenengo_agerpena(lag, lag.Info);
      lag := tmp;
      kont := kont + 1;
   end loop;
   L := berria;
end n_aurrera;
//nodo berriak sortzen dira, hori aldatu behar da.
