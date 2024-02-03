with Datuak;
use Datuak;

procedure txertatu_bukaeran (
      L   : in out Lista;
      Num : in     Integer ) is
   -- aurre:
   -- post: Num zenbakia L-ren hasieran txertatu da
   Berria:Lista;
begin
   if L = null then
      L:= new Nodo;
      L.Info:=Num;
      L.Hurrengoa:=null;
   else
      Berria:=L;
      while Berria.Hurrengoa /= null loop
         Berria:=Berria.Hurrengoa;
      end loop;
      Berria.Hurrengoa:= new Nodo;
      Berria.Hurrengoa.Info:= Num;
      Berria.Hurrengoa.Hurrengoa:= null;
   end if;


end txertatu_bukaeran;

