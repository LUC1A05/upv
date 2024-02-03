with bektoreak; use bektoreak;
procedure txertatu_posizioan (zen:integer; pos:Integer; L:in out Osokoen_Zerrenda) is
   -- aurre: txertatzeko posizioa zerrendaren elementu 
   --        kopurua +1 baino txikiagoa edo berdina izango da
   -- post: elementua posizioan txertatuta egongo da
   --       eta gainerako elementuak eskuinera mugituko dira
   aux:Integer;
begin
   L.Kont:=L.kont+1;
   L.Zenbakiak(L.kont):=zen;
   for i in pos..L.Kont loop
      aux:= L.Zenbakiak(i);
      L.Zenbakiak(i):=L.Zenbakiak(pos);
      L.Zenbakiak(pos):=aux;
   end loop;
   
end txertatu_posizioan;
