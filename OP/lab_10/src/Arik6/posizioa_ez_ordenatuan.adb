with Datuak;
use Datuak;

with ada.text_io;
use ada.text_io;

function posizioa_ez_ordenatuan (
      L   : Lista;
      N : Integer )
  return Natural is
   -- aurre: Lista ez du zertan ordenatuta egon behar
   -- post: Num-en lehenengo agerpenaren posizioa bueltatu. Num listan ez balego bueltatu 0
   eran, pos:Natural:=0;
   badago:Boolean:=False;
   Egungoa:Lista:=L;
begin
   while Egungoa /= null and then not badago loop
      pos:=pos+1;
      if Egungoa.Info = N then
         eran:=pos;
         badago:=True;
      end if;
      Egungoa:=Egungoa.Hurrengoa;
   end loop;
   return eran;


end posizioa_ez_ordenatuan;


