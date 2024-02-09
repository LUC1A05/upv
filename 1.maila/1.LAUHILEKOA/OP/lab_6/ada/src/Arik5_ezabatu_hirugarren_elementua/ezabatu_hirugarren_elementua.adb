with bektoreak; use bektoreak;

procedure Ezabatu_Hirugarren_elementua (L: in out Osokoen_Zerrenda) is
   -- aurre: elementuek ez dute zertan ordenatuta egon behar
   -- post: zerrendan hiru elementu edo gehiago bazeuden, hirugarren elementua 
   --       ezabatuta egongo da, eta zerrendak ez du zertan ordena berezirik 
   --       izan behar (ezta hasierako ordenarekin alderatuta)
begin
   if L.Kont >=3 then
      L.Zenbakiak(3):=L.Zenbakiak(L.Kont);
      L.kont:=L.Kont-1;
   end if;
end Ezabatu_Hirugarren_elementua;
