with Datuak;
use Datuak;

procedure kalkulatu_max_eta_posizioa (
      L       : in     Lista;
      Max,
      Pos_Max :    out Integer ) is
   i:Integer:=0;
   Egungoa:Lista:=L;
   -- aurre:
   -- post: Max-ek L-ek duen baliorik handiena gordeko du eta Pos_max bere posizioa
   --       L hutsik balego Pos_Max-ek zero balioko du
begin
   Pos_Max:=0;
   Max:=0;
   while Egungoa /= null loop
      i:=i+1;
      if Max < Egungoa.Info then
         Max:=Egungoa.Info;
         Pos_Max:=i;
      end if;
      Egungoa:=Egungoa.Hurrengoa;
   end loop;

end kalkulatu_max_eta_posizioa;
