with Ada.Text_IO, Ada.Integer_Text_IO, Datuak;
use Ada.Text_IO, Ada.Integer_Text_IO, Datuak;

procedure Idatzi (
      L : in     Lista ) is
      -- aurre:
      -- post:

   Egungoa : Lista;

begin
   Egungoa:=L;
   
   new_line;
   put("Zerrenda honakoa da: ");
   new_line;
   put(" <");   
   -- Osatu zati hau
   while (Egungoa /= null) loop
      Put(Egungoa.Info);
      Egungoa:=Egungoa.Hurrengoa;
   end loop;

   put(">");
   new_line(2);
end Idatzi;

