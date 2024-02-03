with bektoreak; use bektoreak;

procedure ezabatu_hirugarren_elementua_ordenatuta (L: in out Osokoen_Zerrenda) is
   -- aurre: zerrendako elementuak ordenatuta daude
   -- post: zerrenda, hiru ego gehiago elementu badaude, hirugarren elementua ezabatu da 
   --       eta zerrendak ordena mantenduko du 
   pos:integer;
begin
   pos :=3;
   if L.Kont>=3 then
      loop exit when pos > L.kont-1;
         L.Zenbakiak(pos):=L.zenbakiak(pos+1);
         pos:=pos+1;
      end loop;
      L.kont:=L.kont-1;
   end if;
end Ezabatu_Hirugarren_Elementua_Ordenatuta;

