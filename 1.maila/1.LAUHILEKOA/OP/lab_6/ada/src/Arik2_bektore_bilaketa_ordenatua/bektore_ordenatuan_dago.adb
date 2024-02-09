with bektoreak; 
use bektoreak;
with Ada.Text_IO;
use Ada.Text_IO;

function Bektore_Ordenatuan_dago (x:in integer; V:Osokoen_Bektorea) return Boolean is
   i:Integer;
   dago:Boolean;
   -- aurre: V bektoreak gutxienez elementu bat dauka (V'Last >= 1)
   -- eta elementuak gorako ordenetan ordenatuta daude
   --              V(i) <= V(i+1),      1 <= i < V'last				  
   -- post: emaitza True izango da N balioa V-n baldin badago, eta False bestela
   --       Algoritmoa eraginkorra da V ordenatuta dagoela aprobetxatuz


begin
   i:=1;
   dago:=False;

   loop exit when dago or i > V'Last;
      if V(i) = x then
         dago:=True;
      end if;
      i:=i+1;
   end loop;
   return dago;

end Bektore_Ordenatuan_dago;

