
with Datuak;
use Datuak;

with ada.text_io;
use ada.text_io;

procedure posizio_ordenatuan (   L   : Lista;
                                 N : Integer;
                                 dago: out Boolean;
				 Pos: out Natural) is
   -- aurre: L-ren balioak ordenatuta daude txikitan handira 
   -- post: dago True izango da Num zerrendan badago eta False 
   --       bestela. Pos Num-en lehenengo agerpenaren posizioa  
   --       izango da, Pos zerrendan badago, bestela Num sartu 
   --       beharko den posizioa izango da
   Egungoa: Lista:=L;
   i:Integer:=1;
begin
   dago:=False;
   Pos:=1;
   while Egungoa/=null and then N>Egungoa.Info and then not dago loop
      i:=i+1;
      pos:=i;
      Egungoa:=Egungoa.Hurrengoa;
   end loop;
   if Egungoa /= null and then N = Egungoa.Info then
      Dago:=True;
   end if;
   

end posizio_ordenatuan;


