with datuak; use datuak;

procedure ezabatu_agerpen_guztiak (
      L   : in out Lista;  
      Zen : in     Integer ) is 
   -- Aurre: 
   -- Post: L-tik Zen-en agerpen guztiak ezabatu dira
   Egungoa:Lista:=L;
   aurrekoa:lista;
begin
   
   while Egungoa /=null loop
      if Egungoa.info = Zen then
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


end ezabatu_agerpen_guztiak;

