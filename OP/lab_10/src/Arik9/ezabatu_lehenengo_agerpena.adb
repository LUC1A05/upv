with datuak, Ada.Text_Io;
use datuak, Ada.Text_Io;

procedure ezabatu_lehenengo_agerpena (
      L   : in out Lista;  
      Zen : in     Integer ) is 
   -- Aurre: 
   -- Post: L-tik Zen-en lehenengo agerpena ezabatu da. 
   --       Ez bada agertzen, mezu bat pantailaratuko du
   dago:Boolean:=False;
   Egungoa:Lista:=L;
   aurrekoa:lista;
begin
   while Egungoa /=null and then not dago loop
      if Egungoa.info = Zen then
         dago:=True;
         if aurrekoa=null then
            L:=L.hurrengoa;
         else
            aurrekoa.Hurrengoa:=Egungoa.Hurrengoa;
         end if;
      else
         aurrekoa:=Egungoa;
      end if;
      Egungoa:=Egungoa.Hurrengoa;
   end loop;
   
   if not dago then
      Put_Line("ez da zenbakia aurkitu");
   end if;



end ezabatu_lehenengo_agerpena;

