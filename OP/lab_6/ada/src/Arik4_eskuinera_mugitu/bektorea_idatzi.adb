with Ada.Text_Io, Ada.Integer_Text_Io; use Ada.Text_Io, Ada.Integer_Text_Io;
with bektoreak; use bektoreak;

procedure Bektorea_idatzi (B : in Osokoen_Bektorea) is
   pos:integer:=1;
   --Aurre:	  
   --Post: B-ren balio guztiak pantailatik idazten ditu
   --          
begin
   for pos in 1..B'Last
   loop
      put(B(pos), width => 3);
   end loop;
   new_line;

end Bektorea_idatzi;

