with Datuak, txertatu_hasieran, ada.Text_IO;
use Datuak, ada.Text_IO;
procedure txertatu_nposizioan (L: in out Lista ; Zen , Pos : in Integer) is

   i: integer:=1;
   Berria: Lista:=L;
   Berria2: Lista;
   dago:Boolean:=True;
Begin
   while i<pos and dago loop
      if Berria /= null then
        Berria2:=Berria;
        Berria:=Berria.Hurrengoa;
         i:=i+1;
      else
         dago:=False;
      end if;

   end loop;

   if dago then
      if Berria2=null then
         txertatu_hasieran(L, Zen);
      else
         Berria:=new Nodo;
         Berria.info:=Zen;
         Berria.Hurrengoa:=Berria2.Hurrengoa;
         Berria2.Hurrengoa:=Berria;
      end if;

   end if;
   if not dago then
      New_Line;
      Put_Line("ezin da zenbakia txertatu posizioa handiegia baita, beraz lista berdin jarraituko du:");
   end if;

end txertatu_nposizioan;
