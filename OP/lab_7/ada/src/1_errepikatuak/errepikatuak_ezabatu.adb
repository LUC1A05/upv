with def_datuak; use def_datuak;

with badago;

procedure errepikatuak_ezabatu (
      Lista_originala     : in     osokoen_zerrenda; 
      Lista_emaitza    :    out osokoen_zerrenda  ) is 
   -- aurre: 
   -- post: Lista_emaitza barnean Lista_Originala barneko zenbakiak izango ditu errepikapenik gabe
   pos:Integer:=1;
   
begin
   Lista_emaitza.zenbat:=0;
   for i in 1..Lista_originala.zenbat loop
      if badago(Lista_originala.zenbakiak(i), Lista_emaitza)=False then
         Lista_emaitza.zenbat:=Lista_emaitza.zenbat+1;
         Lista_emaitza.zenbakiak(pos):=Lista_originala.zenbakiak(i);
         pos := pos + 1;
      end if;
   end loop;
   


end errepikatuak_ezabatu;

