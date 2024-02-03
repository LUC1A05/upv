with datuak, nan_posizioa, ezabatu_errepikatuak, ordenatu;
use datuak;

procedure ikasle_eta_tutoretza_totalak_lortu (Egutegia: in Info_Egutegia;
                                              zerrenda: out Ikasleen_tutoretza_zerrenda) is
   ---Aurre: Egutegia-k tutoretzetara joateen informazioa dauka (lauhilabeteko lanegun bakoitzeko, data eta tutoretzetara joandakoen NAN zenbakiak)
   ---Post: Zerrenda ORDENATUTA dago, ikasleak joandako tutoretza kopuru totalaren arabera

   --Ikasle bat egun berdinean behin baino gehiagotan joan bada tutoretzetara, behin bakarrik kontatuko zaio tutoretzetara joatea egun horretako guztien partez.
   i,j,pos:Integer:=1;
   data:Info_eguna;

begin
   zerrenda.Zenbat:=0;
   while i <= Egutegia.Zenbat_egun loop
      data:=Egutegia.Egunak(i);
      ezabatu_errepikatuak(data);
      j:= 1;
      while j <= data.Ikasle_kop loop
         pos:=nan_posizioa(zerrenda, data.NANak(j));
         if pos /= -1 then
            Zerrenda.Tutoretzak(pos).Tutoretzak_Guztira:=Zerrenda.Tutoretzak(pos).Tutoretzak_Guztira + 1;
         else
            zerrenda.Zenbat:=zerrenda.Zenbat+1;
            zerrenda.Tutoretzak(zerrenda.zenbat).NAN:=data.NANak(j);
            zerrenda.Tutoretzak(zerrenda.Zenbat).Tutoretzak_Guztira:=1;
         end if;
         j:= j+1;
      end loop;
      i:= i +1;
   end loop;
   ordenatu(zerrenda);
end ikasle_eta_tutoretza_totalak_lortu;

