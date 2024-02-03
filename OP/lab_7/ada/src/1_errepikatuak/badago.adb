with def_datuak; use def_datuak;

function badago (
      N        : in     Integer;           
      L        : in     osokoen_zerrenda) 
  return Boolean is 
   -- aurrebaldintza: 
   -- post: emaitza TRUE da N Ln badago, FALSE bestela 
   aur:Boolean:=False;
      
begin
   for i in 1..L.zenbat loop
      if L.zenbakiak(i)=N then
         aur:=True;
         return aur;
      end if;
   end loop;
   return aur;
             
end badago;

