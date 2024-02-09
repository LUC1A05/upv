with datuak;
use datuak;

function nan_posizioa (Zerrenda: in Ikasleen_tutoretza_zerrenda; NAN: in Positive) return Integer is
   -- Aurre: Zerrendak ez du NAN errepikaturik
   -- Pos: NANa dagoen posizioa itzultzen du. Ez balego NAN hori, -1 itzuliko du
   pos:Integer:=1;
   badago:Boolean:=False;
begin
   while Zerrenda.Zenbat>=pos and then badago=False loop
      if Zerrenda.Tutoretzak(pos).NAN = NAN then
         badago:=True;
      else
         pos := pos+1;
      end if;
   end loop;
   if badago = False then
      pos := -1;
   end if;
   return pos;
end nan_posizioa;
