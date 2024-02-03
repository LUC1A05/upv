with Ada.Text_Io, Ada.Integer_Text_Io;
use Ada.Text_Io, Ada.Integer_Text_Io;

with def_datuak; use def_datuak;

procedure zerrenda_idatzi (L : in    osokoen_zerrenda ) is 
   --Pre:	  
   --Post:  L-ren balioak idatzi dira
   --          
begin
   for pos in 1..L.zenbat loop
      Put(L.zenbakiak(pos));
      if pos < L.zenbat then
         Put(",");
      end if;
   end loop;
   
end zerrenda_idatzi;

